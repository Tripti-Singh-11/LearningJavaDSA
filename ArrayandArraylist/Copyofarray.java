package ArrayandArraylist;
import java.util.Arrays;
public class Copyofarray {
   public static void main(String[] args) {
    int[] arr={40,50,10,80};
        for(int ele:arr){
        System.out.print(ele+ " ");
        }
        System.out.println();

     //shallow copy
    int[] nums=arr;                              
    nums[0]=90;
    nums[2]=20;
    System.out.println(arr[0]);
    System.out.println(arr[2]);

    //deep copy
    int[] brr=Arrays.copyOf(arr,arr.length);
    brr[0]=70;
    System.out.println(arr[0]);

    int[] crr= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];
        }
        arr[0]=100;
        System.out.println(arr[0]);
    }
}
