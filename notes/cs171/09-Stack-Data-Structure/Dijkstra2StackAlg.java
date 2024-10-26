import java.util.Stack;

public class Dijkstra2StackAlg {
    /**
     * Problem description: You are given a fully parenthesized arithmetic expression using only x, /, +, − operations.
     *      (3 + 4)
     *      (1 + (2 + 3) x (4 x 5))
     * Write an algorithm to evaluate expressions in this form: Edsger Dijkstra 2 Stacks Algorithm
     * This algorithm uses two stacks in total:
     *      - An operand stack that stores the operands in the input
     *      - An operator stack that stores the operators in the input
     *
     * The algorithm must use the earliest 2 operands and the earliest operator before a right parenthesis. This can be
     * accomplished by:
     *      - storing the operands in the inputs in an operand stack
     *      - storing the operators in the inputs in an operator stack
     * The results of the computation are operands for a later operation. Therefore, the result of an operation must be
     * pushed on to operand stack.
     *
     * Notice that the left parenthsis ( does not convey any information.
     *
     * @param inp a fully parenthesized arithmetic expression using only x, /, +, − operations
     */
    public static Integer eval(String[] inp) {
        Stack<Integer> operandStck = new Stack<>();
        Stack<String> operatorStck = new Stack<>();
        for (int i = 0; i < inp.length; i++) {
            String s = inp[i]; // s = next input symbol
            if (s.equals("(")) {
                // "(" does not convey any information...
            } else if (s.equals("+") || s.equals("-") || s.equals("x") || s.equals("/")){
                // If s is an operator
                operatorStck.push(s);
            } else if (s.equals(")")) {
                // If s is ")", perform operation
                int o2 = operandStck.pop(); // Get the last 2 operands
                int o1 = operandStck.pop();
                String op = operatorStck.pop(); // Get the last operator

                int r = EvaluateRPN.operate(op, o1, o2); // Perform the specified operation
                operandStck.push(r); // Push the result on operand stack
            } else {
                // If s is a number
                operandStck.push(Integer.parseInt(s));
            }
        }
        return operandStck.pop(); // Return result
    }

    public static void main(String[] args) {
        System.out.println(eval(args));
    }
}
