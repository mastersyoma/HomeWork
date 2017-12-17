import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);
        System.out.println("Выберите операцию: 1-калькулятор, 2-массив.");
        int c = 0;
        c = init.nextInt();
        if (c == 1) {
            new Task1();
        } else if (c == 2) {
            new Task2();
        }
    }

    static class Task1 {
        Task1() {
            calc();
        }

        void calc() {

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
                case 2:
                    System.out.printf("%.4f", diff);
                    break;
                case 3:
                    System.out.printf("%.4f", multi);
                    break;
                case 4:
                    System.out.printf("%.4f", div);
                    break;
                default:
                    System.out.println("Ошибка! Пожалуйста выберите номер операции от 1 до 4.");
            }
        }
    }

    static class Task2 {
        Task2() {
            massive();
        }

        void massive() {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите длину массива: ");
            int size = input.nextInt();
            String array[] = new String[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = input.next();
            }
            int maxWord = array[0].length();
            int s = 0;
            System.out.print("Самое длинное слово из массива:");
            for (int i = 0; i < size; i++) {
                if (array[i].length() > maxWord) {
                    s = i;
                    maxWord = array[i].length();
                }
            }
            System.out.println(array[s]);
        }
    }
}

