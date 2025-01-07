package ArrayandArraylist.ArrayAssignment;
public class DiffoddAndevenindices {
    public static void main(String[] args) {
        int[] a={4,8,19,6,9,2};
        int even=0,odd=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
               even+=a[i]; 
            }
             else {
                odd+=a[i];
                }
                System.out.print("even is"+ even+" ");
                System.out.print("odd is"+ odd+" ");   
            }
            System.out.println("ans is" + (even-odd));
    }
}
