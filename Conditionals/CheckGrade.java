package Conditionals;

import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of student");
        int n=sc.nextInt();
        if(81<= n && n<=100)
        System.out.println("A grade very good");
        else if(n<80 && n>=60)
        System.out.println("B grade  Good");
        else if(n<60 && n>=41)
        System.out.println(" C grade Average");
        else
        System.out.println("Failed");
}
}