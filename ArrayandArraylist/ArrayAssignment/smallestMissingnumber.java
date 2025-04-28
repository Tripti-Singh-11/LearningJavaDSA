package ArrayandArraylist.ArrayAssignment;

public class smallestMissingnumber {
    public static void main(String[] args) {
        int [] arr={1, -2,5,6,7};
        int x=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
            {if(arr[i]==x)
            x++;
            else
            break;}
        }System.out.println(x);
    }
}
