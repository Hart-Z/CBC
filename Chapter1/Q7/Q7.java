/**
 * Q7
 */
public class Q7 {

    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        R_90_2(m);
        for(int[] array : m)
        {
            for(int i : array)
            {
                System.out.print(i);
               
            }
            System.out.print("\n");
        }
    }
    public static void R_90(int[][] m) {
        int N = m.length;
        int[][] temp = new int[N][N];
        
        for(int i =0 ; i<N ;i++)
        {
            for(int j=0; j<N ; j++)
            {
                temp[j][N-1-i] = m[i][j];
            }
        }
        for(int i =0 ; i<N ;i++)
        {
            for(int j=0; j<N ; j++)
            {
                m[i][j] = temp[i][j];
            }
        }
    }

    public static void R_90_2(int[][] m) {
        int N = m.length;
        for (int i = 0; i < N/2; i++) {
            int l = i ; 
            int r = N-1-i;
            for (int j = l; j <r; j++) {
                int offset = j-l;
                int top = m[i][j];

                m[l][j] = m[r-offset][l];
                m[r-offset][l] = m[r][r-offset];
                m[r][r-offset] = m[r-offset][r];
                m[r-offset][r] = top;
            }
        }
    }
}