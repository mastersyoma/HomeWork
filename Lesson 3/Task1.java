import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1.Сумма\n" +
                        "2.Разность\n" +
                        "3.Умножение\n" +
                        "4.Деление\n" +
                        "Введите номер операции:");
        int x;
        x = scanner.nextInt();
        System.out.println("Первое число: ");
        double a;
        a = scanner.nextInt();
        System.out.println("Второе число: ");
        double b;
        b = scanner.nextInt();


        System.out.print("Ответ:");
        switch (x) {
            case 1:
                System.out.printf("%.4f",new Sum().getSum(a,b));
                break;
            case 2:
                System.out.printf("%.4f",new Sub().getSub(a,b));
                break;
            case 3:
                System.out.printf("%.4f",new Multi().getMulti(a,b));
                break;
            case 4:
                System.out.printf("%.4f",new Div().getDiv(a,b));
                break;
            default:
                System.out.println("Ошибка! Пожалуйста выберите номер операции от 1 до 4.");
        }
    }
}


class Sum  {
    Sum() {}
    double getSum(double a, double b) {
        return a + b;
    }
}

class Sub {
    Sub() {

    }

    public double getSub(double a, double b) {
        return a - b;
    }
}

class Multi {
    Multi() {

    }

    public double getMulti(double a, double b) {
        return a * b;
    }
}

class Div {
    Div() {

    }

    double getDiv(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        } else {
            return a / b;
        }
    }

}
