package ArrayandArraylist.ArrayAssignment;
public class Secondlargest {
    public static void main(String[] args) {
        int[] arr={9,30,14,4,23,6};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int  smax=Integer.MIN_VALUE;
           for(int j=0;j<n;j++){
                if(smax<arr[j]&& arr[j]!=max)
                     smax=arr[j];
            }
        System.out.print(smax);
    }
}
            

