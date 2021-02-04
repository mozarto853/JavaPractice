package BasicJava;

import java.util.Arrays;

public class Array {
    public static void main(String [] args){

        int[]age = new int[4];                          //This is the first way to write them. It is honestly slow and cumbersome
        age[0] = 5;
        age[1] = 8;
        age[2] = 10;

        age[3] = 25;

        System.out.println(age.length);                 //Gives you the size of the array
        System.out.println(age[2]);                  //Gives you the value at index 2
        System.out.println(Arrays.toString(age));        //Gives you the whole array without loop(Not usually recomended)




        int[]weight = {110,150,105,173,200};            //This is the second way to write it. It allows you to set the size and add as many numbers as you want

        for(int i=0; i<weight.length; i++){
            System.out.println(weight[i]);
        }

        for(int i=0; i<age.length;i++){
            if(age[i] == 90){
                System.out.println("Found at index " + i);
            }
          
        Arrays.sort(weight);
        System.out.println(Arrays.toString(weight));
        }

    }
}
