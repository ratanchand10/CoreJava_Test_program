package com.java.example;

public class PermutationString {

    public static void main(String... args) {

        String permutationString = "jsp";
        PermutationString permutationStringValue = new PermutationString();
        permutationStringValue.permutationString( permutationString);

    }

    private void displayPermutation(String permutationString, String input) {

        if (input.isEmpty()) {
            System.out.println("permutationString is---> " + permutationString);
        } else {
            for (int i = 0; i < input.length(); i++) {
                displayPermutation(permutationString + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
            }
        }
    }

    private void permutationString(String str){
        displayPermutation("", str);
    }
}




