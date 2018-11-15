class Q3{
    public static void main(String[] arg)
    {
        String s = "Mr John Smith    ";
        // System.out.println(URLify1(s));
        System.out.println(URLify2(s.toCharArray(),13));
    }

    public static String URLify1(String s)
    {
        return s.trim().replace(" ","%20");
    }

    public static String URLify2(char[] s, int v)
    {
        int p = s.length-1;
        for(int i=v-1; i>=0;i--)
        {
            if(s[i]==' ')
            {
                s[p] = '0';
                s[p-1] = '2';
                s[p-2] = '%';
                p = p-2;
            }
            else
                s[p] = s[i];
            p--;
        }
        return String.valueOf(s);
    }
}