class Solution {
    public int thirdMax(int[] nums) {
        
        Long max = null;
        Long max2 = null;
        Long max3 = null;
        
        for (int num : nums) {

            if ((max != null && num == max) ||
                (max2 != null && num == max2) ||
                (max3 != null && num == max3)) {
                continue;
            }
            
            if (max == null || num > max) {
                max3 = max2;
                max2 = max;
                max = (long) num;
            }
            else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = (long) num;
            }
            else if (max3 == null || num > max3) {
                max3 = (long) num;
            }
        }
        
        return max3 != null ? max3.intValue() : max.intValue();
    }
}