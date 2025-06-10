package org.example;

public class IsNameValid {
      public static boolean isNameValid (String name){
            return name !=null && name.length() <=10;
      }

      public static void main(String[] args) {
            System.out.println(isNameValid("Gleb"));
            System.out.println(isNameValid("fsldfkas;dflksad;f"));
      }
}