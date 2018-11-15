class Q4{
    public static void main(String[] args) {
        String test = "AaBbc-( cio";
        String test2 = "aabb-; ccp";
        System.out.println(PP2(test));
        System.out.println(PP2(test2));
    }

    public static boolean PP(String s)
    {
        s = s.toLowerCase();
        int[] pool = new int['z'-'a'+1];
        char[] array = s.toCharArray();
        int odd = 0;
        for(char c : array)
        {
            boolean flag = c>='a' && c<='z';
            if(flag)
            {
                pool[c-'a']++;
                if(pool[c-'a']%2==1)
                    odd++;
                else
                    odd--;
            }
        }
        return odd<=1;
    }

    public static boolean PP2(String s){
        int pool = 0;
        s = s.toLowerCase();
        char[] array = s.toCharArray();
        for(char c : array)
        {
            if(c>='a' && c<='z')
            {
                int offset = c-'a';
                pool ^=(1<<offset);
            }
        }
        return (pool&(pool-1))==0;
    }
}