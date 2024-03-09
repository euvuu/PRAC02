import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {

    private ArrayList<User> users;

    //TO DO Now: add a constructor to initialise the users list with the default user
    public AuthenticationService(ArrayList<User> defaultUser){
        this.users = new ArrayList<User> (defaultUser);
    }

    //TO DO Now: implement the signUp method to add a new user to the list if the username is not taken and return the user; returns nul otherwise
    @Override
    public User signUp(String username, String password) {
        return null;
    }

    //TO DO Now: implement the logIn method to return the user if the username and password match,and null otherwise
    @Override
    public User logIn(String username, String password) {
        return null;
    }
}
