package com;

import com.models.FlawlessRoyal;
import com.models.Gem;

import java.util.List;

public class CombinerMethods {
    private InputAndOutput userInputAndOutput = new InputAndOutput();
//    private List gemAmounts;
//    private String desiredGem;
//    private int desiredAmount;


    public void run() {

        List<Gem> gemAmounts = userInputAndOutput.getGemAmounts();
        String desiredGem = userInputAndOutput.getDesiredGem();
        int desiredAmount = userInputAndOutput.getDesiredAmount();
        int currentTotalValue = usersTotalValue(gemAmounts);
        int totalNeeded = totalValueNeeded(desiredGem, desiredAmount);
        int difference = totalNeeded - currentTotalValue;

        int goldNeeded = totalGoldNeeded(desiredGem, desiredAmount);

        System.out.println("You need to find " + difference + " more Marquis Gems in order to make " + desiredAmount + " " + desiredGem + "s.");

    }


    // Created a method to look through the list of gems and calculate the total value of the gems that they currently have.

    public int usersTotalValue(List<Gem> listOfGems) {
        int totalValue = 0;
        for (Gem g : listOfGems) {
            totalValue += g.getValue();
        }
        return totalValue;
    }

    public int totalValueNeeded(String desiredGem, int desiredAmount) {
        int neededTotalValue = 0;

        if (desiredGem.toLowerCase().equals("imperial")) {
            neededTotalValue = desiredAmount * 3;
        }
        if (desiredGem.toLowerCase().equals("flawless imperial")) {
            neededTotalValue = desiredAmount * 9;
        }
        if (desiredGem.toLowerCase().equals("royal")) {
            neededTotalValue = desiredAmount * 27;
        }
        if (desiredGem.toLowerCase().equals("flawless royal")) {
            neededTotalValue = desiredAmount * 81;
        }
        return neededTotalValue;
    }

    // let's add more the additional coins and mats it would cost as well! Should be able to create a new a variable to be used in the same if statement.
    // my issue with both of these methods is that we would need to their current amounts... we have the list of gems in the run method already
    // I think the plan is to use that list in the parameters of the methods and loop through to see exactly the amount needed.

    public int totalGoldNeeded(String desiredGem, int desiredAmount) {
        int totalGoldNeeded = 0;

        if (desiredGem.toLowerCase().equals("imperial")) {
            totalGoldNeeded = desiredAmount * 200000;
        }
        if (desiredGem.toLowerCase().equals("flawless imperial")) {
            totalGoldNeeded = desiredAmount * 300000;
        }
        if (desiredGem.toLowerCase().equals("royal")) {
            totalGoldNeeded = desiredAmount * 400000;
        }
        if (desiredGem.toLowerCase().equals("flawless royal")) {
            totalGoldNeeded = desiredAmount * 500000;
        }
        return  totalGoldNeeded;
    }

    public int totalDeathsBreathsNeeded (String desiredGem, int desiredAmount) {
        int totalDBNeeded = 0;

        if (desiredGem.toLowerCase().equals("royal")) {
            totalDBNeeded = desiredAmount;
        }
        if (desiredGem.toLowerCase().equals("flawless royal")) {
            totalDBNeeded = desiredAmount * 2;
        }

        return  totalDBNeeded;
    }
}




