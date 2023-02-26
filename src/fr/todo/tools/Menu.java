package fr.todo.tools;

import java.util.ArrayList;
import java.util.Scanner;
import fr.todo.erreur.ListVide;
import fr.todo.models.Todo;

public class Menu {
    // affichage du menu
    public static void afficherMenu(){
        String operationOne     = "1 ) Ajouter un todo";
        String operationTwo     = "2 ) Voir tous les Todos";
        String operationThree   = "3 ) Suppprimer un todo avec l'index";
        String operationFour    = "4 ) Supprimer le dernier Todo";
        String left             = "5 ) Quitter";

        System.out.printf("\nVeuillez sélectionner une opération : \n%s\n%s\n%s\n%s\n%s",
                operationOne,
                operationTwo,
                operationThree,
                operationFour,
                left);
    }
    // menu pour sélectionner le choix
    public static boolean choixMenu(ArrayList<Todo> array){
            Scanner scan = new Scanner(System.in);
            switch(scan.next().charAt(0)){
                case'1':
                    System.out.println("\nVous voulez ajouter un todo :\n");
                    AddTodo.addOneTodo(array);
                    return true;
                case '2' :
                    System.out.println("\nVoici la liste de tous les todos :\n");
                    ViewTodos.viewTodos(array);
                    return true;
                case '3':
                    try{

                        DeleteTodo.deleteOneTodo(array);
                    } catch (ListVide e) {
                        System.out.println(e.getMessage());
                    }
                    return true;
                case '4':
                    try {
                        DeleteTodo.deleteLastTodo(array);
                    } catch (ListVide e) {
                        System.out.println(e.getMessage());
                    }
                    return true;
                case '5':
                    System.out.println("Vous quittez l'application");
                    return false;
                default :
                    System.out.println("Veuillez sélectionner une opération (entre 1 et 5)");
            }
            return true;
    }
}
