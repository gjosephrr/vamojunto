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
    private String driver_id;
    private int seats;
    private int ride_id;

    public Ride(String driver, String init_address, String final_address, String departure_time, int seats){

            this.init_address = init_address;
            this.departure_time = departure_time;
            this.final_address = final_address;
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

    @Override
    public String toString() {
        return "Motorista: " + this.driver_id + "\nParte de: " + this.init_address + "\nChega em: " + this.final_address;
    }

}
