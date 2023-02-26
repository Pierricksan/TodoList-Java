package fr.todo.models;

import fr.todo.tools.Priorite;

public class Todo {

    public String titre, description;
    public Priorite urgence;
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Priorite getUrgence() {
        return urgence;
    }
    public void setUrgence(Priorite urgence) {
        this.urgence = urgence;
    }
    public Todo(String titre, String description, Priorite urgence){
        this.titre = titre;
        this.description = description;
        this.urgence = urgence;
    }

}
