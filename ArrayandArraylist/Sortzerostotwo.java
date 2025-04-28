package ArrayandArraylist;
public class Sortzerostotwo {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,0,2,1,2,0};
        int n= arr.length;
        int  noofzeros =0;
        int noofones=0; 
        for(int i=0;i<n;i++){
            if(arr[i]==0 ) noofzeros++;
            if(arr[i]==1 ) noofones++;
        }
           for(int i=0;i<n;i++){
              if(i<noofzeros ) arr[i]=0;
             else if(i<noofzeros+noofones ) arr[i]=1;
            else arr[i]=2;
            }
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+ " ");
                }
    }
}

