// class Solution {
//     public int countGoodNumbers(long n) {
//         long mod = 1000000007;
        
//         long evenCount = (n + 1) / 2; // Count of even positions (0-indexed)
//         long oddCount = n / 2; // Count of odd positions (0-indexed)
        
//         long evenChoices = 5; // Number of choices for even positions (0, 2, 4, 6, 8)
//         long oddChoices = 4; // Number of choices for odd positions (2, 3, 5, 7)
        
//         long result = 1;
        
//         for (int i = 0; i < evenCount; i++) {
//             result = (result * evenChoices) % mod; // Multiply the current result by the number of choices for even positions
//         }
        
//         for (int i = 0; i < oddCount; i++) {
//             result = (result * oddChoices) % mod; // Multiply the current result by the number of choices for odd positions
//         }
        
//         return (int) result;
//     }
// }



class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1000000007;
        long evenCount = (n + 1) / 2; // Number of even positions
        long oddCount = n / 2; // Number of odd positions

        long result = powMod(5, evenCount); // Number of possibilities for even positions
        result = (result * powMod(4, oddCount)) % MOD; // Number of possibilities for odd positions

        return (int) result;
    }

    // Helper method to calculate (base^exponent) % MOD
    private long powMod(int base, long exponent) {
        long result = 1;
        int MOD = 1000000007;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (int) (((long) base * base) % MOD);
            exponent /= 2;
        }

        return result;
    }
}




