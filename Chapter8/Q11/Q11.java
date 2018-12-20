/**
 * Q11
 */
public class Q11 {

    public static void main(String[] args) {
        
    }

    public static int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] pool = new int[target+1];
        for(int ele:nums)
        {
            if(ele<=target)
                pool[ele] += 1;
        }
        
        for(int i=0 ; i<=target ; i++)
        {
            for(int j=0 ; j<nums.length;j++)
            {
                int index = i-nums[j];
                if(index>=0)
                {
                    pool[i]+=pool[index];
                }
            }
        }
        return pool[target];
    }
}