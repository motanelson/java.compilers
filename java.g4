grammar java;

// ---------------- PARSER ----------------

program : classe* EOF ;

classe : 'class' ID '{' membroClasse* '}' ;

membroClasse
    : metodo
    | variavel
    ;

metodo
    : tipo ID '(' parametroLista? ')' bloco
    ;

variavel
    : tipo ID ('=' expressao)? ';'
    ;

parametroLista
    : parametro (',' parametro)*
    ;

parametro
    : tipo ID
    ;

bloco
    : '{' instrucao* '}'
    ;

// ---------------- INSTRUÇÕES ----------------

instrucao
    : variavel
    | atribuicao ';'
    | chamadaMetodo ';'
    | retorno ';'
    | ifInstrucao
    | whileInstrucao
    | forInstrucao
    | bloco
    ;

// atribuição
atribuicao
    : ID '=' expressao
    ;

// if
ifInstrucao
    : 'if' '(' expressao ')' instrucao ('else' instrucao)?
    ;

// while
whileInstrucao
    : 'while' '(' expressao ')' instrucao
    ;

// for
forInstrucao
    : 'for' '(' atribuicao? ';' expressao? ';' atribuicao? ')' instrucao
    ;

// return
retorno
    : 'return' expressao?
    ;

// chamada método
chamadaMetodo
    : ID '(' argumentoLista? ')'
    ;

argumentoLista
    : expressao (',' expressao)*
    ;

// ---------------- EXPRESSÕES (COM PRECEDÊNCIA) ----------------

// nível mais alto
expressao
    : expressaoLogica
    ;

// || 
expressaoLogica
    : expressaoLogica '||' expressaoAnd
    | expressaoAnd
    ;

// &&
expressaoAnd
    : expressaoAnd '&&' expressaoIgualdade
    | expressaoIgualdade
    ;

// == !=
expressaoIgualdade
    : expressaoIgualdade ('==' | '!=') expressaoRelacional
    | expressaoRelacional
    ;

// < > <= >=
expressaoRelacional
    : expressaoRelacional ('<' | '>' | '<=' | '>=') expressaoAditiva
    | expressaoAditiva
    ;

// + -
expressaoAditiva
    : expressaoAditiva ('+' | '-') expressaoMultiplicativa
    | expressaoMultiplicativa
    ;

// * /
expressaoMultiplicativa
    : expressaoMultiplicativa ('*' | '/') expressaoUnaria
    | expressaoUnaria
    ;

// ! -
expressaoUnaria
    : '!' expressaoUnaria
    | '-' expressaoUnaria
    | primario
    ;

// base
primario
    : chamadaMetodo
    | ID
    | NUMERO
    | STRING
    | 'true'
    | 'false'
    | '(' expressao ')'
    ;

// ---------------- TIPOS ----------------

tipo
    : 'int'
    | 'float'
    | 'boolean'
    | 'String'
    | ID
    ;

// ---------------- LEXER ----------------

ID : [a-zA-Z_][a-zA-Z_0-9]* ;

NUMERO : [0-9]+ ('.' [0-9]+)? ;

STRING : '"' (~["\\] | '\\' .)* '"' ;

WS : [ \t\r\n]+ -> skip ;