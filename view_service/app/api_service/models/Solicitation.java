package api_service.models;

import api_service.models.User;
import api_service.models.Ride;

/**
 * Created by joseph on 19/04/16.
 */
public class Solicitation {

    private enum Status {
        ACCEPTED, REFUSED, WAITING;
    }

    private User passenger;
    private String responser_id;
    private String ride_id;
    private Ride ride;
    private Status status;

    public Solicitation(User passenger, String responser_id, Ride ride) {
        this.passenger = passenger;
        this.responser_id = responser_id;
        this.ride = ride;
        this.status = Status.WAITING;
    }

    public String getDisplayInfo() {
        String message = "";
        message += ("Nome: " + this.passenger.getName() + "\n");
        message += ("Bairro: " + this.ride.getInitAddress() + "\n");
        message += ("Horário: " + this.ride.getDepartureTime() + "\n");

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
        return "Motorista: " + this.passenger + "\nPassageiro: " + this.responser_id;
    }
}
