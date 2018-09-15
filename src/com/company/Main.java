package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User ();
        System.out.println(user.name + user.age + user.login + user.email + user.password);

        User Irek = new User ("Irek", "thermin", "thermin-pass", "thrmn@wp.pl", 41, 999 );
        System.out.println(Irek.name + " " + Irek.age + ' ' + Irek.level);
        Irek.password = "zmienione hasło";
        System.out.println(Irek.password);

        User Wolverine = new User ("Logan", "wolwerine", "rosomak-walczy", "logan123@serduszko.com", 287, 998);
        Wolverine.ID = 1;

        User Batman = new User ("Batman", "brucewane", "ja-sem-netoperek", "imbatman@batman.bat", 45, 789);
        Batman.ID = 2;

        Dog Smialek = new Dog("Smialek", 8, "white");

        System.out.println(Batman.ID + " " + Batman.name + " " + Batman.age);
        System.out.println(Smialek.name + " " + Smialek.age + ' ' + Smialek.breed);

        System.out.println("Car case");

        Engine El = new Engine("elektryczny 200KM");
        Engine CRDI = new Engine("disel 150 KM");
        Engine mpi = new Engine("benzyna 180 KM");

        Car Volvo = new Car("Volvo", "red", new Engine("SDI"));
        Car Tesla = new Car("Tesla", "blue", El);

        System.out.println("Dostępne silniki samochodów to:  " + El.typeEngine + " " + Volvo.engine.typeEngine + " " + CRDI.typeEngine + " " + mpi.typeEngine);
        System.out.println("Samochód dostępny:  " + Tesla.brand + " " + Tesla.color + " " + Tesla.engine.typeEngine );










    }
}
