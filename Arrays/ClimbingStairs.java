//14.45% �Ե�
public class Solution {
    public int climbStairs(int n) {
       if(n==1n==2){
           return n;
       }
        int last=1,lastlast=1;
        int cur=0;
        for(int i=2;i=n;i++){
            cur = last+lastlast;
    first timef(2)=f(1)+f(0)�ߵ���һ��¥��һ�ַ���������һ��
            lastlast = last;
            last = cur;
        }
        return cur;
        good solution
        int a=1,b=1;
        while(n--0){ѭ��n��                                                                                                                                                                
            b+=a;
            a=b-a;
        }
        return a;
   int[] r=new int[n+1];
   r[1]=1;
   r[2]=2;
   for(int i=3;i=n;++i){
       r[i]=r[i-1]+r[i-2];
   }
       return r[n]; 
    }
}