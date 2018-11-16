/**
 * Q9
 */
public class Q9 {

    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "rbottlewate";
        System.out.println(isR1(a,b));
    }

    public static boolean isR1(String a , String b) {
        if(a.length()!=b.length())  return false;
        
        String pool = a+a;
        // if(pool.indexOf(b)==-1) return false;
        if (!pool.contains(b)) {
            return false;
        }
        return true;

    }
}