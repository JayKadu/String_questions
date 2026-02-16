// 190. Reverse Bits
// Reverse bits of a given 32 bits signed integer.
//1
class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=31;i++){
            sb.append((n >> i) & 1);
        }
        long output = Long.parseLong(sb.toString(), 2);
        if(sb.length()== 32 && sb.charAt(0) == 1)
            output -= (1L << 32);
        return (int) output;
    }
}

//2
class Solution {
    public int reverseBits(int n) {
        int output  =   0 ;
        for( int i = 0 ; i < 32 && n != 0 ; i++ ){
            int current = n & 1;
            output |= current << ( 31 - i );

            n >>>=  1;
        }
        return output;
    }
}
