package api_service.models;

/**
 * Created by joseph on 19/04/16.
 */

import api_service.models.Ride;
import play.i18n.*;
import javax.persistence.*;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;

@Entity
public class User extends Model {

    private enum UserRoles {
        DRIVER, PASSENGER;
    }

    public static Finder<String,User> find = new Finder<>(User.class);
    @Constraints.Required
    private String name;

    private String email;
    @Id
    private String schoolId;

    private String password;

    private String phoneNumber;

    private String neighborhood;

    private String street;

    private int vehicleSeats;

    private UserRoles role;

    private Ride departureRide;

    private Ride returnRide;

    public User(String name, String email,
                String school_id, String password,
                String password2, String phoneNumber,
                String neighborhood, String street,
                int vehicleSeats,
                Ride departureRide, Ride returnRide) {

        this.name = name;
        this.email = email;
        this.schoolId = school_id;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.neighborhood = neighborhood;
        this.street = street;
        this.departureRide = departureRide;
        this.returnRide = returnRide;

        if (vehicleSeats != 0) {
            userBecomeDriver(vehicleSeats);
        } else {
            this.role = UserRoles.PASSENGER;
        }

    }

    public void userBecomeDriver(int vehicleSeats) {
        this.vehicleSeats = vehicleSeats;
        this.role = UserRoles.DRIVER;
    }

    public Ride getDepartureRide() {
        return this.departureRide;
    }

    public Ride getReturnRide() {
        return this.returnRide;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public String getStreet() {
        return this.street;
    }

    public String getSchoolId() {
        return this.schoolId;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        String toString = Messages.get("user.toString", this.name, this.schoolId, this.role, this.departureRide.getInitAddress());
        return toString;
    }

}