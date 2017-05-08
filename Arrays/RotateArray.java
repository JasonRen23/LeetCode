//98.93%
public class Solution {
    public void rotate(int[] nums, int k) {
        
        int len = nums.length;
        int pos = len - k%len;
        
        int[] arr = new int[len*2];
        System.arraycopy(nums,0 ,arr,0,len);
        System.arraycopy(nums,0 ,arr,len,len);
        
        System.arraycopy(arr,pos ,nums,0,len);
        
    }
}
//16.76% three reverse
public class Solution {
    public void rotate(int[] nums, int k) {
       int len = nums.length;
       k %= len;
       
       
       if(len == 2&& k == 1){
           reverse(nums, 0, 1);
           return;
       }
       if(len <= 2){
           
           return;
       }
       reverse(nums, 0, len-k-1);
       reverse(nums, len-k, len-1);
       reverse(nums, 0, len-1);
       return;
       } 

     public static void reverse(int[] nums, int start, int end){
           while(start < end){
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end] = temp;
               ++start;
               --end;
           }
       }
    
    
    
}

