package BinarySearch;
public class Square {
   public static void main(String[] args) {
       int x=25;
       // cases (0 and 1)
       if(x<=1){
       System.out.println(x);
       return;
       }
        int lo =0 ,hi = x;
        while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(mid==x/mid)
        {System.out.println(mid);
        return;}
        else if(mid<x/mid) {
            lo= mid +1;
        }
        else if(mid>x/mid) {
            hi =mid-1;
        }
       }
        System.out.println(hi);
    }   
}

