import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your weight?");
        Scanner scanner = new Scanner(System.in);
        int goodToGo = 0;
        String W = scanner.nextLine();
        for (char c : W.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is your weight? Please use numbers");
            W = scanner.nextLine();
            for (char c : W.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        goodToGo = 0;
        double theWeight =Double.parseDouble(W);
        System.out.println("What is your gender? Enter 0 if Male or 1 if Female: ");
        goodToGo = 0;
        String theGen = scanner.nextLine();
        for (char c : theGen.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is your gender: Male(0) or Female(1)? Please use numbers");
            theGen = scanner.nextLine();
            for (char c : theGen.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        double Gender =Double.parseDouble(theGen);
        System.out.println("What is the number of drinks you have had?");
        String numDrinks = scanner.nextLine();
        for (char c : numDrinks.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is the number of drinks you have had? Please use numbers");
            numDrinks = scanner.nextLine();
            for (char c : numDrinks.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        double drinkNum =Double.parseDouble(numDrinks);
        System.out.println("What is the the amount of alcohol by volume of the drinks consumed?");
        String alcVol = scanner.nextLine();
        for (char c : alcVol.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is the the amount of alcohol by volume of the drinks consumed? Please use numbers");
            alcVol = scanner.nextLine();
            for (char c : alcVol.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        double drinkVol =Double.parseDouble(alcVol);
        System.out.println("What is the amount of time since your last drink?");
        String drinkTime = scanner.nextLine();
        for (char c : drinkTime.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is the amount of time since your last drink? Please use numbers");
            drinkTime = scanner.nextLine();
            for (char c : drinkTime.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        double timeDrink =Double.parseDouble(drinkTime);
        if(Gender == 0)
        {
            Gender = 0.73;
        }
        else if(Gender == 1)
        {
            Gender = 0.66;
        }
        double A = drinkNum * drinkVol;
        double bloodAlc = (A * 5.14)/(theWeight * Gender) - 0.015 * timeDrink;
        System.out.println("Your BAC is " + bloodAlc);
        if(bloodAlc > 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }
    }
}
