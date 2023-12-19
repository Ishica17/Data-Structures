class Solution {
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        int count=-1;
        for(int i=0;i<=len1-len2;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0) && len2<=len1)
            {
                int endl=i+len2;
                String str=haystack.substring(i,endl);
                if(str.equals(needle))
                {
                    count=i;
                    break;
                }
            }
        }
        if(count!=-1)
        {
            return count;
        }
        else
        return -1;
    }
}
