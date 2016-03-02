grammar interpreter;

start:  ((IMACRO|IPRINT) LCURLB code RCURLB)* EOF
        ;

//code:   (cnstrct)+
//        ;

code:   (lgcexpr|loop|assgn|cond)+
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

expr:   expr PLUS term
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

assgn:  lop ASGNOP rop;
lop:    IDENT
        |IDENT index
        |func;

rop:    lgcexpr
        |cond
        |loop
        ;

//conditional statement
cond:   SWITCHOP LCURLB cond1 RCURLB;

cond1:  mcase cond1
        |mdefault
        ;

mcase:   CASEOP LCURLB lgcexpr RCURLB LCURLB code RCURLB;

mdefault: DEFOP LCURLB code RCURLB;

//loop statement
loop:   loopcnd LCURLB code RCURLB;

loopcnd:lgcexpr IN LCURLB lgcexpr SMCOLON lgcexpr RCURLB;

func:   IDENT LPAREN args RPAREN;

args:   lgcexpr COMMA args
        |lgcexpr
        ;

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

OR:      '\\or';
AND:     '\\and';
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
DIV:     '/';


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

RTEXT: TEXT LCURLB (SPECSYM|CYRSYM|LTEXT)+ RCURLB;
SPECSYM: '\\'[a-zA-Z]* ;
CYRSYM: [\u0400-\u04FF];

//NEWLINE: ('\r'?'\n' | '\r');
WS: [ \t\r\n]+ -> skip;