package ArrayandArraylist.ArrayAssignment;
public class Uniqueelement {
    public static void main(String[] args) {
        int[] arr={4,2,2,5,7,7,8,9};
        int flag=0;
        for(int i=0;i<arr.length;i++){
            flag=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                flag=1;
                }
            }
            if(flag==1){
            System.out.print(" not unique"+" ");
            System.out.print(arr[i]+ " ");
            System.out.println();
            }
            else{
            System.out.print("unique"+" ");
            System.out.print(arr[i]+ " ");
            System.out.println();
            }
        }
    }
}

//same code for non repeating