import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);
        System.out.println("Выберите операцию: 1-калькулятор, 2-массив.");
        int c = 0;
        c = init.nextInt();
        if (c == 1)
        {new Task1();}
        else if (c == 2)
        {new Task2();}
        }
    }
