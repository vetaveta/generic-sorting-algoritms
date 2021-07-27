package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("bmw-5", 1998);
        Car car1 = new Car("bmw-7", 2005);
        Car car2 = new Car("lincoln", 1958);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);

        Employee emp = new Employee("Trdat", 35);
        Employee emp1 = new Employee("Argishti", 30);
        Employee emp2 = new Employee("TigranMec", 40);

        List<Employee> emps = new ArrayList<>();
        emps.add(emp);
        emps.add(emp1);
        emps.add(emp2);

        SortUtils.quickSort(emps);
        SortUtils.insertionSort(cars);
        System.out.println(cars.toString());
        System.out.println(emps.toString());

    }

}
