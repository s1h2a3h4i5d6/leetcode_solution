/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return orderAsc(mountainArr,target,start);

    }
    static int orderAsc( MountainArray mountainArr,int target,  int start){
        int newStart=0;
        int end=start;
        while(newStart<=end){
            int mid=(newStart+end)/2;
            if(mountainArr.get(mid)>target){
                end=mid-1;
            }else if(mountainArr.get(mid)<target){
                newStart=mid+1;
            }else {
                return mid;
            }
        } 
        return orderDesc(mountainArr, target, end);
    }
    static int orderDesc(MountainArray mountainArr,int target,  int end){
        int newstart=end;
        int newEnd=mountainArr.length()-1;
        while(newstart<=newEnd){
            int mid=(newstart+newEnd)/2;
            if(mountainArr.get(mid)>target){
                newstart=mid+1;
            }else if(mountainArr.get(mid)<target){
                newEnd=mid-1;
                
            }else {
                return mid;
            }

        } 
        return -1;


    }
    }
