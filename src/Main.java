import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
}