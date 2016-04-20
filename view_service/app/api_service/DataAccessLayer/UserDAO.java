package api_service.DataAccessLayer;

import api_service.models.User;
import java.util.ArrayList;

/**
 * Created by js on 19/04/16.
 */
public class UserDAO {

    private ArrayList<User> usersDB;

    public UserDAO(){
        usersDB = new ArrayList<User>();
    }

    public User registerUser(String name, String email,
                             String school_id, String password,
                             String password2, String phoneNumber,
                             String neighborhood, String street,
                             int vehicleSeats){

        // Instantiate new user
        User newUser = new User(name, email, school_id,
                password, password2, phoneNumber,
                neighborhood, street, vehicleSeats);

        // Save new user
        usersDB.add(newUser);

        return newUser;
    }

    // TEMP
    public void listUsers(){
        for (User user: usersDB) {
            System.out.println(user);
            System.out.println();
        }
    }

}
