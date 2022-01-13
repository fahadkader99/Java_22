package practice_session.Array.Single_Dimension;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputWithArray {
    public static void main(String[] args) {


    //userInput();
    stringStatement();

    }
    static void userInput(){
        Scanner scan = new Scanner(System.in);

        String[] zooAnimal = new String[5];

        for (int i = 0; i < zooAnimal.length; i++){
            System.out.println("Enter an animal " + (zooAnimal.length-i) + " animal more");
            zooAnimal[i] = scan.nextLine();
        }
        System.out.println("Here are the animal in our zoo " + Arrays.toString(zooAnimal));
    }
    static void stringStatement(){
        String[] domesticAnimals = {"Dog", "Cat", "Parrots", "Goats"};

        String catElement = domesticAnimals[1];
        System.out.println(catElement);

        String kittyElement = "Kitty";
        domesticAnimals[1] = kittyElement;
        System.out.println(domesticAnimals[1]);

        System.out.println(Arrays.toString(domesticAnimals));
        System.out.println(domesticAnimals.length);


        String python = "Python";
        String gorilla = "Gorilla";

        String[] wildAnimals = {"Eagle", python, "Anaconda","Lion", "Snake", gorilla, "Tiger"};

        for (String animal : wildAnimals){

            if (animal.equalsIgnoreCase("python")){
                System.out.println("I have found python so i will skip to the next animal!");
                continue;
            }
            else if (animal.equalsIgnoreCase("Gorilla")){
                System.out.println("I have came across" + animal + ". Terminating now. ");
                break;
            }
            else System.out.println(animal);
        }





    }


}
