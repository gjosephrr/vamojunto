package api_service.DataAccessLayer;

import api_service.models.User;

import java.util.ArrayList;

import api_service.models.Ride;

/**
 * Created by js on 19/04/16.
 */
public class UserDAO {

    private ArrayList<User> usersDB;

    public UserDAO() {
        usersDB = new ArrayList<User>();

                 Ride userDeparture = null;
                Ride userReturn = null;

                User newUser = registerUser("biscoito", "biscoito@gmail.com", "424242", "123", "123", "424242", "far away", "uma", 0, userDeparture, userReturn);

                        usersDB.add(newUser);

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
}
