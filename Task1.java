import java.util.Scanner;
/**Калькулятор
 * @author Semen Sokurenko, Aplana
 * Выполняет 4 операции с числами на выбор: сложение, вычитание, умножение, деление.
 */

public class Task1 {
    Task1(){calc();}

    static void calc() {

        Scanner scanner = new Scanner(System.in); // используем scanner для считыванния вводимых переменных;
        System.out.println(
                        "1.Сумма\n" +
                        "2.Разность\n" +
                        "3.Умножение\n" +
                        "4.Деление\n" +
                        "Введите номер операции:");
        int x;
        x = scanner.nextInt();
        System.out.println("Первое число: ");
        double i;
        i = scanner.nextInt();
        System.out.println("Второе число: ");
        double k;
        k = scanner.nextInt();

        /** Объявление операций */
        double sum = i + k;
        double diff = i - k;
        double multi = i * k;
        double div = i / k;

        System.out.printf("Ответ:");
        /**@param switch определение операции**/
        switch (x) {
            case 1:
                System.out.printf("%.4f", sum);
                break;
            case 2:  System.out.printf("%.4f", diff);
                break;
            case 3:  System.out.printf("%.4f", multi);
                break;
            case 4:  System.out.printf("%.4f", div);
                break;
            default: System.out.println("Ошибка! Пожалуйста выберите номер операции от 1 до 4.");

        }

    }
}