package solution;

import java.util.ArrayList;
import java.util.Arrays;



public class TestGA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum=360;
		final int geneLength=360;
       int MaxgenNum=userNum-1;
       int genNum=(int)Math.round(Math.random()*(MaxgenNum-1)+1);//cdnnumber
      byte []Marked_total=new byte[geneLength];  
      byte []Chromosome=new byte[geneLength];
      
    int count=0;
      /*while(count<genNum){
    	
    		Chromosome[(int)Math.round(Math.random()*geneLength)]=1;
    		count++;*/
   
 
      
    		
    			/*ArrayList<Integer> geneIds = new ArrayList<Integer>();
    			int cdnNum;

    				cdnNum = (int)Math.ceil( Math.random() * userNum );
    				int i;
    				for(i = 0; i < cdnNum; i++){
    					
    					int nodeId = (int)Math.ceil( Math.random() *geneLength );
    					while (geneIds.contains(nodeId)){
    						nodeId = (int)Math.ceil( Math.random() * geneLength );
    					
    					}
    					geneIds.add(nodeId);
    				
    			
    			}
    			
    		for (Integer s : geneIds) {
    			    System.out.println(s);
    			} 
      */
    
    	 
    	//byte gene=(byte)Math.round(Math.random());
    
    	
    	  
    	 // if(count<genNum){
    //		 if(==1)count++; 
    	// }
    	 //else       break;
    		
    		
    		
    //  System.out.println("基因数："+count); 
    System.out.println("基因数："+genNum);  
	//System.out.println("染色体："+Arrays.toString(Chromosome));
	}

}
