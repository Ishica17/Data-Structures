class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0,ans=0,diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
                
                sum=nums[i]+nums[j]+nums[k];
                if(sum == target){return target;}
                else  if((diff)>Math.abs(sum-target))
                {
                    diff=Math.abs(sum-target);
                    ans=sum;
                }
                 if(sum >target)
                {
                  k--;
                }else{
                    j++;
                }
            }

        }
      return ans;  
    }
}
