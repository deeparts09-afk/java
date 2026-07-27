public class palindrome {
    public static void main(String[] args) {
        String str = "Malayalam";
        String normalized = str.toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                System.out.println("Not a palindrome");
                return;
            }
            start = start + 1;
            end = end - 1;
        }

        System.out.println("Palindrome");
    }
}
