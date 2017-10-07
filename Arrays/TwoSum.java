public class Solution {
      public int[] twoSum(int[] nums,int target){

       if(nums==null||nums.length<2){
       return null;
}
      int max=nums[0];
      int min=nums[0];
     /*求出数组中的最大值和最小值*/
      for(int i=1;i<nums.length;i++){
       if(nums[i]>max){
        max=nums[i];
          }else if(nums[i]<min){
         min=nums[i]; 
          }
      }
       int start=Math.max(min,target-max);
       int end=Math.min(max,target-min);
        Integer[] buf=new Integer[end-start+1];
         int[] res=new int[2];
         for(int i=0;i<nums.length;i++){
          if(nums[i]>=start&&nums[i]<=end){
            if(target-nums[i]>=start&&target-nums[i]<=end&&buf[target-nums[i]-start]!=null){
                 res[0]=buf[target-nums[i]-start];
                 res[1]=i;
                 break;
                  }
              buf[nums[i]-start]=i;
             }
           }

return res;

   }
}
