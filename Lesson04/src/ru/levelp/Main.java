package ru.levelp;

/**
 * Created by vladimir on 07.06.16.
 */
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int min = math.min(3, 4); //должно совпадать количество аргументов и типы
        System.out.println("min = " + min);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }

        System.out.println(math.sum(array));

        array = math.sort(array, false);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        sqrt log ln pow, sin, cos, tan

    }

    /*
    1) Сортировка по полным именам
    2) Методы в классе MathOperations
     */
}
