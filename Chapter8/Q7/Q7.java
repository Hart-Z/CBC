import java.util.*;

/**
 * Q7
 */
public class Q7 {

    public static void main(String[] args) {
        int[] test = new int[4];
        for(int i=0 ; i<4;i++)
        {
            test[i] = i;
        }
        // ArrayList
        // System.out.print(test);
        List<List<Integer>> res = permuteUnique(test);
        for(List<Integer> line : res)
        {
            for(int ele : line)
            {
                System.out.print(ele+" ");
            }
            System.out.print("\n");
        }
        // Arrays
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,res,new ArrayList<Integer>(),visited);
        return res;
    }
    
    public static void backtrack(int[] nums, List<List<Integer>> res , ArrayList<Integer> curr,boolean[] visited)
    {
        if(curr.size()==nums.length)
        {
            // if(!res.contains(curr)) // Take most time !
            // {
                res.add(new ArrayList<Integer>(curr));
            // }
        }
        else{
            for(int i=0 ; i<nums.length ; i++)
            {   
                if(!visited[i] && (i<1 || !(nums[i]==nums[i-1]&&visited[i-1])))
                {
                    curr.add(nums[i]);
                    visited[i] = true;
                    backtrack(nums,res,curr,visited);
                    curr.remove(curr.size()-1);
                    visited[i] = false;
                }
            }
        }    
        
    }

    // public static List<List<Integer>> permuteUnique1(int[] nums) {

    //     return res;
    // }
}