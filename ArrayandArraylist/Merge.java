package ArrayandArraylist;
public class Merge {
    public static void main(String[] args) {
        int[] a={1,40,7,5,79};
        int[] b={17,44,26,65,98};
        int[] c= new int[a.length +b.length];
        int i=0,j=0,temp=0;
        //merging
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[temp]=a[i];
                i++;
            }
            else {
            c[temp]=b[j];
            j++;
            }
            temp++;
        }
            if(i==a.length){ //now take elements free b only
                while (j<b.length) {
                    c[temp]=b[j];
                    j++; 
                    temp++;
                }
            }
            if(i==b.length){ //now take elements free a only
                while (i<a.length) {
                    c[temp]=a[i];
                    i++; temp++;
                }
            }
            for(int ele: c){
                System.out.print(ele+ " ");
            }
    }
}
