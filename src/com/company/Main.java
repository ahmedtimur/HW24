package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] numbersArray = new int[20];
        System.out.println("Array with random numbers: " + Arrays.toString(getRandNumbers(numbersArray)));

        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Array List with random number: " + getRandomNumbers(arrList));

        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Linked List with random numbers: " + getRandomNumbers(linkedList));

    }
    
    public static LinkedList<Integer> getRandomNumbers(LinkedList<Integer> linkedList) {
            Random randNumbers = new Random();

            for(int i = 0; i < 20; i++) {
                linkedList.add(randNumbers.nextInt(0,2));
            }

            Collections.sort(linkedList);

            return linkedList;
        }

    public static ArrayList<Integer> getRandomNumbers(ArrayList<Integer> arrList) {
        Random randNumbers = new Random();

        for(int i = 0; i < 20; i++) {
            arrList.add(randNumbers.nextInt(0,2));
        }

        Collections.sort(arrList);

        return arrList;
    }

    public static int[] getRandNumbers(int[] numbersArray) {

        Random randomNumbers = new Random();

        for(int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = randomNumbers.nextInt(0,2);
        }

        Arrays.sort(numbersArray);

        return numbersArray;
    }


}
