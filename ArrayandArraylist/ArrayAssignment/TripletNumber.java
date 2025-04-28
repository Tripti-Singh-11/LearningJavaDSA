package ArrayandArraylist.ArrayAssignment;
import java.util.*;
public class TripletNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr={4,8,9,16,2,5,7,14};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int z=j+1;z<arr.length;z++){
                    if(arr[i]+arr[j]+arr[z]==x && i!=j &&j!=z &&i!=z){
                        System.out.println(arr[i]+" " + arr[j]+ " "+  arr[z]);
                    }
                }
            }
        }
        sc.close();
    }
}