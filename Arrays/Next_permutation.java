package solution;

public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
		            int []nums={1,3,2};
		            
			      int p=0;
			      int b=0;
			      for(int i=nums.length-1;i>0;i--){
			          if(nums[i-1]<nums[i]){
			              p=i;
			              break;
			          }
			      }
			      if(p==0){
			          for(int i=0;i<nums.length;i++){
			              if(nums.length-1>0){
			              b=nums[i];
			              nums[i]=nums[nums.length-1-i];
			              nums[nums.length-1-i]=b;
			              }
			          }
			          
			      }else{
			         for(int i=nums.length-1;i>p-1;i--){
			             if(nums[p-1]<nums[i]){
			                
			                 b=nums[i];
			                 nums[i]=nums[p-1];
			                 nums[p-1]=b;
			                 break;
			             }
			         }
			      }
			      for(int i=p,j=nums.length;i<j;i++,j--){
			             
			             
			              b=nums[i];
			              nums[i]=nums[nums.length-1-i+p];
			              nums[nums.length-1-i+p]=b;
			             }	         
			      }
			     
			          
			      
			    
			        
			    
		

	}


