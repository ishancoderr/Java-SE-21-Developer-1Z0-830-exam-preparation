package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionBetweenListArray {

    public static void main(String[] args){
        List<String> animalsList = new ArrayList<>();
        animalsList.add("cat");
        animalsList.add("Dog");
        animalsList.add("Cow");
        animalsList.add("Lion");

        //for loop
        String[] animalsArray = new String[animalsList.size()];
         for(int i=0; i< animalsList.size(); i++){
            animalsArray[i] = animalsList.get(i);
        }
         System.out.println("animallist ="+ animalsList);
        System.out.println("animallist ="+ Arrays.toString(animalsArray));

    }
}
