package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Gift Advisor
        Scanner input = new Scanner(System.in);
        ArrayList<Gift> gift = new ArrayList<>();
//Array List of class Name, Gift objects inplace of String type


        gift.add(new Gift("Jewelry", "Female", "High", "Teen"));
        gift.add(new Gift("Weekend Getaways", "Female", "High", "Adult"));
        gift.add(new Gift("Selfie-Stick", "Female", "Low", "Teen"));
        gift.add(new Gift("All Grape inspired Gift Set", "Female", "Low", "Adult"));
        gift.add(new Gift("Perfume", "Female", "Medium", "Adult"));
        gift.add(new Gift("Beauty Hamper", "Female", "Medium", "Teen"));
        gift.add(new Gift("Smart TV", "Male", "High", "Adult"));
        gift.add(new Gift("Apple Watch", "Male", "High", "Teen"));
        gift.add(new Gift("Books", "Male", "Low", "Adult"));
        gift.add(new Gift("Shoes", "Male", "Low", "Teen"));
        gift.add(new Gift("Guitar", "Male", "Medium", "Adult"));
        gift.add(new Gift("Playstation", "Male", "Medium", "Teen"));
        gift.add(new Gift("Toys/Boardgames", "Male", "Medium", "Child"));
        gift.add(new Gift("Superhero themed Coloring Books", "Male", "Low", "Child"));
        gift.add(new Gift("NatGeo Kids Books Set", "Male", "High", "Child"));
        gift.add(new Gift("NatGeo Kids Books Set", "Female", "High", "Child"));
        gift.add(new Gift("Boardgames", "Female", "Medium", "Child"));
        gift.add(new  Gift("Purses w/ chapsticks & hairclips", "Female", "Low", "Child"));

        String gender, price, ageGroup = "";
        while (true) {
            System.out.println("Enter gender");

            gender = input.next();

            System.out.println("What is your price range? High? Medium? or Low?");
            price = input.next();

            System.out.println("What is the age group? Adult, Teen, Child?");
            ageGroup = input.next();

            input.nextLine();


            for (Gift eachGift : gift) {
                if (eachGift.getGender().equalsIgnoreCase(gender) && eachGift.getPrice().equalsIgnoreCase(price) && eachGift.getAgeGroup().equalsIgnoreCase(ageGroup)) {
                    System.out.println(eachGift.getGiftType());
                }
            }

            System.out.println("Do you want to go another round? y/n");
            if (input.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Get gift card if nothing else");
                break;
            }
        }

    }
}

