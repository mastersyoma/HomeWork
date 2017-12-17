import java.util.ArrayList;
import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Давайте соберем подарок на Новый Год!");
        System.out.println("Нажмите 1, чтобы добавить Мармелад.");
        System.out.println("Нажмите 2, чтобы добавить Зефир.");
        System.out.println("Нажмите 3, чтобы добавить Медовые соты.");
        System.out.println("Нажмите f, чтобы закончить подготовку подарка.");

        ArrayList<Candy> candyList = new ArrayList<>();

        int jbCount = 0, mmCount = 0, hcCount = 0;
        boolean isNotFinished = true;
        do {
            switch (scanner.next()) {
                case "1":
                    candyList.add(new JellyBean());
                    jbCount++;
                    System.out.println("Добавили Мармелад.");
                    break;

                case "2":
                    candyList.add(new Marshmallow());
                    mmCount++;
                    System.out.println("Добавили Зефир.");
                    break;

                case "3":
                    candyList.add(new Honeycomb());
                    hcCount++;
                    System.out.println("Добавили Медовые соты.");
                    break;

                case "f":
                    isNotFinished = false;
                    break;

                default:
                    System.out.println("У нас таких сладостей нет!");
                    break;

            }
        } while (isNotFinished);

        double sumWeight = 0;
        double sumPrice = 0;
        for (Candy candy : candyList) {
            sumWeight += candy.getWeight();
            sumPrice += candy.getPrice();
        }

        System.out.println("\nФормирование подарка завершено!\n");
        System.out.println("\nИтого:\n" + jbCount + " шт. Мармелада.\n"
                + mmCount + " шт. Зефира.\n"
                + hcCount + " шт. Медовых сот.");
        System.out.println("\nВес подарка: " + sumWeight + " г.");
        System.out.println("Стоимость подарка: " + sumPrice + " руб.");

    }
}

/**
 * Сладость "Медовые соты"
 */

class Honeycomb extends Candy {

    Honeycomb() {

    }

    @Override
    String getTranslatedName() {
        return "Медовые соты";
    }

    @Override
    double getWeight() {
        return 1000;
    }

    @Override
    double getPrice() {
        return 300;
    }
}

/**
 * Сладость "Мармелад"
 */

class JellyBean extends Candy {

    JellyBean() {

    }

    @Override
    String getTranslatedName() {
        return "Мармелад";
    }

    @Override
    double getWeight() {
        return 250;
    }

    @Override
    double getPrice() {
        return 50;
    }
}

/**
 * Сладость "Зефир"
 */

class Marshmallow extends Candy {

    Marshmallow() {

    }

    @Override
    String getTranslatedName() {
        return "Зефир";
    }

    @Override
    double getWeight() {
        return 100;
    }

    @Override
    double getPrice() {
        return 30;
    }
}

/**
 * Абстрактный класс "Сладость"
 */

abstract class Candy {

    //    Русское название
    abstract String getTranslatedName();

    //    Вес в граммах
    abstract double getWeight();

    //    Цена в рублях
    abstract double getPrice();
}
