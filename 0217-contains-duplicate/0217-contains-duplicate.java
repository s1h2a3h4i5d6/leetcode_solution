// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length - 1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }

//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length- 1;i++){
            int j = i +1 ;
                if(nums[i]==nums[j]){
                    return true;
                }

            
        }
        return false;
    }
}