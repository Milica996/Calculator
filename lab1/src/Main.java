import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                String s1 = in.nextLine();
                String s = s1.replace(",", " ");
                ExpressionParser n = new ExpressionParser();
                List<String> expression = n.parse(s);
                boolean flag = n.flag;
                if (flag) {
                    for (String x : expression) System.out.print(x + " ");   //Вывод выражения введенного.
                    System.out.println();
                    String str = Double.toString(Ideone.calc(expression));
                    if (str.equals("Infinity"))
                        System.out.println("Error. Division by zero.");
                    else
                        System.out.println(Ideone.calc(expression));
                } else {
                    n.flag = true;
                    System.out.println("Please enter a valid expression.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid expression.");
            } catch (NoSuchElementException e) {
                System.out.println("Goodbye!");
                break;
            }
        }

    }
}
