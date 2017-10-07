public class Solution {

    public int majorityElement(int[] nums) {

        int len = nums.length;

        if(len <= 2){

            return nums[0];

        }

        int count = 1;

        int result = nums[0];

        for(int i=1; i<len; ++i){

            if(result == nums[i]){

                ++count;

                if(count>len/2)break;

            }else{

                --count;

                if(count <= 0){

                    count = 1;

                    result = nums[i];

                }

            }

        }

        return result;

        /*

        int result = 0;

        int count = 0;

        for(int num : nums){

            if(count == 0){

                result = num;

                count = 1;

                continue;

            }

            if(result == num){

                ++count;

               continue;

            }

            --count;

        }

        return result;*/



      

        

    }

}
