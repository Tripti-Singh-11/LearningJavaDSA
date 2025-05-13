package BinarySearch.Assignment;
public class RowWithMaxOnes {
    public static void main(String[] args) {
    int[][] matrix = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 1}
            };
    
    int n = matrix.length;       
    int m = matrix[0].length;    
    int maxRowIndex = -1;       
    int col = m - 1;            
    int row = 0;
    while (row < n && col >= 0) {
        if (matrix[row][col] == 1) {
            maxRowIndex = row;
            col--;
            } else {
            row++;
            }
    }
    if (maxRowIndex != -1) {
        System.out.println("Row with max 1's: " + maxRowIndex);
        } else {
        System.out.println("No 1's found in the matrix.");
        }
    }
}
    

