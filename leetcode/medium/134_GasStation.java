class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int gaz = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++) {
            total_gas += gas[i] - cost[i];
            gaz += gas[i] - cost[i];
            while (gaz < 0) {
                gaz = 0;
                start = i + 1;
            }

        }

        return total_gas < 0 ? -1 : start;
    }
}