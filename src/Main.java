public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }
        System.out.println("Если возраст человека равен " + age + ", то вы совершеннолетний");
        int age1 = 12;
        if (age1 >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }
        System.out.println("Если возраст человека равен " + age1 + ", то вы не достигли совершеннолетия, нужно немного подождать");
        System.out.println( );

        System.out.println("Task 2");
        int t = 3;
        if (t < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("На улице" + t + " градусов, нужно надеть шапку");
        int t1 = 12;
        if (t1 < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("На улице" + t1 + " градусов, можно идти без шапки");
        System.out.println( );

        System.out.println("Task 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
        System.out.println( );

        System.out.println("Task 4");
        int age2 = 10;
        if (age2 > 2 && age2 < 6) {
            System.out.println("Нужно ходить в детский сад");
        }
        if (age2 > 7 && age2 < 17) {
            System.out.println("Нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Нужно ходить в университет");
        }
        if (age2 > 24) {
            System.out.println("Нужно ходить на работу");
        }
        System.out.println( );

        System.out.println("Task 5");
        int ageChildren = 11;
        if (ageChildren < 5) {
            System.out.println("Нельзя кататься на атракционе");
        }
        if (ageChildren > 5 && ageChildren < 14) {
                System.out.println("Можно кататься на атракционе в сопровождении взрослого");
            }
        if (ageChildren > 14) {
            System.out.println("Можно кататься без сопровождения");
            }
        System.out.println( );

        System.out.println("Task 6");
        int seat = 15;
        if (seat > 60 && seat <= 102) {
            System.out.println("Стоячее место");
        }
        if (seat > 102) {
            System.out.println("Мест нет");
        } else {
            System.out.println("Сидячее место");
        }
        System.out.println( );

        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && one > three) {
            System.out.println("1");
        } else {
            if (two > three) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}