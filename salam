
//salam
//section 1

%%

//section 2

%public
%class lexic //name of the java class
%column // can retrieve current line using yycloumn()
%line // can retrieve current line using yyline()
%unicode //must thing
%type String
$state String //state STRING declares a lexical state STRING that can be used in the lexical rules part of the specification

/* line 20 to 25 copied from ref manual https://github.com/jflex-de/jflex/blob/master/docs/md/example.md */

//comments:
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

//whitespase and new line

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

//operators
operator=[\-\+\*\/\%]

//decimal
DecIntegerLiteral = 0 | [1-9][0-9]*

//alphabet
alphabet = [a-zA-z]

//id
identifier = {alphabet} ({alphabet} |{DecIntegerLiteral} | [_] )*


%%
//section 3
