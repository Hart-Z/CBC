/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        
    }

    public static int search(int[] nums, int target) {
        return bi(0,nums.length-1,nums,target);
    }
    
    public static int   bi(int l,int r,int[] nums , int target)
    {
        if(l>r) return -1;
        int mid = (l+r)/2;
        if(nums[mid]==target)   return mid;
        if(nums[l]==target) return l;
        if(nums[r]==target) return r;
        if(nums[mid]>nums[l]){
            if(nums[mid]>target && target>nums[l]){
                return bi(l,mid-1,nums,target);
            }
            else{
                return bi(mid+1,r,nums,target);
            }
            
        }
        else{
            if(nums[mid]<target && nums[r]>target)
            {
                return bi(mid+1,r,nums,target);
            }
            else{
                return bi(l,mid-1,nums,target);
            }
        }
    }
}