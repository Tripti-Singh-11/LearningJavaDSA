package ArrayandArraylist.ArrayAssignment;
public class oddmulby2andevenaddby10 {
public static void main(String[] args) {
    int[] arr={4,8,19,6,9,2};
    int even=0,odd=0;
    for(int i=0;i<arr.length;i++){  
        if(i%2==0){
            arr[i]+=10;
            System.out.println("even " +arr[i]+" ");
        }
        else {
            System.out.println("odd"+" "+ (arr[i]*=2)+" ");}
    }
}
}