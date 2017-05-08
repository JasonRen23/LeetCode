//70.98%
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasNum = gas.length;
        int total = 0;
        int index = -1;
        for(int i = 0, sum = 0; i < gasNum; ++i ){
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0){
                index = i;
                sum = 0;
            }
        }
        return total >= 0 ? index+1 : -1;
    }
}