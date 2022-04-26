package com.adnan.QA.ifElse;
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Grade score= new Grade();
        score.Points();

    }

    public void Points(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number= sc.nextInt();

        if (number>94 && number<=100){
            System.out.println("Excellent");
        }
        else if(number>90 &&number<=93){
            System.out.println("Very Good");
        }
        else if (number>85 && number<=89) {
            System.out.println("Good");

        }
        else if (number>80 && number<=84) {
            System.out.println("Average");

        }
        else if (number>70 && number<=79) {
            System.out.println("Pass");
        }
        else if (number>60 && number<=69) {
            System.out.println("Poor");
        }
        else if (number>50 && number<=59) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Number not exist");
        }
    }

}
