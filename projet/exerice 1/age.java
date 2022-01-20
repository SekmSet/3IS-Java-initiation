import java.util.Scanner;

/*

 * Auteur : Priscilla Joly
 */
class Age {
    public static void main(String[] args) {

        System.out.println("Quel est ton âge ?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 0 || age > 100) {
            System.out.println("Impossible");
            return;
        }

        if (age >= 65) {
            System.out.println("Retraité");
        }  else if (age >= 40) {
            System.out.println("Senior");
        } else if (age >= 18) {
            System.out.println("Jeune actif");
        } else if (age > 12) {
            System.out.println("Ado");
        } else if (age <= 12) {
            System.out.println("Enfant");
        }  else {
            System.out.println("Erreur");
        }
    }
}