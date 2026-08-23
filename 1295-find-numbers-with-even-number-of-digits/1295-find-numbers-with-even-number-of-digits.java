class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noOfDigits=digits(num);
        if(noOfDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
}            