package Stacks;
public class NextGreatestElement {
public static void main(String[] args) {
    // Solution: Without using extra space
    // T.C.: O(n*n)
    // Auxilary Space: O(1)
int[] arr = {1,2,5,3,6,4,8,5};
  int[] res = new int[arr.length];
for(int i = 0;i<arr.length;i++){
    res[i]=-1;
    for(int j= i+1;j<arr.length;j++){
        if(arr[j]>arr[i]){
            res[i]=arr[j];
            break;
        }
    }
}
  for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
  for(int i=0; i<res.length; ++i){
            System.out.print(res[i]+" ");
        }
    } 
}

