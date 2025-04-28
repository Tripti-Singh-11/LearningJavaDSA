package ArrayandArraylist.ArrayAssignment;

public class Elementgreaterthanx {
    public static void main(String[] args) {
        int[] arr={3,5,-6,7,8,9,-9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int x=7;
            if(arr[i]>x){
                System.out.println(arr[i]);
            }
        }
    }
}
