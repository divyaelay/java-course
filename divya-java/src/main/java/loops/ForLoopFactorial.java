package loops;

public class ForLoopFactorial {

    public void factorial(int number) {
        System.out.println("### Calculating factorial using for loop ###");
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Factorial of entered value " + number + " is: " + result);
    }
}
