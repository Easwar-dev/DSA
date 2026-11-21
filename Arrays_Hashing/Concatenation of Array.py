from typing import List


class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [0] * (n * 2)

        for i in range(n):
            ans[i], ans[n + i] = nums[i], nums[i]

        return ans


if __name__ == "__main__":
    s = Solution()
    print(s.getConcatenation([1, 2, 1]))     # [1, 2, 1, 1, 2, 1]
    print(s.getConcatenation([1, 3, 2, 1]))  # [1, 3, 2, 1, 1, 3, 2, 1]