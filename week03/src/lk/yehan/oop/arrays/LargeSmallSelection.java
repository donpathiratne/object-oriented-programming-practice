package lk.yehan.oop.arrays;

import java.util.Scanner;

public class LargeSmallSelection {
    public static void main(String[] args){
        // create an array to store 6 values
        int[] numbers = new int[6];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter a number for index "+i+ ": ");
            numbers[i] = sc.nextInt();
        }

        int large = numbers[0];
        int small = numbers[0];
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] > large){ // 15, 65 , 95, 0, -23, 150
               large = numbers[i];
            }
            if(numbers[i] < small){
                small = numbers[i];
            }
        }

        System.out.println("largest value is "+ large);
        System.out.println("smallest value is "+small);


    }
}
