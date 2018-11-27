/**
 * Q9
 */
public class Q9 {

    public static void main(String[] args) {
        
    }

    public static List<String> generateParenthesis(int n) {
        int[] parens = {n,n};
        List<String> res = new ArrayList<String>();
        backtrack(parens,"",res);
        return res;
    }
    
    public static void backtrack(int[] parens,String curr,List<String> res){
        if(parens[0]==0 && parens[1]==0)    res.add(curr);
        else{
            if(parens[0]>0){
                parens[0]--;
                backtrack(parens,curr+"(",res);
                parens[0]++;
            }
            if(parens[1]>parens[0]){
                parens[1]--;
                backtrack(parens,curr+")",res);
                parens[1]++;
            }
        }
    }
    
}