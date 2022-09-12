package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Car, Base> avto = new HashMap<>();
        avto.put(new Car(1, "03KG337ABN"), new Base("2000", "Mersedes", 6000, "Green"));
        avto.put(new Car(2, "01KG397ADN"), new Base("1999", "Toyota", 8000, "Blue"));
        avto.put(new Car(3, "08KG265ANC"), new Base("2012", "Nissan", 4600, "Red"));
        avto.put(new Car(4, "07KG967NCV"), new Base("2019", "Fit", 11000, "Black"));
        entrySet(avto);

    }

    public static void entrySet(HashMap<Car, Base> a) {

        System.out.println(a);
        }
    }

