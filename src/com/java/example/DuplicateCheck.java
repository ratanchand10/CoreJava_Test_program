package com.java.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCheck {

    public static void main(String args[]) {
        String[] withDuplicates = new String[]{"one", "two", "three", "one"};
        String[] withoutDuplicates = new String[]{"one", "two", "three"};

        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));

        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));


        System.out.println("Checking array with duplicate using Set and List:    ha " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));
    }



    private static boolean bruteforce(String[] inputData) {
        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (inputData[i].equals(inputData[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDuplicateUsingSet(String[] inputData) {

        List inputList = Arrays.asList(inputData);
        Set inputSet = new HashSet(inputList);
        if (inputSet.size() < inputList.size()) {
            return true;
        }
        return false;
    }

    private static boolean checkDuplicateUsingAdd(String []inputData){
        Set tempDataSet = new HashSet();
        for(String input: inputData){
            if(!tempDataSet.add(input)){
                return true;
            }
        }
        return false;
    }
}
