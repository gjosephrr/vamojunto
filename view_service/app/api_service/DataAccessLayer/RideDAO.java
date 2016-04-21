package api_service.DataAccessLayer;

/**
 * Created by joseph on 20/04/16.
 */
import api_service.models.Ride;
import api_service.models.User;

import java.util.ArrayList;

public class RideDAO {

    private ArrayList<Ride> ridesDB;

    public RideDAO(){
        ridesDB = new ArrayList<Ride>();
    }

    public Ride registerRide(String driver, String driverPhone,String init_address,
                             String final_address, String departure_time,
                             int seats){

                // Instantiate new ride
                Ride ride = new Ride(driver, driverPhone, init_address, final_address, departure_time, seats);

        ridesDB.add(ride);

        return ride;
    }

    public ArrayList<Ride> getAllRides(){
        return this.ridesDB;
    }

}

