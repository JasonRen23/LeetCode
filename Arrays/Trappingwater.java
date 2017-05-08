package solution;

public class Trappingwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
		int waters=trap(height);
		System.out.println(waters);
		
		
	}

	private static int trap(int[] height) {
        final int n=height.length;
        int[] leftpeak=new int[n];
        int[] rightpeak=new int[n];
        for(int i=1;i<n;++i){
            leftpeak[i]=Math.max(leftpeak[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;--i){
            rightpeak[i]=Math.max(rightpeak[i+1],height[i+1]);
        }
        
        int sum=0;
        for(int i=0;i<n;++i){
            int water=Math.min(leftpeak[i],rightpeak[i]);
            if(water>height[i])
            sum+=water-height[i];
        }
        return sum;
    }
}
