import java.util.*;

/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        String[] test = {"eat","tea","tan","ate","nat","bat"};
        for(String ele : Sort(test))
            System.out.println(ele);
    }

    public static String[] Sort(String[] strs) {
        Arrays.sort(strs,new Comparator<String>(){
            public int compare(String a, String b){
                char[] A = a.toCharArray();
                char[] B =b.toCharArray();
                Arrays.sort(A);
                Arrays.sort(B);
                return new String(A).compareTo(new String(B));
            }
        });

        return strs;
    }
}