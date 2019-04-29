package com.java.example;

public class NumberOfCountString {

    public static void main(String args[]) {

        String str = "sdsdsds232323sdsdsawqqq";
        int count = 0;
        String strCopyValue = "";
        String strTemp = "";
        char charstr = ' ';
        StringBuffer sb = new StringBuffer();
        StringBuffer sbTemp = new StringBuffer();
        boolean flag=false;
        for (int i = 0; i < str.length(); i++) {
            if (strTemp.contains(sbTemp.append(str.charAt(i)))) {
                flag = true;
              //  System.out.println("Character strTemp Value---> "+strTemp);
            }
            strCopyValue = sb.append(str.charAt(i)).toString();
            strTemp = strTemp.concat(strCopyValue.toString());

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i) && !flag) {
                    charstr = str.charAt(i);
                    count++;
                }
            }
            if(!flag) {
                System.out.println("Character Value---> " + charstr + "-- count--->" + count);
                charstr = ' ';
                count = 0;
                sbTemp.setLength(0);
            }
            flag = false;
        }
    }



}
