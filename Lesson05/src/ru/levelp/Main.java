package ru.levelp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by vladimir on 10.06.16.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");

        list.add("World");
        list.add(1, "!!!!!");
        list.set(1, "?????");
        list.remove(1);
        list.clear(); //очищает всю коллекцию

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //array[i]
        }

        ArrayList<Integer> intList = new ArrayList<Integer>();
        int x = 5;
        intList.add(x);
        intList.add(10);

        Integer y = null;
//        Integer.MAX_VALUE - максимальное число типа int

        //Double Character Byte Boolean Integer

        //Разобраться с принципом работы связных списков
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        //Коллекции ...List хранят элементы упорядоченно

        //Коллекции Hash... (в большинстве) не хранят элементы упорядоченно
        //Коллекции ...Set - это множества (нет повторяющихся элементов)
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(10);
        set.add(5);
        set.add(10);

        System.out.println("set size = " + set.size());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("DaysInYear", 365);
        map.put("DaysInWeek", 7);
        map.put("DaysInWeek", 8);

        System.out.println("map size = "+map.size());
        System.out.println(map.get("wrong"));
    }

    /*
    LinkedList
    +
    Phone Book
    Menu:
    1) Add contact
    2) Show all contacts
    3) Delete contact (by name)
    4) Exit

    1 - Предлагаем ввести имя, телефон, email
        Создаем контакт с этими полями
        Добавляем контакт в коллекцию
    2 - Вывод всех контактов на экран
    3 - Пользователь вводит имя -> контакт с этим именем удаляется
    4 - Выход из программы
     */
}
