package Task3;

public class StackMain {
    public static void main(String[] args) {
        StackOpr stackOps = new StackOpr();

        stackOps.pushElement(10);
        stackOps.pushElement(20);
        stackOps.pushElement(30);
        stackOps.pushElement(40);
        stackOps.pushElement(50);
        stackOps.pushElement(35);
        stackOps.pushElement(40);

        stackOps.displayStack();

        stackOps.popElement();
        stackOps.popElement();
        stackOps.popElement();
        stackOps.popElement();

        stackOps.displayStack();

        stackOps.popElement();
        stackOps.popElement(); // Try to pop from an empty stack
        stackOps.displayStack();
    }
}
