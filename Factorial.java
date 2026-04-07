public class Factorial {

        public static void main(String[] args) {
            System.out.println("Enter a number:");
            int n = Integer.parseInt(System.console().readLine());
            long result = factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }
        
        public static long factorial(int n) {
        
            if (n < 0) {
                throw new IllegalArgumentException("Number must be non-negative");
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    
}
