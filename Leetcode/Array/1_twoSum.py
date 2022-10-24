"""

给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/two-sum
"""

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # 结果dict集合
        res_dict = {}
        # 遍历list，enumerate可以遍历下标和数值
        for idx, num in enumerate(nums):
            othNum = target - num
            if othNum in res_dict:
                return [idx, res_dict[othNum]]
            else:
                res_dict[num] = idx
        return None