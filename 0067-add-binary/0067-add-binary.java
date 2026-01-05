import java.math.BigInteger;
class Solution {

    public String addBinary(String a, String b) {

        int len = a.length();
        BigInteger bit1 = BigInteger.ZERO;
        BigInteger bit2 = BigInteger.ZERO;
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) == '1') {
                int pos = len - 1 - i;
                bit1 = bit1.setBit(pos);
            }
        }
        len = b.length();
        for (int i = 0; i < len; i++) {
            if (b.charAt(i) == '1') {
                int pos = len - 1 - i;
              bit2 = bit2.setBit(pos);
            }
        }
        BigInteger ans = bit1.add(bit2);
       
       
        return ans.toString(2);
    }
}