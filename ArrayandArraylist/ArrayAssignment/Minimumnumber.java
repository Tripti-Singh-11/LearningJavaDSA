package ArrayandArraylist.ArrayAssignment;

public class Minimumnumber {
    public static void main(String[] args) {
        int[] arr={3,4,8,5};
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int smin=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            if(smin>arr[j]&&arr[j]!=min){
                smin=arr[j];
            }
        }
        System.out.println(min+" ");
        System.out.println(smin+" ");
    }
}
