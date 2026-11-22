from typing import List

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashSet = set()

        for i in nums:
            if i in hashSet:
                return True
            hashSet.add(i)
        return False


if __name__ == "__main__":
    s = Solution()
    print(s.hasDuplicate([1, 2, 3, 3]))
    print(s.hasDuplicate([1, 2, 3, 4]))