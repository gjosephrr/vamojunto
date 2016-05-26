package api_service.controllers;

import DataAccessLayer.UserDAO;
import api_service.models.User;

import DataAccessLayer.RideDAO;
import api_service.models.Ride;

import DataAccessLayer.SolicitationDAO;
import api_service.models.Solicitation;

import play.mvc.*;

import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import java.lang.reflect.Array;
import java.util.ArrayList;

import play.i18n.*;

/**
 * Created by js on 19/04/16.
 */
public class APIController extends Controller{

    static UserDAO userDAO = new UserDAO();
    static RideDAO rideDAO = new RideDAO();
    static SolicitationDAO solicitationDAO = new SolicitationDAO();

    public Result newUser(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        // Gets user fields
        String name = dynamicForm.get("name");
        String email= dynamicForm.get("email");
        String schoolId = dynamicForm.get("school_id");
        String password = dynamicForm.get("password");
        String password2 = dynamicForm.get("password2");
        String phoneNumber = dynamicForm.get("phone_number");
        String neighborhood = dynamicForm.get("neighborhood");
        String street = dynamicForm.get("street");
        // Ride information
        String departureNeighborhood = dynamicForm.get("departure_neighborhood");
        String arrivalNeighborhood = dynamicForm.get("arrival_neighborhood");
        String departureTime = dynamicForm.get("departure_timestamp");
        String returnTime = dynamicForm.get("return_timestamp");
        int vehicleSeats = Integer.parseInt(dynamicForm.get("vehicle_seats"));

        ArrayList<String> errors = checkErrors(schoolId, password, password2, phoneNumber);

        if(errors == null) {

            // User departure and return rides
            Ride userDeparture = rideDAO.registerRide(schoolId, phoneNumber,
                    departureNeighborhood.toLowerCase(), arrivalNeighborhood.toLowerCase(),
                    departureTime, vehicleSeats);

            Ride userReturn = rideDAO.registerRide(schoolId, phoneNumber,
                    arrivalNeighborhood.toLowerCase(), departureNeighborhood.toLowerCase(),
                    returnTime, vehicleSeats);

            userDAO.registerUser(name, email, schoolId,
                    password, password2, phoneNumber,
                    neighborhood, street, vehicleSeats,
                    userDeparture, userReturn);

            return ok(index.render(null));
        }else{
            return ok(registration_error.render(errors));
        }
    }

    private ArrayList<String> checkErrors(String schoolId, String password1, String password2, String phoneNumber){
        ArrayList<String> errors = new ArrayList<String>();

        if(schoolId == null || schoolId.length() <= 0 ||
            (schoolId.length() != 9 && schoolId.length() != 7) ||
            !schoolId.matches("\\d+")){
            System.out.println(schoolId.length() != 9);
            String err = Messages.get("errors.school_id");
            errors.add(err);
        }

        if(UserDAO.isUser(schoolId)){
            String err = Messages.get("errors.school_id.occupied");
            errors.add(err);
        }

        if(phoneNumber == null || phoneNumber.length() != 9 || !phoneNumber.matches("\\d+")){
            String err = Messages.get("errors.phone");
            errors.add(err);
        }

        if(password1 == null || password2 == null || !password1.equals(password2)){
            String err = Messages.get("errors.password");
            errors.add(err);
        }

        if(errors.size() > 0)
            return errors;
        else
            return null;
    }

    // AQUI PEGAMOS AS VIAGENS SIMILARES (SAÍDA)
    // ESTE MÉTODO E O PRÓXIMO, PRECISAM SER ATUALIZADOS PARA CONSIDERAR COMO SIMILARS, VIAGENS COM ROTAS QUE INCLUAM A ORIGEM
    // DO PASSAGEIRO (NO MOMENTO, APENAS LISTA VIAGENS COM MESMA ORIGEM)
    public static ArrayList<Ride> getSimilarDepartureRides(User activeUser){
        ArrayList<Ride> allRides = rideDAO.getAllRides();
        ArrayList<Ride> similarDepartureRides = new ArrayList<Ride>();
        
        for(Ride ride: allRides){
            if(ride.isSimilarTo(activeUser.getDepartureRide()) && 
                !ride.getDriver().equals(activeUser.getDepartureRide().getDriver()) &&
                ride.getSeats() > 0) {
                similarDepartureRides.add(ride);
            }
        }

        return similarDepartureRides;
    }

    public static ArrayList<Solicitation> getSolicitations(String schoolId){
        ArrayList<Solicitation> solicitations = solicitationDAO.getAllSolicitations();
        ArrayList<Solicitation> mySolicitations = new ArrayList<Solicitation>();

        for (Solicitation sol : solicitations) {
            if(sol.getDriver().equals(schoolId)) {
                mySolicitations.add(sol);
            }
        }

        return mySolicitations;
    }

    public static void requestRide(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String driverId = dynamicForm.get("driver");
        String passengerId = dynamicForm.get("passenger");
        String rideId = dynamicForm.get("ride_id");

        User passenger = userDAO.getUser(passengerId);
        Ride ride = rideDAO.getRide(Integer.parseInt(rideId));

        solicitationDAO.registerSolicitation(passenger, driverId, ride);

    }

    // AQUI PEGAMOS AS VIAGENS SIMILARES (VOLTA)
    public static ArrayList<Ride> getSimilarReturnRides(User activeUser){
        ArrayList<Ride> allRides = rideDAO.getAllRides();
        ArrayList<Ride> similarReturnRides = new ArrayList<Ride>();

        for(Ride ride: allRides){
            if(ride.isSimilarTo(activeUser.getReturnRide()) && 
                !ride.getDriver().equals(activeUser.getReturnRide().getDriver()) &&
                ride.getSeats() > 0){
                similarReturnRides.add(ride);
            }
        }

        return similarReturnRides;
    }

    public static User login(){

        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String schoolId = dynamicForm.get("school_id");
        String password = dynamicForm.get("password");

        return userDAO.authenticateUser(schoolId, password);
    }

    public static ArrayList<Ride> myRides(String school_id){
        ArrayList<Ride> rides = rideDAO.getMyRides(school_id);

        return rides;
    }

    public static void registerRide(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String schoolId = dynamicForm.get("school_id");
        String phoneNumber = dynamicForm.get("phone_number");
        String departureNeighborhood = dynamicForm.get("departure_neighborhood");
        String arrivalNeighborhood = dynamicForm.get("arrival_neighborhood");
        String departureTime = dynamicForm.get("departure_timestamp");
        String returnTime = dynamicForm.get("return_timestamp");
        int vehicleSeats = Integer.parseInt(dynamicForm.get("vehicle_seats"));

        // User departure and return rides
        Ride userDeparture = rideDAO.registerRide(schoolId, phoneNumber,
                departureNeighborhood.toLowerCase(), arrivalNeighborhood.toLowerCase(),
                departureTime, vehicleSeats);

        Ride userReturn = rideDAO.registerRide(schoolId, phoneNumber,
                arrivalNeighborhood.toLowerCase(), departureNeighborhood.toLowerCase(),
                returnTime, vehicleSeats);


            System.out.println(userReturn);

    }

}
