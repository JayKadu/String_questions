// 696. Count Binary Substrings

// Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
// Substrings that occur multiple times are counted the number of times they occur.

class Solution {
    public int countBinarySubstrings(String s) {
        int index=0;
        int length = s.length();
        List<Integer> groupCount = new ArrayList<>();
        while(index < length){
            int count =1;
            while (index+1 < length && s.charAt(index+1)==s.charAt(index)){
                index++;
                count++;
            }
            groupCount.add(count);
            index++;
        }
        int result=0;
        for(int i=1;i<groupCount.size();i++){
            result += Math.min(groupCount.get(i-1),groupCount.get(i));
        }
        return result;
    }
}
