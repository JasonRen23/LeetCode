public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        
        if(nums.length<3||nums==null){
            return result;
        }
        //进行排序后续更方便处理
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                if(nums[i]+nums[low]+nums[high]<0){
                    low++;
                    while(nums[low]==nums[low-1]&&low<high)low++;
                }else if(nums[i]+nums[low]+nums[high]>0){
                    high--;
                    while(nums[high]==nums[high+1]&&low<high)high--;
                }else{
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));//将可能结果以数组形式放在列表中
                    low++;
                    high--;
                    while(nums[low]==nums[low-1]&&low<high)low++;
                    while(nums[high]==nums[high+1]&&low<high)high--;
                }
            }
        }
         return result;
        
    }
}
