class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=leftIndex(nums,target), right= rightIndex(nums,target);
        int[] arr ={left, right};
        return arr;
}
private int rightIndex(int[] nums, int target)
{
    int start=0, end=nums.length-1, index =-1;
    while(start<=end)
    {
        int mid = (start+end)/2;
        if(nums[mid]==target)
        {
            index=mid;
            start=mid+1;
        }
        else if(nums[mid]>target)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    return index;
}
private int leftIndex(int[] nums, int target)
{
    int start=0, end=nums.length-1, index =-1;
    while(start<=end)
    {
        int mid = (start+end)/2;
        if(nums[mid]==target)
        {
            index=mid;
            end=end-1;
        }
        else if(nums[mid]>target)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    return index;
}
}
Console
