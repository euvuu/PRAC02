import java.util.ArrayList;

public class User {
    private String username;
    private String password;

    // new rando code lmao
    // pls commit to master idfk how
    private ArrayList<ToDoItem> toDoItems;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.toDoItems = new ArrayList<>();
    }

    public ArrayList<ToDoItem> getToDoItems(){
        return toDoItems;
    }

    public void add(ToDoItem item){
        toDoItems.add(item);
    }

    public void remove(ToDoItem item){
        toDoItems.remove(item);
    }

    /**
     * Gets the username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the username of the user.
     * @param username The username to set.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password of the user.
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }


}