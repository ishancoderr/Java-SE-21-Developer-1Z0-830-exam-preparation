package collections;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args){
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);

        System.out.println("ages"+ ages);

        ArrayList<Object> mixList = new ArrayList<>();
        mixList.add("java");
        mixList.add(10);
        mixList.add(true);

        System.out.println("mixList:"+ mixList);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("cat");
        animals.add(2,"Dog");
        animals.add(1,"Cow");
        //lion Cow Cat Dog
        System.out.println("animals"+ animals);
        animals.remove(2);
        System.out.println("animals"+ animals);
        animals.set(1,"Ant eater");
        System.out.println("animals"+ animals);
        animals.clear();
        System.out.println("animals"+ animals);

        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Andy");
        names.add("clark");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Andy");
        names2.add("clark");
        names2.add("David");

        System.out.println(names.equals(names2));
    }
}
