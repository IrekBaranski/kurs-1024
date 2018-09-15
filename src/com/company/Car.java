package com.company;

/* stwórz klasę Car, która będzie miała konstruktor parametrowy,
a przez niego będą inicjalizowane takie pola jak: brand (marka samochodu), color (typu String)
oraz engine typu Engine – który wcześniej stworzyliśmy.

Stwórz dwa samochody, wypisz na ekran jaki typ silnika każdy z nich ma.
 */

public class Car {
    String brand;
    String color;
    Engine engine;

    public Car(String brand, String color, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }
}
