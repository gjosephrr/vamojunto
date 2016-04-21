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

    public void registerRide(String driver, String init_address,
                             String departure_time, String final_address,
                             String arrival_time, int seats){

                // Instantiate new ride
                Ride ride = new Ride(driver,init_address, departure_time, final_address, arrival_time, seats);

        ridesDB.add(ride);

    }


    //falta saber informações de rota
    public ArrayList<Ride> listSimilarDeparture(String init_address, String departure_time) {
        ArrayList<Ride> similarRides = new ArrayList<Ride>();
        for (Ride ride : ridesDB) {
            if (ride.isSimilarTime(departure_time) &&  ride.isSimilarDeparture(init_address)) {
                similarRides.add(ride);
            }
        }
        return similarRides;
    }


    //falta saber informações de rota
    public ArrayList<Ride> listSimilarArrivals (String final_address, String arrival_time ){
        ArrayList<Ride> similarRides = new ArrayList<Ride>();
        for (Ride ride : ridesDB) {
            if (ride.isSimilarTime(arrival_time) && ride.isSimilarDeparture(final_address)){
                    similarRides.add(ride);
            }
        }
            return similarRides;
    }
}

