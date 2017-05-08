package solution;
import java.util.*;

public class Permutation_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=getPermutation(7, 1655);
     System.out.println(s);
     
	}
	private static String getPermutation(int n, int k) {
		 
	      List<Integer> number=new LinkedList<Integer>();
	      for(int i=1;i<=n;i++)number.add(i);
	      int []fact=new int[n];//阶乘
	      fact[0]=1;
	      for(int i=1;i<n;i++)  fact[i]=i*fact[i-1];
	      k=k-1;//生成数组索引，数组从0开始
	      StringBuilder sb=new StringBuilder();
	      for(int i=n;i>0;i--){
	          int ind=k/fact[i-1];
	          k=k%fact[i-1];
	          sb.append(number.get(ind));
	          number.remove(ind);
	      }//最后一次循环会取出增序排列的两个数的第一个
	      //System.out.println(sb.toString());
	      return sb.toString();
	    }

}

