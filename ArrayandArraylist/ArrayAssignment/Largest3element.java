package ArrayandArraylist.ArrayAssignment;
public class Largest3element {
    public static void main(String[] args) {
        int[] arr={4,6,8,3,9,1};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(max<arr[i]){
                max=arr[i];
                }
            }
        int smax=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(smax<arr[j] && arr[j]!=max){
                    smax=arr[j];
                }
            }
        int tmax=Integer.MIN_VALUE;
            for(int z=0;z<n;z++){
                if(tmax<arr[z] && arr[z]!=max && arr[z]!=smax){
                    tmax=arr[z];
                }
            }
            System.out.println("largest element:"+ max+ " " +smax+" " +tmax);
    }
}

