import java.util.*;
/**
 * Q4
 */
public class Q4 {

    public static void main(String[] args) {
        int[] test = {1,2,3};
        for(List<Integer> list : subsets(test))
        {
            for(int ele : list)
            {
                System.out.print(ele);  
            }
            System.out.println();
        }
    }


    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,res,new ArrayList<Integer>(),0);
        return res;
    }
    
    public static void backtrack(int[] nums, List<List<Integer>> res,List<Integer> curr, int pos)
    {
        res.add(new ArrayList(curr));
        for(int i=pos ; i<nums.length ; i++)
        {
            curr.add(nums[i]);
            backtrack(nums,res,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}