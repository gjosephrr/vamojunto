package api_service.models;

import java.util.Date;
import java.text.*;
/**
 * Created by joseph on 19/04/16.
 */
public class Ride {


    private String init_address;
    private String departure_time;
    private String final_address;
    private String arrival_time;
    private String driver_id;
    private int seats;
    private int ride_id;

    public Ride(String driver, String init_address, String departure_time, String final_address, String arrival_time, int seats){

            this.init_address = init_address;
            this.departure_time = departure_time;
            this.final_address = final_address;
            this.arrival_time = arrival_time;
            this.driver_id = driver;
            this.seats = seats;

            generateId();


    }

    public String getDriver() {
        return driver_id;
    }
    public boolean isSimilarDeparture(String departure){
        return init_address.equals(departure);
    }
    public boolean isSimilarTime(String time){
        return departure_time.equals(time);
    }
    public void generateId(){

    }

}
