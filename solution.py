class Solution:
    def finalPrices(self, prices: list[int]) -> list[int]:
        ret = []
        for i in range(len(prices)):
            broken = False
            for j in range(i + 1, len(prices)):
                if prices[j] <= prices[i]:
                    ret.append(prices[i] - prices[j])
                    broken = True
                    break

            if not broken:
                ret.append(prices[i])

        return ret
