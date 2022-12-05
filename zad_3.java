import java.io.FileWriter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class zad_3 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите тип операции. 1 - сложение. \n2 - вычитание. \n3 - умножение. \n4 - деление. ");
        double oper = in.nextInt();

        System.out.print("Введите первое число: ");
        double num_1 = in.nextInt();

        System.out.print("Введите второе число: ");
        double num_2 = in.nextInt();

        double result = count_result(oper, num_1, num_2);
        
        double oper_2 = 1;
        System.out.println(result);
        while (oper_2 == 1) {
            System.out.print("Что нужно сделать с полученным результатом? \n1 - использовать для новой операции. \n2 - отменить операцию и посчитать заново. \n3. Завершить работу и вывести итог");
            oper_2 = in.nextInt();
                if (oper_2 == 1) {
                    System.out.println("Выберите тип операции. 1 - сложение. \n2 - вычитание. \n3 - умножение. \n4 - деление. ");
                    oper = in.nextInt();

                    System.out.print("Введите второе число: ");
                    num_2 = in.nextInt();

                    result = count_result(oper, result, num_2);
                }
                if (oper_2 == 2) {
                    System.out.println("Выберите тип операции. 1 - сложение. \n2 - вычитание. \n3 - умножение. \n4 - деление. ");
                    oper = in.nextInt();
            
                    System.out.print("Введите первое число: ");
                    num_1 = in.nextInt();
            
                    System.out.print("Введите второе число: ");
                    num_2 = in.nextInt();
            
                    result = count_result(oper, num_1, num_2);
                    oper_2 = 1;
                }
            }
        System.out.print("Результат равен: ");
        System.out.println(result);
        String time = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        time = time + ", Тип операции: " + Double.toString(oper) + ", Результат: " + Double.toString(result) + "\n";
        FileWriter log = new FileWriter("log4.txt", true);
        log.write(time);
        log.flush();
        log.close();
        in.close();
    }

    private static double count_result(double oper, double num_1, double num_2) {

        double result = 0; 
    
        if (oper == 1) {
            result = num_1 + num_2;
        }
        if (oper == 2) {
            result = num_1 - num_2;
        }
        if (oper == 3) {
            result = num_1 * num_2;
        }
        if (oper == 4) {
            result = num_1 / num_2;
        }
        return result;
    }
}