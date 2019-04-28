package com.java.example;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

    public static void main(String args[]) {

       // System.out.println("jai maa sarswati + hara krishna");

        /*int []iArray = new int[]{1,2,3,5};
        int missingNumber = getMissingNumber(iArray,5);
        System.out.printf("missing number in Array %s is %d %n", Arrays.toString(iArray),missingNumber);
*/
        // one missing number
    //    multipleMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);

        // two missing number
    //    multipleMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);

        // three missing number
        multipleMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);




    }

    private static int getMissingNumber(int [] number, int totalNumberofCount){
        // n*(n+1)/2
        int expectedSum = totalNumberofCount*((totalNumberofCount+1)/2);
        int actualSum = 0;
        for(int i: number){
            actualSum= actualSum+i;
        }
        return expectedSum - actualSum;
    }

    private static void multipleMissingNumber(int []numbers, int totaleNumberOfCount){

        int missingCount = totaleNumberOfCount - numbers.length;
        BitSet bitset = new BitSet(totaleNumberOfCount);

        for(int number :numbers){
            bitset.set(number-1);
        }
        System.out.printf("Missing number in Array %s is %d %n", Arrays.toString(numbers), totaleNumberOfCount);

        int lastMissingIndex = 0;
        for(int i=0; i<missingCount; i++){
            lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
            ++lastMissingIndex;
            System.out.println("-------> "+lastMissingIndex);
        }

    }

}
