/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        System.out.println(TripleStep(10));
        System.out.println(TS1(10));
    }

    public static int TripleStep(int N) {
        int[] pool = new int[4];
        pool[1] = 1;
        pool[2] = 2;
        pool[3] = 4;
        if(N<=3)    return pool[N];
        int sum = 0;
        for(int i=4;i<=N;i++)
        {
            sum = pool[1]+pool[2]+pool[3];
            pool[1] = pool[2];
            pool[2] = pool[3];
            pool[3] = sum;
        }
        return sum;
    }

    public static int TS1(int N) {
        if(N<0) return 0;
        else if(N==0)   return 1;
        else{
            return TS1(N-1)+TS1(N-2)+TS1(N-3);
        }
    }
}