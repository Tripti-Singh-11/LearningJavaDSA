package ArrayandArraylist.ArrayAssignment;
public class Checkshorted {
    public static void main(String[] args) {
    int[] arr={4,8,-9,6,9,2};
        int flag=0;
        for(int i=0;i<=arr.length;i++){
            flag=0;
            if(arr[i]<arr[i+1]){
                flag=1;
            }
               else {
               break;
            }
        }
            if(flag==1){
                System.out.print("sorted");
            }
            else{
                System.out.print("not sorted");
            }
    }
}

