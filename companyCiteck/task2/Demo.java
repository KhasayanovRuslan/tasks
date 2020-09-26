//написать алгоритм проверки корректности регулярного выражения,
// которое включает [,],(,)
//т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно

package companyCiteck.task2;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String input;
        while(true) {
            System.out.print("Введите строку, содержащую разделители: ");
            System.out.flush();
            input = getString();
            if( input.equals("") )
                break;

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
