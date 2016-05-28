package api_service.models;

import api_service.models.User;
import api_service.models.Ride;
import play.i18n.*;
import javax.persistence.*;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;


/**
 * Created by joseph on 19/04/16.
 */
@Entity( name = "solicitation" )
public class Solicitation extends Model{


    public static Finder<String,Solicitation> find = new Finder<>(Solicitation.class);
    private enum Status {
        ACCEPTED, REFUSED, WAITING;
    }
    @Column
    private User passenger;
    @Column
    private String responser_id;
    @Column
    private String ride_id;
    @Column
    private Ride ride;
    @Column
    private Status status;

    public Solicitation(User passenger, String responser_id, Ride ride) {
        this.passenger = passenger;
        this.responser_id = responser_id;
        this.ride = ride;
        this.status = Status.WAITING;
    }

    public String getDisplayInfo() {
        String message = "";
        String name = Messages.get("solicitation.name", this.passenger.getName());
        String neighborhood = Messages.get("solicitation.neighborhood", this.ride.getInitAddress());
        String time = Messages.get("solicitation.time", this.ride.getDepartureTime());
        message += (name);
        message += (neighborhood);
        message += (time);
        return message;
    }

    public String getDriver() {
        return this.responser_id;
    }

    public User getPassenger() {
        return passenger;
    }

    public void setStatus(boolean newStatus) {
        if (newStatus) {
            this.status = status.ACCEPTED;
        } else {
            this.status = status.REFUSED;
        }
    }

    @Override
    public String toString() {
        String toString = Messages.get("solicitation.toString", this.passenger, this.responser_id);
        return toString;
    }
}
