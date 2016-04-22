package api_service.models;

/**
 * Created by joseph on 19/04/16.
 */
public class Solicitation {

    private enum Status{
        ACCEPTED, REFUSED, WAITING;
    }

    private String requester_id;
    private String responser_id;
    private String ride_id;
    private Status status;

    public Solicitation(String requester_id,String responser_id, String ride_id){
        this.requester_id = requester_id;
        this.responser_id = responser_id;
        this.ride_id = ride_id;
        this.status = Status.WAITING;
    }

    public String getPassenger() {
        return requester_id;
    }
    public void setStatus(boolean newStatus){
        if(newStatus){
            this.status = status.ACCEPTED;
        }else{
            this.status = status.REFUSED;
        }
    }

    @Override
    public String toString() {
        return "Motorista: " + this.requester_id + "\nPassageiro: " + this.responser_id +
        "\nRide ID: " + this.ride_id;
    }
}
