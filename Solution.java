class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ret = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            boolean broken = false;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    ret[i] = prices[i] - prices[j];
                    broken = true;
                    break;
                }
            }

            if(!broken){
                ret[i] = prices[i];
            }
        }

        return ret;
    }
}
