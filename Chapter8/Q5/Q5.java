/**
 * Q5
 */
public class Q5 {

    public static void main(String[] args) {
        int a = 89, b=99;
        System.out.println(Multiply(a, b));
        System.out.println(a*b);
    }

    public static int Multiply(int a , int b) {
        int small = a<b? a : b;
        int big = a<b? b : a;
        return Helper(small,big);
    }

    public static int Helper(int small , int big)
    {
        if(small==0)    return 0;
        if(small==1)    return big;
        
        int s = small>>1;
        int half = Helper(s,big);
        
        if(small%2==0)
            return half+half;
        else
            return half+half+big;
    }
}