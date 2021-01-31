package loops;

public class WhileDoWhile {

    public void whileCondition() {
        int i = 0;
        System.out.println("### While first checks condition, then executes ###");
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public
    void doWhileCondition() {
        System.out.println("### do...while first executes and then checks condition, then executes ###");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
