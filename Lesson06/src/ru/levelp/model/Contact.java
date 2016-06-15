package ru.levelp.model;

/*
private - доступ к полю/методу возможен только внутри класса,
    в котором создано поле/метод
public - противоположен private, то есть разрешает доступ извне
 */
public class Contact {
    private String name;
    private String phone;
    private String email;
    private int age;
    private int numbersCount;

    //Конструктор - это метод, который вызывается единственный раз при создании объекта
    //Конструктор именуется как класс, в котором он создается
    //У конструктора нет и не может быть возвращаемого значения
    public Contact(String name) {
        this.name = name;
    }

    //Конструктор по-умолчанию
    public Contact() {
//        this.id = (int) (Math.random()*100000);
    }

//    public Contact(String phone) {
//        this.name = name;
//    }

    public Contact(int age) {
        this.age = age;
    }

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Contact(int age, String phone) {
        this.phone = phone;
        this.age = age;
    }

    /*
    Полиморфизм (перегрузка)
    Условия перегрузки методов:
    1) Количество параметров разное
    2) Разные типы параметров
    3) Порядок типов
     */
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void print() {
        System.out.println(string());
//        numbersCount = 3454;
//
//        String name = "Dima";
//
//        send(name);
//
//        this.name
    }

    private String string() {
        return name + " " + phone + " " + email;
    }

    //Сеттер
    public void setNumbersCount(int count) {
        numbersCount = count;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Геттер
    public String getName() {
        return name;
    }

}