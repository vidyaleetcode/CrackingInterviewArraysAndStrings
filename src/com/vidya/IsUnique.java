package com.vidya;

/**
 * 1. 1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class IsUnique {

    public static void main(String[] args) {

      System.out.println(isUnique("sun"));
        System.out.println(isUnique("Apple"));
    }

    static boolean isUnique(String str){

        boolean[] charSet = new boolean[128];

        for(char c: str.toCharArray()){
            if(charSet[c]){
                return false;
            }
            charSet[c] = true;
        }

//        for(int i=0; i < str.length(); i++){
//            int val = str.charAt(i);
//            if(charSet[val]){
//                return false;
//            }
//        }
            return true;
    }
}
