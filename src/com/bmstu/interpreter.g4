grammar interpreter;

start:  ((IMACRO|IPRINT) openblk code closeblk)* EOF
        ;

openblk: LCURLB '\n'*;
closeblk: '\n'* RCURLB '\n'*;

code:   (lgcexpr';'|loop|assgn|cond)+
        ;
        
lgcexpr: lgcexpr OR lgcand  #orExpr
        | lgcand            #lgcandExpr
        ;

lgcand: lgcand AND cmpeq    #andExpr
        | cmpeq             #cmpeqExpr
        ;

//Logic expressions

cmpeq:  cmpeq EQ cmpr       #equalExpr
        |cmpeq NEQ cmpr     #notEqualExpr
        |cmpr               #cmprExpr
        ;
cmpr:   cmpr LE expr        #lessExpr
        |cmpr LEQ expr      #lessOrEqExpr
        |cmpr GE expr       #greaterExpr
        |cmpr GEQ expr      #greaterOrEqExpr
        |expr               #arithExpr
        ;

//Arithmetic expressions
expr:   expr PLUS term               #addExpr
        |expr MINUS term             #subExpr
        |term                        #termExpr
        ;

term:   term MUL factor              #mulExpr
        |term HMUL factor            #hiddenMul
        |term DIV factor             #divExpr
        |term VMUL factor            #vectorMul
        |factor                      #factorExpr
        ;

factor: MINUS pow                    #unaryMinus
        |INV LCURLB pow RCURLB       #inversionExpr
        |TRANSP LCURLB pow RCURLB    #transpExpr
        |BAR pow BAR                 #modOrDet
        |pow                         #pwrExpr
        ;

pow:    pow POWOP prim               #powExpr
        |prim                        #primExpr
        ;

prim:   func                          #funcInvoke
        |IDENT index?                 #id
        |LPAREN lgcexpr RPAREN index? #parExpr
        |literal                      #atom
        ;

index:  (AT LCURLB expr RCURLB)       #vecIndex
        |(AT LCURLB expr COMMA expr RCURLB) #matrIndex
        ;

//Vector definition
vect:   VECT'['lgcexpr (','lgcexpr)* ']';

//Matrix definition
matr:   MATR'['('['lgcexpr (','lgcexpr)*']')+']';

literal: NUM                        #doubleVal
        |vect                       #vectVal
        |matr                       #matrVal
        ;

//Assignment
assgn:  lop ASGNOP rop SMCOLON+;
lop:    IDENT
        |IDENT index
        |func;

rop:    lgcexpr
        |cond
        |loop
        ;

//conditional statement
cond:   SWITCHOP openblk cond1 closeblk;

cond1:  mcase cond1
        |mdefault
        ;

mcase:   CASEOP openblk lgcexpr closeblk openblk code closeblk;

mdefault: DEFOP openblk code closeblk;

//loop statement
loop:   loopcnd LCURLB code RCURLB;

loopcnd:lgcexpr IN LCURLB lgcexpr SMCOLON lgcexpr RCURLB;

//func call
func:   IDENT LPAREN args RPAREN;

args:   (lgcexpr COMMA)* lgcexpr
        ;
/********************************************************
*                    LEXER RULES                        *
*********************************************************/
VECT:    '\\vect';
MATR:    '\\matr';
IMACRO:  '\\imacro';
IPRINT:  '\\iprint';
SWITCHOP: '\\conditional';
CASEOP:   '\\case';
DEFOP:    '\\otherwise';
AT:      '\\at';
IN:      '\\in';

VMUL:   '\\times';
HMUL:   '\\hidemul';
INV:    '\\inverse';
TRANSP: '\\transpose';

TEXT: '\\text';

OR:      '\\lor';
AND:     '\\land';
GEQ:     '\\ge';
LEQ:     '\\le';
NEQ:     '\\ne';
EQ:      '=';
GE:      '>';
LE:      '<';
PLUS:    '+';
MINUS:   '-';
MUL:     '\\cdot';
POWOP:   '^';
DIV:     '\\div';
FRAC:    '\\frac';


LCURLB:  '{';
RCURLB:  '}';
LPAREN:  '(';
RPAREN:  ')';
LBRACK:  '[';
RBRACK:  ']';
BAR:     '|';
UNDERLN: '_';

ASGNOP:  ':=';

DOT:     '.';
COMMA:   ',';
SMCOLON: ';';

IDENT:  (LTEXT|RTEXT)(UNDERLN LCURLB (RTEXT|LTEXT) RCURLB)?;

NUM:[0-9]+'.'[0-9]+
    |[0-9]+
    ;

LTEXT: [a-zA-Z]+[a-zA-Z0-9]*;

RTEXT: TEXT LCURLB RSYM+ RCURLB;

RSYM: ~[ \t\r\n{}];

WS: [ \t\r\n]+ -> skip;