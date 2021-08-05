package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(age(5, 25));
        System.out.println(age(18, 35));
        System.out.println(age(16, 21));
        System.out.println(age(generateRandomAge(), 45));
        System.out.println(age(27, 31));
        System.out.println(generateRandomAge());
        System.out.println(generateRandomAge());
    }

    public static String age(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять1";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять3";
        } else return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}

/*#ДЗУрок2:

В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.

ДЗ на сообразительность:
Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge”
Дэдлайн 04.08.2021 23 59*/