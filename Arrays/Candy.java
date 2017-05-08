public class Solution {
    
     public int candy(int[] ratings) {
       
           final int ChildNum = ratings.length;
       
           final int[] increments = new int[ChildNum];
       
           int i,inc;
       
       
     
       



          for (i = ChildNum - 2; i >= 0; --i) {
            
               if (ratings[i] > ratings[i + 1] && increments[i] <= increments[i + 1]) {
   
                  increments[i] = increments[i + 1] + 1;
            
            }
        
       }
        
          for (i = 1; i <= ChildNum - 1; ++i) {
            
              if (ratings[i] > ratings[i - 1] && increments[i] <= increments[i - 1]) {
             
                 increments[i] = increments[i - 1] + 1;
           
                 }
       
          }
       
      
          int sum = ChildNum ;
       
          for(int increment : increments){
         
             sum += increment;
      
           }
       
           return sum;
       
   
    }


}