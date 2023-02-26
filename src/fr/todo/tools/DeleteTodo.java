package fr.todo.tools;

import fr.todo.erreur.ListVide;
import fr.todo.models.Todo;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteTodo {
    public static void deleteLastTodo(ArrayList<Todo> array) throws ListVide {
        Scanner scanner = new Scanner(System.in);
        if(array.isEmpty()){
            throw new ListVide("La liste est vide, impossible d'éxécuter la commande");
        } else {
            System.out.println("\nVous allez supprimer le dernier todo de la liste:\n");
            System.out.printf("\nVoici le dernier todo enregistré : \n - Titre : %s \n - Description : %s \n - Priorité : %s \n",
                    array.get(array.size() - 1).getTitre(),
                    array.get(array.size() - 1).getDescription(),
                    array.get(array.size() - 1).getUrgence());
            System.out.println("\nEtes vous sur de vouloir supprimer ce dernier todo ? oui / non");
            String choix = scanner.nextLine();

            switch (choix.toString()) {
                case "oui":
                    array.remove(array.size() - 1);
                    System.out.println("Supprimé avec succès");
                    break;
                case "non":
                    System.out.println("pas de suppression");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez écrire 'oui' ou 'non' ");
                    break;
            }
        }
    }

    public static void deleteOneTodo( ArrayList<Todo> array) throws ListVide{
        //affichage du titre des to do présent et de leur index

        if(array.isEmpty()){
            throw new ListVide("La liste est vide ou opération impossible à éxécuter");

        } else {
            System.out.println("\nVous allez supprimer un todo avec l'index\n");
            for (int i = 0 ; i < array.size() ; i++) {
                System.out.println( (i+1) + " ) " + array.get(i).getTitre());
            }
            // demande du todo à supprimer
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quel index souhaitez vous supprimer ? ");
            int index = scanner.nextInt();
            // on vide le cache
            scanner.nextLine();
            // on retient le todo qui sera supprimé pour l'afficher plus tard
            String deletedTodo = array.get(index-1).getTitre();
            // remove du todo choisi
            array.remove(index - 1);
            // possibilité de faire une exception : liste vide ou erreur, suppression impossible
            System.out.printf("Suppression faites du todo %s avec succès \n", deletedTodo );
        }

    }

}
