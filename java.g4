grammar java;

// ---------------- PARSER ----------------

program : classe* EOF ;

classe : 'class' ID '{' membroClasse* '}' ;

membroClasse
    : metodo
    | variavel
    ;

// método (inclui void)
metodo
    : tipoMetodo ID '(' parametroLista? ')' bloco
    ;

tipoMetodo
    : tipo
    | 'void'
    ;

// variáveis (suporta múltiplas)
variavel
    : tipo declaracaoVariavel (',' declaracaoVariavel)* ';'
    ;

declaracaoVariavel
    : ID ('=' expressao)?
    ;

// parâmetros
parametroLista
    : parametro (',' parametro)*
    ;

parametro
    : tipo ID
    ;

// bloco
bloco
    : '{' instrucao* '}'
    ;

// ---------------- INSTRUÇÕES ----------------

instrucao
    : variavel
    | atribuicao ';'
    | chamadaMetodo ';'
    | printInstrucao ';'
    | retorno ';'
    | ifInstrucao
    | whileInstrucao
    | forInstrucao
    | bloco
    ;

// print built-in
printInstrucao
    : 'print' '(' argumentoLista? ')'
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

// for melhorado
forInstrucao
    : 'for' '(' (variavel | atribuicao)? ';' expressao? ';' atribuicao? ')' instrucao
    ;

// return
retorno
    : 'return' expressao?
    ;

// chamada método
chamadaMetodo
    : ID '(' argumentoLista? ')'
    ;

// argumentos
argumentoLista
    : expressao (',' expressao)*
    ;

// ---------------- EXPRESSÕES ----------------

expressao
    : expressaoLogica
    ;

expressaoLogica
    : expressaoLogica '||' expressaoAnd
    | expressaoAnd
    ;

expressaoAnd
    : expressaoAnd '&&' expressaoIgualdade
    | expressaoIgualdade
    ;

expressaoIgualdade
    : expressaoIgualdade ('==' | '!=') expressaoRelacional
    | expressaoRelacional
    ;

expressaoRelacional
    : expressaoRelacional ('<' | '>' | '<=' | '>=') expressaoAditiva
    | expressaoAditiva
    ;

expressaoAditiva
    : expressaoAditiva ('+' | '-') expressaoMultiplicativa
    | expressaoMultiplicativa
    ;

expressaoMultiplicativa
    : expressaoMultiplicativa ('*' | '/') expressaoUnaria
    | expressaoUnaria
    ;

expressaoUnaria
    : '!' expressaoUnaria
    | '-' expressaoUnaria
    | '++' ID
    | '--' ID
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
    | 'null'
    | 'this'
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

// comentários
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;

WS : [ \t\r\n]+ -> skip ;

