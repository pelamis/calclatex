grammar interpreter;

start:  ((IMACRO|IPRINT) openblk code closeblk)* EOF
        ;

openblk: LCURLB '\n'*;
closeblk: '\n'* RCURLB '\n'*;

code:   (lgcexpr';'|loop|assgn|cond)+
        ;
        
lgcexpr: lgcexpr OR lgcand
        | lgcand
        ;

lgcand: lgcand AND cmpeq
        | cmpeq
        ;

cmpeq:  cmpeq EQ cmpr
        |cmpeq NEQ cmpr
        |cmpr
        ;
cmpr:   cmpr LE expr
        |cmpr LEQ expr
        |cmpr GE expr
        |cmpr GEQ expr
        |expr
        ;

expr:   expr'+'term
        |expr MINUS term
        |term
        ;

term:   term MUL factor
        |term HMUL factor
        |term DIV factor
        |term VMUL factor
        |factor
        ;

factor: MINUS pow
        |INV LCURLB pow RCURLB
        |TRANSP LCURLB pow RCURLB
        |BAR pow BAR
        |pow
        ;

pow:    pow POWOP prim
        |prim
        ;

prim:   func
        |IDENT index?
        |LPAREN lgcexpr RPAREN index?
        |literal
        ;

index:  (AT LCURLB expr RCURLB)
        |(AT LCURLB expr COMMA expr RCURLB)
        ;

vect:   VECT'['lgcexpr (','lgcexpr)* ']';

matr:   MATR'['('['lgcexpr (','lgcexpr)*']')+']';

literal: NUM
        |vect
        |matr
        ;

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
NEQ:     '\\neq';
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