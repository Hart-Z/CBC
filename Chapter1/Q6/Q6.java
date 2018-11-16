/**
 * Q6
 */
public class Q6 {

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        String s2 = "abcdef";
        System.out.println(Compression(s2));
    }

    public static String Compression(String s) {
        char curr = '^';
        int count = 0;
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : array)
        {
            if(curr!=c)
            {
                if(count>0)
                {
                    sb.append(curr);
                    sb.append(count);
                }
                curr = c;
                count = 1;    
            }
            else{
                count++;
            }
        }

        if(count>0)
        {
            sb.append(curr);
            sb.append(count);
        }  
        String res = sb.toString();
        return res.length()<s.length()? res: s;

    }
}