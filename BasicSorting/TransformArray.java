package BasicSorting;
public class TransformArray {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 16, 70, 44, 11, 89, 54, 66 };
        int n = arr.length;
        print(arr);
        int x=0;
        for (int i = 0; i < n; i++) {
            int min=Integer.MAX_VALUE;
            int minindx=-1;
            for(int j=0;j<n;j++){
                if(arr[j] < min && arr[j]>0){
                    min=arr[j];
                    minindx=j;
                }
            }
                arr[minindx] = x;
                x--; 
        }
        print(arr);
        for (int i = 0; i < n; i++) {
            arr[i]*=(-1);
        }
            print(arr);
    }
}
