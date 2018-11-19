class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dic = {}
        res = []
        for str in strs:
            temp = ''.join(sorted(str))
            if temp in dic:
                dic[temp].append(str)
            else:
                dic[temp] = [str]
                res.append(dic[temp])
        return res

test = Solution()

print test.groupAnagrams(["eat","tea","tan","ate","nat","bat"])
