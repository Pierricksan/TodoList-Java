package fr.todo.tools;

import fr.todo.models.Todo;
import java.util.ArrayList;


public class ViewTodos {
    public static void viewTodos(ArrayList<Todo> array){
        if (!array.isEmpty()) {
            for (Todo thing :array){
                System.out.printf("Titre : %s\ndescription : %s\nNiveau d'urgence : %s \n",
                        thing.getTitre().toString(),
                        thing.getDescription().toString(),
                        thing.urgence);
            }
        } else {
            System.out.println("la liste de Todo est vide, remplissez-là ! ou alors vous avez tout fait ... bravo !");
        }
    }

}
