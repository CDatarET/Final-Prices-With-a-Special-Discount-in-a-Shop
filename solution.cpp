class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        vector<int> v;
        for(int i = 0; i < prices.size(); i++){
            bool broken = false;
            for(int j = i + 1; j < prices.size(); j++){
                if(prices[j] <= prices[i]){
                    v.push_back(prices[i] - prices[j]);
                    broken = true;
                    break;
                }
            }

            if(!broken) v.push_back(prices[i]);
        }

        return v;
    }
};
