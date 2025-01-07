package MultiDimensionalArrays.MultiDimAssignment;
public class MiddleRowColoumn {
public static void displayMiddleRowColoumn(int[][] array,int size) {
    for(int j=0;j<size;j++){
        for(int i=0;i<size;i++){
            System.out.print(array[j][i]+ " "); 
        }
            System.out.println();
    }
        System.out.println();
        int MI=size/2;
        for(int j=0;j<size;j++){
            for(int i=0;i<size;i++){
                if((i==MI)||(j==MI)){
                    System.out.print(array[j][i]+" ");
                }
                    else  System.out.print(" "+" ");
                }
                System.out.println();
        }
                System.out.println();
}
        public static void main(String[] args) {
        int[][] array={ {1,2,3,5,8},{6,3,5,9,8},{3,7,4,9,7},{2,6,9,7,5},{8,7,7,9,2} };
        displayMiddleRowColoumn(array,5);
        }
}
      