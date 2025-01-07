package ArrayandArraylist.ArrayAssignment;
public class Dublicatenumber {
    public static void main(String[] args) {
        int[] arr={4,8,6,9,5,8,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
           int flag=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j] && i!=j){
                    flag=1;
                }
            }   if(flag==1)
            System.out.println(arr[i]);
            }
    }
}
