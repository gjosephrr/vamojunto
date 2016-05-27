package DataAccessLayer;

import api_service.models.Solicitation;
import api_service.models.User;
import api_service.models.Ride;

import java.util.ArrayList;

/**
 * Created by joseph on 20/04/16.
 */
public class SolicitationDAO {

    private ArrayList<Solicitation> solicitationsDB;

    public SolicitationDAO() {
        solicitationsDB = new ArrayList<Solicitation>();

    }

    public void registerSolicitation(User passenger, String responser_id, Ride ride) {
        // Instantiate new solicitation
        Solicitation solicitation = new Solicitation(passenger, responser_id, ride);
        solicitationsDB.add(solicitation);

    }

    public ArrayList<Solicitation> getAllSolicitations() {
        return this.solicitationsDB;
    }

    public void listSolicitations() {
        for (Solicitation sol : solicitationsDB) {
            System.out.println(sol);
        }
    }

    public ArrayList<Solicitation> listPendingRequest(String responser_id) {
        ArrayList<Solicitation> pendingRequests = new ArrayList<Solicitation>();

        return pendingRequests;
    }

}
