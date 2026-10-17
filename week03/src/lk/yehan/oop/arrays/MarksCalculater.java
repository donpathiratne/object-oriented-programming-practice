package lk.yehan.oop.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class MarksCalculater {
    public static void main(String[] args) {
        //create an array
        double[] marks = new double[5];

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter " + (i+1) + " Marks: ");
            marks[i] = sc.nextDouble();
        }

        double total = 0;
        for(double tot: marks){
            total += tot;
        }

        double average = total/marks.length;
        System.out.println();
        System.out.println("Total = "+total);
        System.out.println("Average = "+average);
    }
}
