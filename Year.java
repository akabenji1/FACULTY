import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une année: ");
        int annee = scanner.nextInt();
        
        if (Year(annee)) {
            System.out.println("L'année " + annee + " est bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
        
        scanner.close();
    }
    
    public static boolean Year(int annee) {
        return (annee % 4 == 0) && (annee % 100 != 0 || annee % 400 == 0);
    }
}
