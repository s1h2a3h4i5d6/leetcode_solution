class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int twice=2*arr[i];
        for(int j=arr.length-1;j>=0;j--){
            if(i!=j&& arr[j]== twice){
                return true;
            }
        }
        }
        return false;
    }
}