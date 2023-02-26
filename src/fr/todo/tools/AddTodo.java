package fr.todo.tools;

import fr.todo.models.Todo;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTodo {

    public static void addOneTodo(ArrayList<Todo> array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez écrire un titre : ");
        String title = scanner.nextLine();
        // éviter l'entrée vide
        while(title.toString() == "") {
            System.out.println("Veuillez écrire un titre : ");
            title = scanner.nextLine();
        }
        System.out.println("Veuillez écrire une description : ");
        String descriptive = scanner.nextLine();
        // éviter l'entrée vide
        while(descriptive.toString() == ""){
            System.out.println("Veuillez écrire une description : ");
            descriptive = scanner.nextLine();
        }
        // choix de l'urgence
        Priorite[] tabUrgence = Priorite.values();
        System.out.println("sélectionner une priorite (entre 1 et 3) : ");
        for (int i = 0 ; i < tabUrgence.length ; i++) {
            System.out.printf("%d) %s\n", i+1, tabUrgence[i]);
        }
        int choixUrgence = scanner.nextInt();
        scanner.nextLine();
        Priorite urgence = tabUrgence[choixUrgence - 1];

        // création de l'objet todo
        Todo thing = new Todo(title, descriptive, urgence );
        // ajout de l'objet Todo créé dans la liste
        array.add(thing);

        System.out.printf("--\nAjout fait avec succès, le todo ajouté est : \nTitre : %s\nDescription : %s\nNiveau de priorité : %s \n--",
                title,
                descriptive,
                urgence);
    }

}
