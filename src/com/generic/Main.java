package com.generic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw-5", 1998);
        Car car1 = new Car("bmw-7", 2005);
        Car car2 = new Car("lincoln", 1958);

        Car[] cars = {car, car1, car2};

        Employee emp = new Employee("Trdat", 35);
        Employee emp1 = new Employee("Argishti", 30);
        Employee emp2 = new Employee("TigranMec", 40);

        Employee[] emps = {emp, emp1, emp2};

        SortUtils.insertionSort(cars);
        System.out.println(Arrays.toString(cars));
        SortUtils.quickSort(emps );
        System.out.println(Arrays.toString(emps));
    }
}
