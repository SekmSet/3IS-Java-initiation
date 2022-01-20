package projet;

import java.util.ArrayList;
import java.util.Scanner;

public class tableauDynamic {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOfInteger = new ArrayList<>();
        ArrayList<String> arrayListOfString = new ArrayList<>();
        ArrayList<Double> arrayListOfDouble = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir l'âge du salarié : ");

        arrayListOfInteger.add(scanner.nextInt());
        System.out.println("Age : " + arrayListOfInteger.get(0));

        int age;

        do {
            System.out.println("Veuillez saisir votre âge ou 0 pour arrêter : ");
            age = scanner.nextInt();
            if(age != 0)
                arrayListOfInteger.add(age);
        } while (age > 0);

        for (int i = 0; i < arrayListOfInteger.size(); i++) {
            System.out.println("Age à l'indice  " + i + ": " + arrayListOfInteger.get(i));
        }
    }
}
