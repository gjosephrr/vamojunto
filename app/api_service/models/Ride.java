package api_service.models;

import java.util.Date;
import java.util.Arrays;
import java.text.*;

import com.avaje.ebean.Model;
import play.i18n.*;

import javax.persistence.*;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;

/**
 * Created by joseph on 19/04/16.
 */
@Entity
public class Ride extends Model{

    // A CLASSE RIDE PRECISA TER TAMBÉM UM ATRIBUTO ROTA, PEGAMOS DA CLASSE ESTÁTICA CIDADE, O ARRAY CORRESPONDENTE AO
    // ENDEREÇO DE PARTIDA (PENSAR SOBRE A VIAGEM DE VOLTA)

    public static Model.Finder<String,Ride> find = new Model.Finder<>(Ride.class);

    @Constraints.Required
    private String init_address;
    @Constraints.Required
    private String departure_time;
    @Constraints.Required
    private String final_address;
    @Constraints.Required
    private String phoneNumber;
    @Constraints.Required
    private String driver_id;
    @Constraints.Required
    private int seats;
    @Id
    private int ride_id;

    String[] trajectory;

    public Ride(String driver, String phoneNumber, String init_address,
                String final_address, String departure_time, int seats,
                int ride_id) {

        this.init_address = init_address;
        this.departure_time = departure_time;
        this.final_address = final_address;
        this.phoneNumber = phoneNumber;
        this.driver_id = driver;
        this.seats = seats;
        this.ride_id = ride_id;

        if (init_address.equals("bodocongo")) {
            this.trajectory = City.getTrajectory(final_address);
            reverseTrajectory(this.trajectory);
        } else {
            this.trajectory = City.getTrajectory(init_address);
        }

    }

    private void reverseTrajectory(String[] ride) {
        // PRIMEIRAMENTE, PEGAMOS A ROTA NORMAL E A INVERTEMOS
        for (int i = 0; i < ride.length / 2; i++) {
            String temp = ride[i];
            ride[i] = ride[ride.length - i - 1];
            ride[ride.length - i - 1] = temp;
        }


    }

    public String getDriver() {
        return driver_id;
    }

    public int getRideId() {
        return this.ride_id;
    }

    public String getDriverPhone() {
        return this.phoneNumber;
    }

    public String getInitAddress() {
        return this.init_address;
    }

    public String getDepartureTime() {
        return this.departure_time;
    }

    public String getFinalAddress() {
        return this.final_address;
    }

    public String[] getTrajectory() {
        return this.trajectory;
    }

    public int getSeats() {
        return this.seats;
    }

    public boolean isSimilarTo(Ride ride) {
        if ( //this.init_address.equals(ride.getInitAddress()) &&
                Arrays.asList(this.trajectory).contains(ride.getInitAddress()) &&
                        this.departure_time.equals(ride.getDepartureTime()) &&
                        this.final_address.equals(ride.getFinalAddress())) {
            // CASO DE VIAGEM DE IDA
            return true;
        } else if (Arrays.asList(this.trajectory).contains(ride.getFinalAddress()) &&
                this.departure_time.equals(ride.getDepartureTime()) &&
                this.init_address.equals(ride.getInitAddress())
                ) {
            // CASO DE VIAGEM DE VOLTA
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String toString = Messages.get("ride.toString", this.driver_id, this.init_address);
        return toString;
    }

}
