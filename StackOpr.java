package Task3;

import java.util.Stack;

public class StackOpr {

	    private Stack<Integer> stack;

	    public StackOpr() {
	        this.stack = new Stack<>();
	    }

	    public void pushElement(int element) {
	        stack.push(element);
	        System.out.println("Pushed element: " + element);
	    }

	    public void popElement() {
	        if (!stack.isEmpty()) {
	            int poppedElement = stack.pop();
	            System.out.println("Popped element: " + poppedElement);
	        } else {
	            System.out.println("Stack is empty. Cannot pop.");
	        }
	    }
	    
	    public void displayStack() {
	        System.out.println("Current Stack: " + stack);
	    }
}
