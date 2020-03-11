package com.company;

public class Main {

    public static void main(String[] args) {
        long ageUniverse = 13_000_000_000L;
        System.out.println("ageUniverse = " + ageUniverse);
        int ageHumanity = 100_000;
        System.out.println("ageHumanity = " + ageHumanity);
        long DiffAges = ageUniverse / ageHumanity;
        System.out.println("DiffAges = " + DiffAges);
    }
}
