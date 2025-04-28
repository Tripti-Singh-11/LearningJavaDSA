package ArrayandArraylist;
public class NextGreatestEle {
    public static void main(String[] args) {
        int[] arr={40,5,63,2,9,1,80,45,79,4,-5,6};
        int n=arr.length;
        int[] ans = new int[n];
        ans[n-1]= -1;
        for(int i=0;i<n-1;i++){
            int max= Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
            for(int ele : arr){
                System.out.print(ele+ " ");
            }
            System.out.println();
                for(int ele : ans){
                    System.out.print(ele+ " ");
            }
    }
}

