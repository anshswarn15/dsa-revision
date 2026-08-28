class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = {}
        l =[]
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in mp :
                l.append(mp.get(complement))
                l.append(i)
                break
            else:
                mp[nums[i]]= i
        return l
        