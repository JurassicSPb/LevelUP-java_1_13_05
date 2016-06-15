package ru.levelp;

import ru.levelp.model.User;
import ru.levelp.model.UserFriend;

public class Main {
    public static void main(String[] args) {
//        Contact c = new Contact("Vasya","353453","ghfghfgdfg");
//        Contact c2 = new Contact("Dima", "79997774433", "blabla@mail.ru");
//        new Contact(22, "423345");
//        new Contact("Dima", 34);
//        new Contact();
//
//        int numbersCount = 0;
////        ...
//        numbersCount = 3243430;
//        c.setNumbersCount(3230); //c.numbersCount = 3230;
////        ...
//
////        c.setName("gdfgdfh");
//
//        System.out.println(c.getName());
//
////        c.string();

        User user = new User();

        user.getAge();
        user.getName();

        UserFriend friend = new UserFriend();

        friend.getPhone();
        friend.getEmail();
        friend.getName();
        friend.getAge();

        //У одного класса может быть сколько угодно наследников
        //У одного наследника может быть только один родитель
    }

    /*
    1) private, public, protected, default (нет модификатора)
        - особенности относительно пакетов
    2) Создать иерархию классов геометрических фигур (2D)
        Shape2D - в этом классе поля и методы общие для всех фигур
        MultiAngle - класс - родитель всех фигур с углами
        Rectangle
        Triangle
        Square
        Circle
        Oval
     */
}
