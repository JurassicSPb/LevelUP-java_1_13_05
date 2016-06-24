package ru.levelp.model;

public class UserFriend extends User {
    private String phone;
    private String email;

    public UserFriend(String name, int age) {
        super(name, age);
    }

//    public UserFriend() {
//        super(); //вызов конструктора родительского класса
//    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
