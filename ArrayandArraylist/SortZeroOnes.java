package ArrayandArraylist;
import java.util.Scanner;
public class SortZeroOnes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] arr =  new int[6];
        int x =arr.length;
        for(int i=0;i<6;i++){
            arr[i]= sc.nextInt();
        }
            int noofzeros=0;
                for(int i=0;i<6;i++){
                    if(arr[i]==0) noofzeros++;
            }
                    for(int i=0;i<6;i++){
                        if(i<noofzeros) arr[i]=0;
                        else arr[i]=1;
                    }
                        for(int ele : arr){
                            System.out.print(ele+" ");
                        }
                            System.out.println();
                        sc.close();
    }
}

