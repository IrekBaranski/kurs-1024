package com.company;

public class User {

    int ID = 0;
    String name;
    String login;
    String password;
    String email;
    int age;
    int level;

    public User(){

        name = "podana nazwa użytkownika";
        login = "login użytkownika";
        password = "podane hasło";
        email = "podany adres mailowy";
        age = 0;
        level = 0;

    }
    public User (String nazwa, String login, String hasło, String email, int age, int poziom) {
        name = nazwa;
        this.login = login;
        this.password = hasło;
        this.email = email;
        this.age = age;
        level = poziom;

    }

}