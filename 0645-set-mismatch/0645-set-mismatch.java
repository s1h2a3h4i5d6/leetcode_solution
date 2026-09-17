class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            // lets consider correct ele for comparison
            int correct=nums[i]-1;
            // now compare ele at correct and element at i if not same then swap
            // consider i<nums.length because it goes out of bound
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;

            }
            // if if become false then it is sorted we have to move forward
            else{
                i++;
            }
        }
            int[]ans=new int[2];
            for(i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    ans[0]=nums[i];
                    ans[1]=i+1;
                     return ans;
                }
            }
            return ans;
        
        
    }
}