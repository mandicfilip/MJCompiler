# MJCompiler
Implementation of a compiler for Microjava programming language, level B. 

This is also a Univerity project on a Software Engineering Department's fourth year course at the School of Electrical Engineering from University of Belgrade.

B level Microjava has elements of a procedural programming languages, such as functions, loops and if statements. 
Language supports basic data types(int, char, bool), array types and enumeration types.

# Tools

JFlex library was used to generate lexer(Yylex class). Specification for JFlex can be found in directory spec, file mjlexer.flex. 

Cup library was used to generate parser. Cup generates sym and MJParser classes using Yylex class and specification(directory spec, file mjparser.cup).

In semantic analysis and code generation library SymbolTable was used. 

In code generation library mj-runtime was used as buffer for generated code. This library also has classes Run and Disasm, which can run and print generated code.

# Usage

build.xml Ant file is used to simplify usage of libraries for parser generation, and the usage of compiler itself. 

Yylex class can be generated running lexerGen target in build.xml.

Parser can be generated by running repackage target.

To run the compiler, user should run Compiler class. Input and output files are expected as program arguments.

To see generated binary code in text format, user can run disasm target in ant build.xml or call directly disasm class in mj-runtime with following command:

```sh
$ java -cp lib\mj-runtime.jar rs.etf.pp1.mj.runtime.disasm <binary_file> 
```

Running generated binary can be done by starting runObj target in Ant script. Another way to do that may be to run class Run in mj-runtime from command line.
Second way is recommended if program takes input from standard input. Following command will run class Run from mj-runtime: 

```sh
$ java -cp lib\mj-runtime.jar rs.etf.pp1.mj.runtime.Run <binary_file> [-debag] 
```
