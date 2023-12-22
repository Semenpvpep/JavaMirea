import java.util.Stack;

public class RPN {

    Stack<Double> numbers = new Stack<>();
    String postfix;
    static String infix;
    public RPN(String infix){
        this.infix = infix;
        postfix = convertToRPN();
    }

    public double calc(){
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                double num = Double.parseDouble(token);
                numbers.push(num);
            } else {
                double operand2 = numbers.pop();
                double operand1 = numbers.pop();
                double result = evaluate(token, operand1, operand2);
                numbers.push(result);
            }
        }
        return numbers.pop();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static double evaluate(String operator, double operand1, double operand2) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> 0.0;
        };
    }

    public static String convertToRPN() {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> simbols = new Stack<>();
        char[] infixChar = infix.toCharArray();
        for (int i = 0; i < infix.length(); i++) {
            char c = infixChar[i];
            if (Character.isDigit(c)) {
                postfixExpression.append(c);
                postfixExpression.append(" ");
            } else if (c == '(') {
                simbols.push(c);
            } else if (c == ')') {
                while (!simbols.isEmpty() && simbols.peek() != '(') {
                    postfixExpression.append(simbols.pop());
                    postfixExpression.append(" ");
                }
                simbols.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!simbols.isEmpty() && priority(simbols.peek()) >= priority(c)) {
                    postfixExpression.append(simbols.pop());
                    postfixExpression.append(" ");
                }
                simbols.push(c);
            }
        }
        while (!simbols.isEmpty()) {
            postfixExpression.append(simbols.pop());
            postfixExpression.append(" ");
        }
        return postfixExpression.toString().trim();
    }

    public static int priority(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }
}