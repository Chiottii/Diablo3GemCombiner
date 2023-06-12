package com;

import com.models.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputAndOutput {
    private static Scanner scanner = new Scanner(System.in);

    public List<Gem> getGemAmounts () {
        System.out.println("Please input the amount of each gem that you currently have in this order: Marquis, Imperial, Flawless Imperial, Royal. Separate each number by a Space");
        String gemsInputted = scanner.nextLine();

        List<Gem> listOfGems = new ArrayList<>();
        String[] arrOfGems = gemsInputted.split(" ");

        int[] arrOfGemsInt = new int[4];
        for (int i = 0; i < arrOfGems.length; i++) {
            int parsedValue = Integer.parseInt(arrOfGems[i]);
            arrOfGemsInt[i] = parsedValue;
        }

        // I just created an array with the amount of each tier in indexes 0-5.
        //I want to loop through and add a new gem to the list for every index.

        for (int i = 0; i < arrOfGemsInt[0]; i++) {
            listOfGems.add(new Marquis("Marquis", 1));
        }
        for (int i = 0; i < arrOfGemsInt[1]; i++) {
            listOfGems.add(new Imperial("Imperial", 3));
        }
        for (int i = 0; i < arrOfGemsInt[2]; i++) {
            listOfGems.add(new FlawlessImperial("Flawless Imperial", 9));
        }
        for (int i = 0; i < arrOfGemsInt[3]; i++) {
            listOfGems.add(new Royal("Royal", 27));
        }
//        for (int i = 0; i < arrOfGemsInt[4]; i++) {
//            listOfGems.add(new FlawlessRoyal("Flawless Royal", 81));
//        }

        return listOfGems;
    }

    public String getDesiredGem(){
        System.out.println("What gem type do you want?");
        String desiredGem = scanner.nextLine();
        return desiredGem;
    }

    public int getDesiredAmount(){
        System.out.println("How many of them do you want?");
        int desiredAmount = Integer.parseInt(scanner.nextLine());
        return desiredAmount;
    }

}
