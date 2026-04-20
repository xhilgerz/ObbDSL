lexer grammar OBBYLexer;

PROJECT : 'project';

FOLDER : 'folder';

PART   : 'part' ;

K_BRICK : 'kill_brick';

M_PLATFROM : 'moving_platform';

C_POINT : 'checkpoint';

QUOTE  : '"' ;
NAME   : [a-zA-Z_]+[0-9]* ;
WS     : [ \t\r\n]+ -> skip ;
INT : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;

O_BRACKET : '{';
C_BRACKET : '}';

SIZE : 'size:';
MATERIAL : 'material:';
COLOR : 'color:';
ANCHORED : 'anchored:';
SPEED : 'speed:';
DISTANCE : 'distance:';


