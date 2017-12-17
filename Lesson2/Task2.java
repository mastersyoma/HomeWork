import java.util.Scanner;
public class Task2 {
    Task2(){massive();}
     static void massive() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        String array[] = new String[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.next();}
        int maxWord = array[0].length();
        int s = 0;
        System.out.print ("Самое длинное слово из массива:");
        for (int i = 0; i < size; i++) {
            if (array[i].length() > maxWord){
                s = i;
                maxWord = array[i].length();}
            }
            System.out.println(array[s]);
        }
    }
