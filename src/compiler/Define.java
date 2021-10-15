package compiler;

public class Define {

        public static void main(String args[]) {
            String str = "define SEMICOLON ;\n" +
                    "define FOR100 for(i = 0; i < 100; i += 1)\n" +
                    "\n" +
                    "FOR100\n" +
                    "Print(i)SEMICOLON\n";

            String str2 = str.replaceAll("SEMICOLON", ";");
            System.out.println(str2);
        }
        public static java.io.File REPLACE(java.io.File inputFile)
        {

            return inputFile;
        }

}
//package compiler;
//
//        import java.io.*;
//        import java.util.*;
//
//public class Main {
//
//    public static String run(java.io.File inputFile) throws Exception {
//        StringBuilder str = new StringBuilder();
//
//        Lexer scanner = new Lexer(new FileReader(inputFile));
//        while (true) {
//            str.append(
//                    scanner.text.toString());
//
//        }
//    }
//        return str.toString();
//}