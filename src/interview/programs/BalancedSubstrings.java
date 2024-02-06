public class BalancedSubstrings {
    public static void printBalancedSubstrings(String s) {
        int rCount = 0;
        int lCount = 0;
        int hold = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                rCount++;
            } else {
                lCount++;
            }

            if (rCount == lCount) {
                System.out.println(s.substring(hold, hold + 2 * rCount));
                lCount = 0;
                rCount = 0;
                hold = i+1;
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
//        printBalancedSubstrings("RLRRLLRLRL");
        // Output:
        // RL
        // RRLL
        // RL
        // RL

//        printBalancedSubstrings("LLLLRRRR");
        // Output:
        // LLLLRRRR

        printBalancedSubstrings("RLLLLRRRLR");
        // Output:
        // RL
        // LLLRRR
        // LR
    }
}
