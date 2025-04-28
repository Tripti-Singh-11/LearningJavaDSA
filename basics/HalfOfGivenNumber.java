package basics;
import java.util.Scanner;
public class HalfOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        a= sc.nextInt();
        int b=(a/2);
        float c= (float)b;
        System.out.println(c);
        sc.close();

    }
}
