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
	      int []fact=new int[n];//�׳�
	      fact[0]=1;
	      for(int i=1;i<n;i++)  fact[i]=i*fact[i-1];
	      k=k-1;//�������������������0��ʼ
	      StringBuilder sb=new StringBuilder();
	      for(int i=n;i>0;i--){
	          int ind=k/fact[i-1];
	          k=k%fact[i-1];
	          sb.append(number.get(ind));
	          number.remove(ind);
	      }//���һ��ѭ����ȡ���������е��������ĵ�һ��
	      //System.out.println(sb.toString());
	      return sb.toString();
	    }

}

