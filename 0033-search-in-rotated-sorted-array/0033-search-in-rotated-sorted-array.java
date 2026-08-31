class Solution {
    public int search(int[] nums, int target) {
        int ans=peak(nums);
        int res1=binary1(nums,ans,target);
        if(res1!=-1){
            return binary1(nums,ans,target);
        }else{
            return binary2(nums,ans,target);
        }
        
    }
     static int binary1(int[]nums,int ans,int target){
        int start=0;
        int end=ans;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    static int binary2(int[]nums,int ans,int target){
        int start=ans+1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }

    static int peak(int[]nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //consider 4 cases
            if (mid<end &&nums[mid]>nums[mid+1]) {
                return mid;
            }
            if (mid>start &&nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            if(nums[start]<nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;

    }
}

