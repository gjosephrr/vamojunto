package api_service.DataAccessLayer;

import api_service.models.Solicitation;
import java.util.ArrayList;

/**
 * Created by joseph on 20/04/16.
 */
public class SolicitationDAO {

    private ArrayList<Solicitation> solicitationsDB;

    public SolicitationDAO(){
        solicitationsDB = new ArrayList<Solicitation>();
    }

    public void registerSolicitation(String requester_id,String responser_id, String ride_id){
        // Instantiate new solicitation
        Solicitation solicitation = new Solicitation(requester_id,responser_id, ride_id);
        solicitationsDB.add(solicitation);

    }
    public ArrayList<Solicitation> listPendingRequest(String responser_id) {
        ArrayList<Solicitation> pendingRequests = new ArrayList<Solicitation>();
        
        return pendingRequests;
    }

}
