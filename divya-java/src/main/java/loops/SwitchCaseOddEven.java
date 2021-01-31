package loops;

public class SwitchCaseOddEven {

    public void oddOrEven(int number) {
        System.out.println("### Learning Switch Case ###");
        switch (number % 2) {
            case 0:
                System.out.println("Entered number is " + number + ", its an even number");
                break;
            case 1:
                System.out.println("Entered number is " + number + ", its an odd number");
                break;
            default:
                System.out.println("Enter valid number");
        }
    }
}
