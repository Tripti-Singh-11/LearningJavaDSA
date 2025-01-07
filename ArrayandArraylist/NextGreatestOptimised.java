package ArrayandArraylist;
public class NextGreatestOptimised {
    public static void main(String[] args) {
        int[] arr={40,5,63,2,9,1,80,45,79,4,-5,6};
        int n=arr.length;
        int[] ans = new int[n];
        ans[n-1]= -1;
        int nextgreatest= arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nextgreatest;
            ans[n-1]=-1;
            nextgreatest = Math.max(nextgreatest,arr[i]);
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
