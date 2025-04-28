package MultiDimensionalArrays;
public class ForEach {
    public static void main(String[] args) {
        int[] a={4,5,3,1,6};
        for(int ele: a){
            System.out.print(ele+ " ");
        }
            System.out.println();
        int[][]b ={{4,5,3,2},{4,2,5,6}};
        for(int[] ele: b){
            for(int x : ele){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
