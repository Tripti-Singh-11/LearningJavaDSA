package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scan.nextInt();
    System.out.println(2*n);
}
}