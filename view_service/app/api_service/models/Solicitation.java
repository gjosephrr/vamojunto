package api_service.models;

/**
 * Created by joseph on 19/04/16.
 */
public class Solicitation {

    private enum status{
        ACCEPTED, REFUSED;
    }

    private String requester_id;
    private String responser_id;
    private String ride_id;
    private String status;

    public Solicitation(String requester_id,String responser_id, String ride_id){



    }

}
