import java.util.Scanner;

public class Work {
    int x;
    
    public Work(int x) {
        this.x = x;
    }
    
    public class Parité {
        public void checkParity() {
            if (x % 2 == 0) {
                System.out.println("x est pair");
            } else {
                System.out.println("x est impair");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int x = scanner.nextInt();
        
        Work work = new Work(x);
        Work.Parité parité = work.new Parité();
        
        System.out.println("c'est ok");
        parité.checkParity();
        
        scanner.close();
    }
}