package BasicJava;

import java.util.Arrays;

public class Array {
    public static void main(String [] args){

        int[]age = new int[3];                          //This is the first way to write them. It is honestly slow and cumbersome
        age[0] = 5;
        age[1] = 8;
        age[2] = 10;

        int[]weight = {110,150,105,173,200};            //This is the second way to write it. It allows you to set the size and add as many numbers as you want

        System.out.println(age.length);                 //Gives you the size of the array
        System.out.println(age[2]);                  //Gives you the value at index 2
        System.out.println(Arrays.toString(weight));        //Gives you the whole array without loop(Not usually recomended)
    }
}
