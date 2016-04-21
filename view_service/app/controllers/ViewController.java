package controllers;

import play.*;
import play.mvc.*;
import api_service.models.User;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ViewController extends Controller {

    User activeUser = null;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result register(){
        return ok(register.render());
    }

    public Result loginUser(){
        activeUser = api_service.controllers.APIController.login();

        if(activeUser != null){
            //session().clear();
            //session("school_id", activeUser.getSchoolId());
            return ok(main_page.render(activeUser));
        }else{
            return ok("A problem ocurred, try loggin in again");
        }
    }

    public Result logout() {
        activeUser = null;

        return ok(index.render());
    }
}
