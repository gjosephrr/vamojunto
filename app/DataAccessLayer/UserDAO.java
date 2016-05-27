package DataAccessLayer;

import api_service.models.User;

import java.util.ArrayList;

import api_service.models.Ride;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

/**
 * Created by js on 19/04/16.
 */
public class UserDAO {

    private static ArrayList<User> usersDB ;

    public UserDAO() {
        usersDB = new ArrayList<User>();


    }

    public ArrayList<User> getUsersDB(){
        return this.usersDB;
    }

    public User getUser(String school_id) {
        for (User u : this.usersDB) {
            if (u.getSchoolId().equals(school_id)) {
                return u;
            }
        }

        return null;
    }

    public User registerUser(String name, String email,
                             String school_id, String password,
                             String password2, String phoneNumber,
                             String neighborhood, String street,
                             int vehicleSeats,
                             Ride departureRide, Ride returnRide) {

        // Instantiate new user
        User newUser = new User(name, email, school_id,
                password, password2, phoneNumber,
                neighborhood, street, vehicleSeats, departureRide, returnRide);

        // Save new user
        usersDB.add(newUser);

        return newUser;
    }


    public User authenticateUser(String school_id, String password) {
        for (User user : usersDB) {
            if (user.getSchoolId().equals(school_id) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    // LOGIN METHODS

    public static boolean isUser(String school_id){
        for (User u: usersDB) {
            if(u.getSchoolId().equals(school_id))
                return true;
        }

        return false;
    }

    public static User retrieveUser(String school_id){
        if(school_id != null){
            for (User u: usersDB) {
                if(u.getSchoolId().equals(school_id))
                    return u;
            }
        }

        return null;
    }

    public static boolean isValid(String school_id, String password){
        return ((school_id != null)
                &&
                (password != null)
                &&
                isUser(school_id)
                &&
                retrieveUser(school_id).getPassword().equals(password));
    }

}
