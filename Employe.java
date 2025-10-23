import java.util.Scanner;

public class Employe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables pour stocker le salaire maximum
        double salaireMax = 0;
        String nomMax = "";
        String prenomMax = "";
        
        // Boucle pour ajouter plusieurs employés
        boolean continuer = true;
        
        while (continuer) {
            // Demander les informations de l'employé
            System.out.println("\n--- Nouvel employé ---");
            
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            
            System.out.print("Prénom: ");
            String prenom = scanner.nextLine();
            
            System.out.print("Âge: ");
            int age = scanner.nextInt();
            
            System.out.print("Salaire: ");
            double salaire = scanner.nextDouble();
            
            // Vérifier si c'est le salaire maximum
            if (salaire > salaireMax) {
                salaireMax = salaire;
                nomMax = nom;
                prenomMax = prenom;
            }
            
            // Demander si l'utilisateur veut ajouter un autre employé
            System.out.print("\nVoulez-vous ajouter un autre employé? (oui/non): ");
            scanner.nextLine(); // Pour consommer le caractère de nouvelle ligne
            String reponse = scanner.nextLine();
            
            if (reponse.equalsIgnoreCase("non") || reponse.equalsIgnoreCase("n")) {
                continuer = false;
            }
        }
        
        // Afficher le salaire maximum
        System.out.println("\n--- Résultat ---");
        System.out.println("Le salaire le plus élevé est: " + salaireMax);
        System.out.println("Il appartient à: " + prenomMax + " " + nomMax);
        
        scanner.close();
    }
}
