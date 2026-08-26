class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans=new int[2];
       ans[0]=firstPosition(nums, target);
       ans[1]=secondPosition( nums, target);
       return ans;
    }
    int firstPosition(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int firstPosition=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                firstPosition=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return firstPosition;
    }
    int secondPosition(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
       int  secondPosition=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                secondPosition=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return secondPosition;
}
}