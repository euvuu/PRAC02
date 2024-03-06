public class ToDoItem   {
    private String description;
    private boolean isDone;

    public ToDoItem(String description){
        isDone = false;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public boolean isDone(){
        return isDone;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setDone(Boolean isDone){
        this.isDone = isDone;
    }

}
