package compiler;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) throws IOException {
        String path = new Scanner(System.in).next();
        lexic scanner = new lexic(new FileReader(path));
        String item;
        while (!scanner.yyatEOF() ) {
            item = scanner.yylex();
            if (item!=null)System.out.println(item);
        }

    }
    public static String run(java.io.File inputFile) throws Exception {
        StringBuilder str = new StringBuilder();

        lexic scanner = new lexic(new FileReader(inputFile));
        while (!scanner.yyatEOF() ) {
            str.append(
                    scanner.yylex().toString());
        }
        return str.toString();

    }

}

//public class Main {
//

//        return str.toString();
//}