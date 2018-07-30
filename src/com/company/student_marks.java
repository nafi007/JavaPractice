package com.company;
import java.util.*;

public class student_marks {
    public static void main(String[] args) {

        // write your code here
        int maths, physics, chemistry, computersc, english;
        double finalscore;
        boolean result = true;
        Scanner marks = new Scanner(System.in);
        while(result)
            {
                System.out.println("Enter Marks for Maths:");
                maths = marks.nextInt();

                System.out.println("Enter Marks for Physics:");
                physics = marks.nextInt();

                System.out.println("Enter Marks for Chemistry:");
                chemistry = marks.nextInt();

                System.out.println("Enter Marks for Computer Science:");
                computersc = marks.nextInt();

                System.out.println("Enter Marks for English:");
                english = marks.nextInt();

                finalscore= (maths+chemistry+physics+english+computersc)/5.0;

                if(finalscore>90){
                    System.out.println("Excellent");
                }
                else if(finalscore>80){
                    System.out.println("Very Good");
                }
                else if(finalscore>60){
                    System.out.println("Good");
                }
                else if(finalscore>40){
                    System.out.println("Average");
                }
                else{
                    System.out.println("Poor");
                }

                System.out.println("Any more students? (true or false)");
                result = marks.nextBoolean();

            }

    }
}
