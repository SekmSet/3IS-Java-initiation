package projet;

public class tableauStatic {
    public static void main(String[] args) {
        // on commence les tableau à l'indice 0
        intTableau();
        strTableau();
    }

    private static void intTableau() {
        int[] tableauAge = new int[10];

        for (int i = 0; i < tableauAge.length; i++) {
            tableauAge[i] = i;
            System.out.println("Indice " + i + " age : " + tableauAge[i]);
        }
    }

    private static void strTableau() {
        String[] tableau = {"Jean", "Kevin", "Voyou"};
        System.out.println("Nom à l'indice 0 " + tableau[0]);
    }
}
