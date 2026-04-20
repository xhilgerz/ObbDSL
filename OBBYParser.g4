parser grammar OBBYParser;
options { tokenVocab = OBBYLexer; }

program   : PROJECT QUOTE NAME QUOTE O_BRACKET folder* C_BRACKET ;

folder    : FOLDER QUOTE NAME QUOTE O_BRACKET item* C_BRACKET ;

item      : PART QUOTE NAME QUOTE O_BRACKET property* C_BRACKET
          | K_BRICK QUOTE NAME QUOTE O_BRACKET property* C_BRACKET
          | M_PLATFROM QUOTE NAME QUOTE O_BRACKET property* C_BRACKET
          | C_POINT QUOTE NAME QUOTE O_BRACKET property* C_BRACKET 
          ;

property  : SIZE INT INT INT
          | COLOR num num num
          | MATERIAL NAME
          | ANCHORED NAME
          | SPEED INT
          | DISTANCE INT

          ;

num : INT
    | DOUBLE
    ;