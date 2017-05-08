//88.59%
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <=1){
            return false;
        }
      Arrays.sort(nums);
      int len = nums.length;
      for(int i = 1; i < len; ++i){
          if(nums[i] == nums[i-1]){
              return true;
          }
      }
      return false;
      
    }
}