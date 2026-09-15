class Solution {
    public int missingNumber(int[] nums) {
        // nums=[3,0,1]
        int i=0;
        while(i<nums.length){
            // lets consider correct ele for comparison
            int correct=nums[i];
            // now compare ele at correct and element at i if not same then swap
            // consider i<nums.length because it goes out of bound
            if(nums[i]<nums.length &&nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;

            }
            // if if become false then it is sorted we have to move forward
            else{
                i++;
            }
        }
            // now find missing one in sorted as nums are sorted then nums[i]==index
            for(i=0;i<nums.length;i++){
                if(nums[i]!=i){
                    return i;
                }
            }
          
   
        
        // if not found it must be length of arr
        return nums.length;
    }
}