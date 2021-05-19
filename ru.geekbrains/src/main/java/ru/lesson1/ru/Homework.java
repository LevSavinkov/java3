package ru.lesson1.ru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework {
    public static void main(String[] args) {

        String[] arr = new String[]{"Test1", "Test2", "Test3", "Test4", "Test5"};
        Integer[] arr2 = new Integer[]{1, 2, 4, 6, 7};

        swapPlacesArr(arr, 2, 0);
        prototypeArr(arr2);

        Apple apple = new Apple(2.3f);
        Apple apple1 = new Apple(6.1f);

        Box<Apple> appleBox = new Box<>();
        appleBox.add(apple);
        appleBox.add(apple1);
        appleBox.add(new Apple(4f));

        Box<Apple> nullAppleBox = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(2.3f));
        orangeBox.add(new Orange(6.1f));
        orangeBox.add(new Orange(4f));

//        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox.getWeight()));

        orangeBox.print();

        appleBox.passValue(nullAppleBox.arrayList);
        nullAppleBox.print();



    }

    static <T> void swapPlacesArr(T[] arr, int valueOne, int valueTwo) {
        T temporaryOne;
        T temporaryTwo;
        temporaryOne = arr[valueTwo];
        temporaryTwo = arr[valueOne];
        arr[valueOne] = temporaryOne;
        arr[valueTwo] = temporaryTwo;
        System.out.println(Arrays.toString(arr));
    }

    static <T> void prototypeArr(T[] arr) {
        ArrayList<T> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);
        System.out.println(arrList);
    }
}
