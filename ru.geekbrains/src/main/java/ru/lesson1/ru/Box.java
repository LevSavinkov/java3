package ru.lesson1.ru;

import java.util.ArrayList;

public class Box <T extends Fruit>  {

    ArrayList<T> arrayList = new ArrayList<>();

    void add(T t){
        arrayList.add(t);
    }

    public float getWeight() {
        float endWeight = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            endWeight += arrayList.get(i).getWeight();
        }
        return endWeight;
    }

    public boolean compare (float weight) {
        return getWeight() == weight;
    }

    public void print (){
        int counter = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("Вес %d фрукта = %.1f\n", counter, arrayList.get(i).getWeight());
            counter++;
        }
        System.out.println("Вес всех фруктов = " + getWeight());
    }

    public ArrayList<T> passValue (ArrayList <T> passArr) {
        if (passArr.isEmpty())
        for (int i = 0; i < arrayList.size(); i++) {
            passArr.add(arrayList.get(i));
        } else {
            System.out.println("В корзине уже есть фрукты");
        }
        arrayList.clear();
        return passArr;
    }

}
