package fr.todo.models;

import java.util.List;

public class TodoList {


    // attributs
    // création de la liste Objet todos qui prendra des objets fait sur la base de l'objet Todo
    private List<Todo> todos;

    // setter & getter
    public List<Todo> getTodos() {
        return todos;
    }
    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
    // constructeur
    TodoList(List<Todo> todos) {
        this.todos = todos;
    }

}
