package api_service.controllers;

import api_service.DataAccessLayer.UserDAO;
import api_service.models.User;

import api_service.DataAccessLayer.RideDAO;
import api_service.models.Ride;

import play.*;
import play.mvc.*;

import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by js on 19/04/16.
 */
public class APIController extends Controller{

    static UserDAO userDAO = new UserDAO();
    static RideDAO rideDAO = new RideDAO();

    public Result newUser(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        // Gets user fields
        String name = dynamicForm.get("name");
        String email= dynamicForm.get("email");
        String schoolId = dynamicForm.get("school_id");
        String password = dynamicForm.get("password");
        String password2 = dynamicForm.get("password2");
        String phoneNumber = dynamicForm.get("phoneNumber");
        String neighborhood = dynamicForm.get("neighborhood");
        String street = dynamicForm.get("street");
        // Ride information
        String departureNeighborhood = dynamicForm.get("departure_neighborhood");
        String arrivalNeighborhood = dynamicForm.get("arrival_neighborhood");
        String departureTime = dynamicForm.get("departure_timestamp");
        String returnTime = dynamicForm.get("return_timestamp");
        int vehicleSeats = Integer.parseInt(dynamicForm.get("vehicle_seats"));

        // User departure and return rides
        Ride userDeparture = rideDAO.registerRide(name, departureNeighborhood, arrivalNeighborhood, 
            departureTime, vehicleSeats);
        Ride userReturn = rideDAO.registerRide(name, arrivalNeighborhood, departureNeighborhood,
            returnTime, vehicleSeats);

        userDAO.registerUser(name, email, schoolId,
                password, password2, phoneNumber,
                neighborhood, street, vehicleSeats);

        userDAO.listUsers();
        return ok(dynamicForm.get("school_id"));
    }



    public static User login(){

        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String schoolId = dynamicForm.get("school_id");
        String password = dynamicForm.get("password");

        return userDAO.authenticateUser(schoolId,password);

    }

    public static void listRides(){
        ArrayList<Ride> rides = rideDAO.getAllRides();
        System.out.println("entrou");
        for(Ride ride: rides){
            System.out.println(ride);
        }
    }

    public ArrayList<Ride> notifications(){

        return null;

    }

}
