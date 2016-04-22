package controllers;

import play.*;
import play.mvc.*;
import api_service.models.User;
import api_service.models.Ride;
import api_service.models.City;
import java.util.ArrayList;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ViewController extends Controller {

    User activeUser = null;
    ArrayList<Ride> similarDepartureRides = null;
    ArrayList<Ride> similarReturnRides = null;
    ArrayList<Ride> myRides = null;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result requestRide(){
        api_service.controllers.APIController.requestRide();

        return ok(main_page.render(activeUser,myRides,similarDepartureRides,similarReturnRides ));
    }

    public Result register(){
        return ok(register.render());
    }

    public Result loginUser(){
        // NO MOMENTO DE LOGIN, PEGAMOS TODAS AS INFORMAÇÕES QUE SERÃO NECESSÁRIAS PARA MOSTRAR NA PÁGINA
        // (ISSO PODE SER MUDADO MAS SUGIRO QUE SEJA EM ENTREGAS FUTURAS) USAMOS A API DE CONTROLLER PARA PEGAR AS INFORMAÕES
        activeUser = api_service.controllers.APIController.login();
        myRides= api_service.controllers.APIController.myRides(activeUser.getSchoolId());
        similarDepartureRides = api_service.controllers.APIController.getSimilarDepartureRides(activeUser);
        similarReturnRides = api_service.controllers.APIController.getSimilarReturnRides(activeUser);

        System.out.println("Saída");
        for(Ride ride: similarDepartureRides){
            System.out.println(ride);
        }

        System.out.println("Volta");
        for(Ride ride: similarReturnRides){
            System.out.println(ride);
        }

        if(activeUser != null){
            
            return ok(main_page.render(activeUser,myRides,similarDepartureRides,similarReturnRides ));
        }else{
            flash("A problem ocurred, try loggin in again");
            return ok(index.render());
        }
    }

    public Result listRides(){
        api_service.controllers.APIController.listRides();
        return ok("Listing rides");
    }

    public Result logout() {
        session().clear();
        activeUser = null;

        return redirect(routes.ViewController.index());
    }
}
