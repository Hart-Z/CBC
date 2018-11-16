/**
 * Q5
 */
public class Q5 {
    public static void main(String[] args) {
        String a = "pre";
        String b = "opre";
        System.out.println(Oneaway(a, b));
    }
    
    public static boolean Oneaway(String a , String b)
    {
        int a_len = a.length();
        int b_len = b.length();
        int flag = Math.abs(a_len-b_len)>1? 0 : Math.abs(a_len-b_len)== 0 ? 1:2;
        switch (flag) {
            case 0:
                return false;

            case 1:
                int counter=0;
                for(int i=0 ; i<a_len ; i++)
                {
                    if(a.charAt(i)!=b.charAt(i)){
                        counter++;
                        if(counter>1)   return false;
                    }
                }
                return true;
            
            default:
                if(a_len > b_len)
                {
                    String temp = a;
                    a = b;
                    b = temp;
                }

                int b_p = 0;
                int counter2 = 0;
                for (int i = 0; i < a.length(); i++) {
                    if(a.charAt(i)!=b.charAt(b_p))
                    {
                        counter2++;
                        if(counter2>1)  return false;
                        b_p++;
                    }
                    b_p++;
                }
                return true;
        }
    }
}