/**
 * Leetcode 702
 */
public class Q4 {
    public static void main(String[] args) {
        
    }

    public int search(ArrayReader reader, int target) {
        if(reader.get(0)==2147483647)   return -1;
        int right = 1;
        
        while(reader.get(right)!=2147483647 && reader.get(right)<target){
            right*=2;
        }
        
        return bi(reader,right/2,right,target);
    }
    
     int bi(ArrayReader reader,int l,int r,int target)
    {
        if(l>r)
            return -1;
        int mid = (l+r)/2;
        if(reader.get(mid)==target) return mid;
         
        if(reader.get(mid)>target)
        {
            return bi(reader,l,mid-1,target);
        }
        else{
            return bi(reader,mid+1,r,target);
        }
        
    }
    
}