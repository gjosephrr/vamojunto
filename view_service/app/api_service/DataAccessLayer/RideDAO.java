package api_service.DataAccessLayer;

/**
 * Created by joseph on 20/04/16.
 */
import api_service.models.Ride;
import java.util.ArrayList;

public class RideDAO {

    private ArrayList<Ride> ridesDB;

    public RideDAO(){
        ridesDB = new ArrayList<Ride>();
    }

}
