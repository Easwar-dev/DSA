from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        res = count = 0

        for n in nums:
            if count == 0:
                res = n
            count += (1 if n == res else -1)
        return res

if __name__ == "__main__":
    s = Solution()
    n = [5,5,1,1,1,5,5]
    print(s.majorityElement(n))