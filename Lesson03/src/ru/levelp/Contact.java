package ru.levelp;

/**
 * Created by vladimir on 31.05.16.
 */
public class Contact {
    //Поля класса - описывают состояние объекта
    String phone;
    String name;
    String email;

    //Поведение объекта - это методы

    public void print() {
        System.out.println(name + " " + phone + " " + email);
    }

    //Перед именем метода необходимо писать тип возвращаемого значения
    public String string() {
        String outputString = name + " " + phone + " " + email;
        return outputString;
    }

}
