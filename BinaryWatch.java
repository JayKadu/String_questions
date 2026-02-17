// 401. Binary Watch

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        for( int h = 0 ; h < 12 ; h++ ){
            for( int m = 0 ; m < 60 ; m++ ){
                int totalBit = Integer.bitCount(h) + Integer.bitCount(m);
                if(totalBit == turnedOn) {
                    String timeString = String.format("%d:%02d", h, m);
                    res.add(timeString);
                }
            }
        }
        return res;
    }
}
