import fr.todo.models.Todo;
import fr.todo.tools.Menu;


import java.util.*;

import static fr.todo.tools.Priorite.*;

public class Main {
    public static void main(String[] args) {

        // initialisation de l'array List
        ArrayList<Todo> todos = new ArrayList<>();
        Todo thing1 = new Todo("Courses", "faire la liste de courses", FAIBLE);
        Todo thing2 = new Todo("Jardin", "planter les graines", MOYEN);
        Todo thing3 = new Todo("Voiture", "appeler le garage pour rdv", URGENTISSIME);
        // todos.add(thing1);
        // todos.add(thing2);
        // todos.add(thing3);

        // initialisation de l'app Todo
        boolean next = true;
        do {
            Menu.afficherMenu();
            next = Menu.choixMenu(todos);
        } while (next);
    }
}