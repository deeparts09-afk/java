public class primenumber {
    public static void main(String[] args) {
        int num = 13;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }

        }

        System.out.println(num + " is a prime number.");

    }
}
