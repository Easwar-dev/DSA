from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        hashMap = {}

        for key, val in enumerate(nums):
            hashMap[val] = key

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in hashMap and hashMap[diff] != i:
                return [i, hashMap[diff]]

if __name__ == "__main__":
    s = Solution()
    nums = [3, 4, 5, 6]
    target = 7
    print(s.twoSum(nums, target))