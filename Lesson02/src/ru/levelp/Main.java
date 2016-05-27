package ru.levelp;

/**
 * Created by vladimir on 27.05.16.
 */
public class Main {
    //Переменная, объявленная внутри определенных фигурных скобок, будет доступна в
    //этих фигурных скобках после ее объявления, а также во всех внутренних
    //фигурных скобках
    public static void main(String[] args) {
//        if (4 < 10) {
//            //код выполняется, если 4 < 10
//        }
//        i = 4; - не выйдет
//        int i = 0; //i,j,k
//        while (i < 10) {
//            //код выполняется, пока условие верно (повторяется)
//            //итерация - один проход цикла
//            System.out.println("Hello " + i);
//            i = i + 1;
//        }
        //код
        //for (инициализация счетчика; условие; операция, которая выполняется
        //                          в конце КАЖДОЙ итерации) { тело }
        //параметры 1 и 3 - не обязательны
        //for (; условие;) {}
//        for (int j = 0; j < 10; j = j + 1) {
//            System.out.println("Hello for "+j);
////            System.out.println("fdgjhdjkfg");
//            for (int k = 0; k < 10; k = k + 1) {
//                System.out.println("Hello for k "+k);
//            }
//        }
        /*
        Используя циклы вывести таблицу умножения
        1 2 3 4 5 6 7 8 9
        2 4 6 8 10 12 14 16 18
        3 6 9 12 15 18 21 24 27
        ...
        9 18 27...          81
         */

//        while (сервер_не_отвечает) {
//            пытаемся_пробиться
//        }

//        for (int j = 1; j < 10; j++) {
//            for (int k = 1; k < 10; k++) {
//                System.out.print(j * k + "\t");
//            }
//            System.out.println();
//        }

        int[] intArray = new int[10000];
        intArray[0] = 5456;
//        intArray[9] = 4435;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 200 - 350);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        /*
        Необходимо найти минимальное число в массиве и вывести его на экран
            min = -327
         */

        /*
        x = x + 10 -> x += 10
        x = x * 10 -> x *= 10
        - / ...

        x = x + 1 -> x++
                  -> ++x
        x = x - 1 -> x--
                  -> --x

        x++ != ++x
        x-- != --x

        Массивы a[20] и b[20] заполняете случайными числами в диапазоне от 0..7
        Создаете массив с[20]
        i-й элемент массива c должен быть равен
            количеству i-го элемента массива b в массиве a

         a[5] = {3,5,4,5,1}
         b[5] = {5,2,4,1,7}
         c[5] = {2,0,1,1,0}
         */

//        int rand = (int) (Math.random() * 100 - 50);
//        System.out.println("rand = " + rand);

//        String[] strArray = new String[20];
//        for (int i = 0; i < strArray.length; i++) {
//            strArray[i] = "Hello "+i;
////            System.out.println(strArray[i]);
//        }

//        intArray[10] = 55;

    }
}
