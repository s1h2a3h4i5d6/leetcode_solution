// class Solution {
//     public int singleNumber(int[] nums) {

//         for(int i=0;i<=nums.length;i++){
//             if(nums.length==1){
//                 return nums[i];
//             }
//             if(i<nums.length&&nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
            
            

//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
         if(nums.length==1){
                return nums[0];
            }
         boolean swapped;
     
        for(int i=0;i<nums.length-1;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
                
            }
            if(!swapped){
                    break;
                }
        }
             for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];  
    }
     
    }
    
    

