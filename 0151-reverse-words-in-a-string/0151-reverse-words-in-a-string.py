class Solution(object):
    def reverseWords(self, s): 
        """
        :type s: str
        :rtype: str
        """
        words=s.split()
        reverseW= reversed(words)
        reverseS= " ".join(reverseW)
        return reverseS


        