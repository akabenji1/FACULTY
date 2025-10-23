import java.util.Scanner;

public class Calc {
    char op;
    int x, y;
    
    public Calc(int x, int y, char op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }
    
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        
        while (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Re-enter the operation (+, -, *, /):");
            op = scanner.next().charAt(0);
        }
        
        if (op == '+') {
            System.out.println(x + y);
        } else if (op == '-') {
            System.out.println(x - y);
        } else if (op == '*') {
            System.out.println(x * y);
        } else if (op == '/') {
            if (y != 0) {
                System.out.println(x / y);
            } else {
                System.out.println("Division by zero error");
            }
        } else {
            System.out.println("Unknown operation");
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        
        Calc calc = new Calc(x, y, op);
        calc.calculate();
        
        scanner.close();
    }
}
