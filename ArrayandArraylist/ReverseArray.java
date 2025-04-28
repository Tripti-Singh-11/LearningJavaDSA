package ArrayandArraylist;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,45,48,87,84,88};
        int n=arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]= arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    }





