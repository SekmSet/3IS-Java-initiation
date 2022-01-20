package exercices;
/*
    – 2 joueurs A et B
    – Chacun montre un certain nombre de doigts (de 0 à 5)
    – Si la somme des nombres de doigts montrés est paire, le premier joueur a gagné
    – Sinon c'est le second.
    – Le problème est de faire prendre la décision par l'ordinateur.
*/

class Game {
    public static void main(String[] args) {
        int playerA;
        int playerB;
        int sum;

        do {
            playerA = randomNumber();
            playerB = randomNumber();
            sum = playerA + playerB;
        } while ( sum == 0);

        if (sum % 2 == 0)
            System.out.println("playerA gagne et playerB perd. Le nombre " +  sum + " est pair.");
        else
            System.out.println("playerB gagne et playerA perd. Le nombre " +  sum + " est impair.");
    }

    private static int randomNumber() {
        int max = 4;
        int min = 0 ;
        return (int) ((Math.random() * (max - min)) + min);
    }
}