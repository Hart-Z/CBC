/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        
    }

    public static void merge(int[] a , int m , int[] b , int n) {
        int p = (m--)+(n--)-1;
        while(m>=0 && n>=0)
            a[p--] = a[m]>b[n]? a[m--]:b[n--];
        
        while(n>=0) a[p--] = b[n--];
    }
}