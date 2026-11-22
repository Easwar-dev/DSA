from typing import List

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        res = 0

        for i in range(len(nums)):
            if nums[i] != val:
                nums[res] = nums[i]
                res += 1
        return res

if __name__ == "__main__":
    s = Solution()
    nums = [3, 2, 2, 3]
    val = 3
    print(s.removeElement(nums,val))