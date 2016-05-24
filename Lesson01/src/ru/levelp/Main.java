package ru.levelp;

/**
 * Created by vladimir on 24.05.16.
 */
public class Main {
    public static void main(String[] args) {

        //CamelCase
        //Переменные и методы именуются с маленькой буквы
        //каждое следующее слово в имени - с большой
        //int numberOfStudents;
        //Классы с большой буквы, а далее аналогично переменным

        int intVar; //объявление переменной
        intVar = 5; //инициализация (первое заполнение переменной)
        intVar = 64; //присваивание

        double dVar = 3.14;
        //float - тоже дробный, но короче (меньше знаков после запятой)
        float fVar = 3.14f;

        dVar = 4;

        boolean bVar = true;

//        String strVar = {'H','e','l','l','o'};

        byte byteVar = 23;

        short shortVar = 54;

        long lVar = 3453453;

        char cVar = 'A';

        System.out.println(cVar);

        int amount = 57435;

        int thousand = amount / 1000;

        int rub = amount % 1000;

        String result = thousand + " тысяч " + rub + " рублей";
        System.out.println(result);

        result = 5 + 3 + "";
        System.out.println(result);

//        5/3 = 1
//         5/3.0 = 1.(6)

//        int a = 3;
//        int b = 7;
//
//        double x;
//
//        x = (double) (-b) / a;
//
//        System.out.println("x = " + x);

//        int c = 6;

//        c = (double) c;
//        System.out.println("c = "+c);

        boolean bool1 = true;
        boolean bool2 = false;

        boolean boolResult = (bool1 == bool2); //==, !=, !

        //Логическое И / умножение / коньюнкция
        //Возвращает true, если слева true И справа true. В других случаях false
        boolResult = bool1 && (bool2 == boolResult);
        boolResult = bool1 && (bool2 == boolResult);
        //если слева от && false, значит забиваем на все, что справа
        boolResult = (bool1 == boolResult) && (bool2 && bool1 == bool2 || boolResult);

        //Логическое ИЛИ / сложение / дизъюнкция
        //Возвращает true, если слева true ИЛИ справа true. В других случаях false
        //если слева от || true, значит забиваем на все, что справа,
        //потому что результат бует true
        boolResult = (bool1 == boolResult) || (bool2 && bool1 == bool2 || boolResult);

        //> < <= >=

        //==, != - применяются как к числам, так и к boolean
        //> < <= >= - применяются только к числам
        //!, &&, || - применяются только к типу boolean

        //!bool1        !(bool1 == bool2)

//        if (логическое_выражение/условие) {
//            //код
//            //выполняется, если условие == true
//            if (еще_условие) {
//
//            } else {
//
//            }
//        } else { //не обязательно писать
//            //выполнится, если не выполнится код в if (если условие == false)
//        }

        /*
        Задача:
        имеется 3 целочисленных переменных: a, b, c
        которые равны произвольным числам

        необходимо, чтобы программа вывела минимальное число
         */

        int a = 1;
        int b = 1;
        int c = 3;
        int d = 23;
        int min;

        min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }

//        if (a <= b && a <= c) {
//            min = a;
//        } else if (b <= a && b <= c) {
//            min = b;
//        } else {
//            min = c;
//        }

        System.out.println("min = " + min);

        //Сравнение дробных чисел
        double x = 3.14;
        double y = 2.72;

        if (x < y) { //так нельзя
        }

        double hundred = 100.0/3 + 100.0/3 + 100.0/3 + 100.0/3 + 100.0/3 + 100.0/3;
        System.out.println(hundred);

        double eps = 0.1;

        if (Math.abs(100.0-100.2) < eps) {
            System.out.println("Считаем, что равны");
        }

    }

    /*
    Домашнее задание:
    1) Программа решения квадратных уравнений.
        Коэффициенты a b c вводит пользователь с клавиатуры
        ax^2 + bx + c = 0
        необходимо найти корни уравнения
        * комплексные корни
    2) Есть 3 целых числа
        заполняются с клавиатуры
        Необходимо, чтобы эти числа вывелись в порядке возрастания

        Пример:
            7
            3
            5
            Результат: 3 5 7

         Используете только if-else, логические операции, дополнительные переменные
         НЕЛЬЗЯ:
         1) Пользоваться массивами и коллекциями (то есть только переменные)
         2) Использовать средства библиотеки Java для сортировки
         3) Integer.MAX_VALUE / MIN_VALUE
     */
}
