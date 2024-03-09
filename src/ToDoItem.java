public class ToDoItem   {
    private String description;
    private boolean isDone;

    public ToDoItem(String description){
        isDone = false;
        this.description = description;
    }

    // getters
    public String getDescription() {
        return description;
    }
    public boolean isDone(){
        return isDone;
    }

    // setters
    public void setDescription(String description){
        this.description = description;
    }

    public void setDone(Boolean isDone){
        this.isDone = true;
    }

    public void setNotDone(Boolean isDone){
        this.isDone = false;
    }

}
