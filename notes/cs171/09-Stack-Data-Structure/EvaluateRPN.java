import java.util.Stack;

public class EvaluateRPN {
    public static void main(String[] args) {
        System.out.println(evalRPN(args));
    }

    /**
     * Reverse Polish Notation (RPN):
     *      3 4 + ===> 3 + 4 = 7
     *      - Each operator will operate on its proceeding 2 operands
     *      - Each operator will produce a result that will be the operand of some subsequent operator
     * We will use a Stack to implement this algorithm
     * @param inp = array of String representing an RPN expression (e.g.: "3" "4" "+')
     */
    public static int evalRPN(String[] inp) {
        Stack<Integer> opStack = new Stack<>(); // Stack containing the prior oprands
        String s; // Help variable containg the next symbol
        for (int i = 0; i < inp.length; i++) {
            s = inp[i]; // s = next item/symbol in input (as String !)
            if (s.equals("+") || s.equals("-") || s.equals("x") || s.equals("/")) {
                // the next symbol is an operator
                int o2 = opStack.pop(); // Get the last 2 operands
                int o1 = opStack.pop();

                int r = operate(s, o1, o2); // Perform operation
                opStack.push(r); // Save result (operand) on stack

            } else { // the next symbol is an oprands
                opStack.push(Integer.parseInt(s)); // Save number as Integer
            }
        }
        return opStack.pop(); // Return result (was saved on stack)
    }

    public static int operate(String op, int o1, int o2) {
        if (op.equals("x")) { // Multiply
            return o1 * o2;
        } else if (op.equals("/")) {
            return o1/o2;
        } else if (op.equals("+")) {
            return o1 + o2;
        }
        else if (op.equals("-")) {
            return o1 - o2;
        } else {
            return 0;
        }
    }
}
