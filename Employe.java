import java.util.Scanner;

public class Employe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salaireMax = 0;
        String nomMax = "";
        String prenomMax = "";
        
        
        boolean continuer = true;
        
        while (continuer) {
            
            System.out.println("\n--- Nouvel employé ---");
            
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            
            System.out.print("Prénom: ");
            String prenom = scanner.nextLine();
            
            System.out.print("Âge: ");
            int age = scanner.nextInt();
            
            System.out.print("Salaire: ");
            double salaire = scanner.nextDouble();
            
            if (salaire > salaireMax) {
                salaireMax = salaire;
                nomMax = nom;
                prenomMax = prenom;
            }
            
            System.out.print("\nVoulez-vous ajouter un autre employé? (oui/non): ");
            scanner.nextLine(); 
            String reponse = scanner.nextLine();
            
            if (reponse.equalsIgnoreCase("non") || reponse.equalsIgnoreCase("n")) {
                continuer = false;
            }
        }
        
        System.out.println("\n--- Résultat ---");
        System.out.println("Le salaire le plus élevé est: " + salaireMax);
        System.out.println("Il appartient à: " + prenomMax + " " + nomMax);
        
        scanner.close();
    }
}

