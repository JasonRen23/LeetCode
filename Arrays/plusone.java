//49.07%
public class Solution {
    //public int[] plusOne(int[] digits) {
     
        /*int n=digits.length;
        for(int i=n-1;i>=0;--i){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
       }
       
        //判断是否产生新位
       int []newdigits=new int[digits.length+1];
        newdigits[0]=1;
        return newdigits;*/
      /*int i=1;
    while( digits[digits.length-i] == 9 && (digits.length-i) >= 0 ){
        if( (digits.length-i)== 0) {
            //Method 1:*********************************************************** 
            //Add 0 to the begin of digits, other elements will be moved backward automatically. Refer to function vector.emplace().
            //digits.emplace( digits.begin() , 0); 
           //Method 2:*********************************************************** 
           //When all elements in digits are 9, simply push_back 0 to the end and reset all elements to 0 except  the first one which is set to 1;
            //digits.push_back(0);
            //digits[ 0 ] = 1;
            //return digits;
        int []newdigits=new int[digits.length+1];
        newdigits[0]=1;
        return newdigits;
        }
        digits[digits.length-i] = 0;
        i++;
    }
    digits[digits.length-i]++;
    return digits; 
    }*/
    public int[] plusOne(int[] digits) {
    
       int flagallnine=1;
        for(int j=0;j<digits.length;++j ){
            if(digits[j]!=9){
                flagnine=0;
                break;
            }
        }
        if(flagallnine==1){
            int []newdigits=new int[digits.length+1];
        newdigits[0]=1;
        return newdigits;
        }
        for(int i = digits.length-1; i>=0; i--){ 
            digits[i]=digits[i]+flag;
            if(digits[i]>9){
                flag=1;
                digits[i]=0;
            }else{
                return digits;//当某一位不需进位时，快速跳出
            }
        }
        
       return digits;   
    }
    
}