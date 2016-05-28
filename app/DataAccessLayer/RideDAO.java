package DataAccessLayer;

/**
 * Created by joseph on 20/04/16.
 */
import api_service.models.Ride;
import api_service.models.User;
import com.avaje.ebean.Ebean;
import play.data.Form;

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
                Ride ride = new Ride(driver, driverPhone, init_address, final_address, departure_time, seats, ridesDB.size() + 1);

        ridesDB.add(ride);

        return ride;
    }

    public Ride getRide(int ride_id){
        for (Ride r : this.ridesDB) {
            if(r.getRideId() == (ride_id)){
                return r;
            }
        }

        return null;
    }

    public ArrayList<Ride> getAllRides(){
        return this.ridesDB;
    }

    public ArrayList<Ride> getMyRides(String school_id){
        ArrayList<Ride> rides = new ArrayList<Ride>();

        for (Ride ride: ridesDB) {
            if (school_id.equals(ride.getDriver())){
                rides.add(ride);
            }

        }
        return rides;


    }

}

