package ArrayandArraylist.ArrayAssignment;
public class Mergearray {
   public static void main(String[] args) {
    int[] a={4,8,9,16};
    int[] b={2,5,7,14};
    int x=a.length;
    int y=b.length;
    int[] c=new int[x+y];
    int i=0,j=0,k=0 ;
    while(i<x&&j<y){
        if(a[i]<b[j]){
            c[k]=a[i];
            i++;
            ++k;
        }
        else{
            c[k]=b[j];
            ++k;
            ++j;
        }}
        if(i!=x){
            while (i<x) {
            c[k]=a[i];
            i++;k++;
            }   
            }
            else if(j!=y){
                while(j<y){
                    c[k]=b[j];
                    k++;j++;
                }
            }
        
    for(int l=0;l<x+y;l++){
        System.out.print(c[l]+ " ");
    }
    System.out.println(c[x+y-1]);
    } 
}