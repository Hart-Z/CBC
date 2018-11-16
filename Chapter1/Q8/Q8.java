import java.util.HashSet;

/**
 * Q8
 */
public class Q8 {

    public static void main(String[] args) {
        int[][] m ={{0,1,1,1},{1,1,0,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        
        for(int[] array : m)
        {
            for(int i : array)
            {
                System.out.print(i);
               
            }
            System.out.print("\n");
        }

        ZM(m);

        for(int[] array : m)
        {
            for(int i : array)
            {
                System.out.print(i);
               
            }
            System.out.print("\n");
        }
    }

    public static void ZM(int[][] m) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int ele : row)
        {
            for (int i = 0; i < m[0].length; i++) {
                m[ele][i] = 0;
            }
        }

        for(int ele : col)
        {
            for (int i = 0; i < m.length; i++) {
                m[i][ele] = 0;
            }
        }

    }

    public static void ZM1(int[][] m) {
        boolean row_1 = false;
        boolean col_1 = false;
        int len_r = m.length;
        int len_c = m[0].length;

        for (int i = 0; i < len_c; i++) {
            if(m[0][i]==0){
                row_1 = true;
                break;
            }
        }
        for (int i = 0; i < len_r; i++) {
            if(m[i][0]==0)
            {
                col_1 = true;
                break;
            }
        }

        for (int i = 1; i < len_r; i++) {
            for (int j = 1; j < len_c; j++) {
                if(m[i][j]==0){
                    m[0][j] = 0;
                    m[i][0] = 0;
                }
            }
        }


        for (int i = 1; i < len_r; i++) {
            if (m[i][0]==0) {
                for (int j = 1; j < len_c; j++) {
                    m[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < len_c; i++) {
            if (m[0][i]==0) {
                for (int j = 1; j < len_r; j++) {
                    m[j][i] = 0;
                }
            }
        }

        if(row_1){
            for (int i = 0; i < len_c; i++) {
                m[0][i] = 0;
            }
        }
        if (col_1) {
            for (int i = 0; i < len_r; i++) {
                m[i][0] = 0;
            }
        }
    }
}