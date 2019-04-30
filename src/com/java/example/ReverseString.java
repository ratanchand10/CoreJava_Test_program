package com.java.example;

/*
If the “MyJava” is the string to reverse, then this method works like this.

1st Call —>   recursiveMethod(“MyJava”)
2nd Call —> recursiveMethod(“yJava”) + “M”
3rd Call —>  (recursiveMethod(“Java”) + “y”) + “M”
4th call —>  ((recursiveMethod(“ava”) + “J”)+”y”) + “M”
5th Call —>  (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
6th Call —>  ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”
 */
public class ReverseString {

    public static void main(String ...args){
        ReverseString revString = new ReverseString();
        String strOriginalValue = "The java";
        /*String reverseValue = revString.reverseString(strOriginalValue);
        System.out.println("Reverse String Value--> "+reverseValue);
*/
       /* String reverseValueforloop = revString.reverserStringForLoop(strOriginalValue);
        System.out.println("Reverse String For Loop Value "+reverseValueforloop);*/

        String reverseRecursive = revString.reverseRecursive(strOriginalValue);
        System.out.println("Reverse String For Loop Value "+reverseRecursive);

    }

    private String reverseString(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
     private String reverserStringForLoop(String str){
         String s="";
        for(int i= str.length()-1; i >0; i--){
            char character = str.charAt(i);
             s.concat(String.valueOf(character));
        }
         return s;
     }
//The java
     private String reverseRecursive(String str){
        if(str.isEmpty()) {
            return str;
        }
        return reverseRecursive(str.substring(1))+ str.charAt(0);
     }
}
