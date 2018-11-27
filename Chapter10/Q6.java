/**
 * Q6
 */
public class Q6 {

    public static void main(String[] args) {
        
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0)  return false;
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int j = 0;
        int i = row_len-1;
        while(i>=0 && j<=col_len-1 && j>=0 && i<=row_len)
        {
            int temp = matrix[i][j];
            if(temp==target)    return true;
            else if(temp<target)    j++;
            else    i--;
        }
        return false;
    }
}