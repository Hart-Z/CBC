/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        int[] test1 = {-40,-20,-1,1,2,3,5,7,9,12,13};
        int[] test2 = {-10,-5,2,2,2,3,4,7,8,12,13};
        System.out.println(find_magic(test2));
    }

    public static int find_magic(int[] array) {
        return find_magic1(array,0,array.length-1);
    }

    public static int find_magic(int[] array , int l ,int r) {
        if(l>r) return -1;
        int mid = (l+r)/2;
        if(array[mid] == mid )   return mid;
        else if(array[mid]>mid) return find_magic(array,l,mid-1);
        else    return find_magic(array,mid+1,r);
    }

    public static int  find_magic1(int[] array , int l ,int r) {
        if(l>r) return -1;
        int mid = (l+r)/2;
        if(array[mid]==mid) return mid;
        
        int left_index = Math.min(mid-1, array[mid]);
        int left = find_magic(array,l,left_index);
        if(left>=0)  return left;

        int right_index = Math.max(mid+1,array[mid]);
        int right = find_magic(array,right_index,r);

        return right;

    }

}