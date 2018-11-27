/**
 * Q5
 */
public class Q5 {

    public static void main(String[] args) {
        String[] test = {"at","","","","ball","","","car","","","dad","",""};
        System.out.println(search(test,"ball"));
    }

    public static int search(String[] strs, String target , int l , int r) {
        if(l>r) return -1;
        int mid = (l+r)/2;

        if(strs[mid].isEmpty()){
            int p_1 = mid-1;
            int p_2 = mid+1;
            while(true)
            {
                if(p_1<l && p_2>r)  return -1;

                else if(p_2<=r && !strs[p_2].isEmpty())
                {
                    mid = p_2;
                    break;
                }

                else if(p_1>=l && !strs[p_1].isEmpty())
                {
                    mid = p_1;
                    break;
                }
            }
            p_1--;
            p_2++;
        }

        if(strs[mid].equals(target))   return mid;
        else if(strs[mid].compareTo(target)>0)    return search(strs,target,l,mid-1);
        else    return search(strs,target,mid+1,r);
    }

    public static int search(String[] strs , String target)
    {
        return search(strs,target,0,strs.length-1);
    }
}