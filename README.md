ObbDSL - Obby Domain-Specific Language
=======================================

A DSL for defining Roblox obby elements, obstacles, and objects
using a concise, readable syntax.


ASSUMED DEPENDENCIES (already installed on grader's system)
------------------------------------------------------------
- Java (JDK 11 or higher)
- ANTLR 4 runtime JAR (antlr-4.13.2-complete.jar or compatible)


INSTALLING DEPENDENCIES
-----------------------
1. Install Java if not present:
       brew install openjdk
   Or download from https://adoptium.net

2. Download the ANTLR 4 complete JAR:
       curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar

   Place the JAR somewhere accessible (e.g., /usr/local/lib/) and set
   an environment variable for convenience:
       export ANTLR_JAR=/path/to/antlr-4.13.2-complete.jar


BUILD AND RUN
-------------
All commands should be run from the project root directory.

Step 1 — Generate the lexer/parser from the grammar files:
    java -jar $ANTLR_JAR -visitor OBBYLexer.g4 OBBYParser.g4

Step 2 — Compile all Java source files:
    javac -cp .:$ANTLR_JAR *.java

Step 3 — Run the driver with an .obby input file:
    java -cp .:$ANTLR_JAR Driver < test.obby

    Or use any other .obby file:
    java -cp .:$ANTLR_JAR Driver < test_io/StartPlatform.obby

The driver reads an .obby program from stdin and prints the ANTLR
parse tree to stdout.


EXAMPLE OUTPUT
--------------
Running:
    java -cp .:$ANTLR_JAR Driver < test.obby

Should produce a parse tree like:
    (program (folder ...) ...)


The idea is to 
Generate a .lua file in the same directory with a project file structure the compiled
Roblox Lua code. 

The test_io/ directory contains example .obby input file alongside the expected .lua output and project structure for reference.

I have only gotten around to creating an example for the Part. The killbrick and other objects aren't listed 
