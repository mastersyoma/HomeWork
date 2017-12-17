package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Task4 {

    public static void main(String[] args) {
        int array[] = new int[20];

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-10, 10);
            System.out.print(array[i] + " ");
        }

        int
                minValue = 0, //Минимальное положительное значение
                maxValue = 0, //Максимальное отрицательное значение
                minPos = 0, //Позиция минимального отрицательного значения
                maxPos = 0; //Позиция максимального положительного значения

//        Находим первый положительный элемент
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                minValue = array[i];
                minPos = i;
                break;
            }
        }

//        Находим первый отрицательный элемент
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                maxValue = array[i];
                maxPos = i;
                break;
            }
        }

//        Находим минимальный положительный и максимальный отрицательный элементы
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] < minValue) {
                    minValue = array[i];
                    minPos = i;
                }
            }

            if (array[i] < 0) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                    maxPos = i;
                }
            }
        }

        System.out.println("\nMaxValue -> " + maxValue + " Position -> " + maxPos);
        System.out.println("MinValue -> " + minValue + " Position -> " + minPos);

        array[maxPos] = minValue;
        array[minPos] = maxValue;

        System.out.println("\nArray after replacing: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
