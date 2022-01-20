package exercices;
/*
    Écrire l’algorithme qui affiche la table de multiplication de 6 (pour et tant que)
    • Afficher la table de multiplication à l’ancienne (pour et tant que) :
    6 fois 1 font 6 6 fois 2 font 12
    ...
    6 fois 10 font 60
*/

class Boucle2 {
    public static void main(String[] args) {
        int multiplication;

//       for (int multiple = 0; multiple <= 10; multiple++) {
//           multiplication = multiple * 6;
//           System.out.println("6 fois "  + multiple + " font " + multiplication);
//       }

       int multiple = 0;
       while (multiple <= 10) {
           multiplication = multiple * 6;
           System.out.println("6 fois "  + multiple + " font " + multiplication);
           multiple++;
       }
    }
}