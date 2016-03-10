package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result about(){
        return ok(about.render("Simple Bootstrap Test", "2.5.0"));
    }

    public Result aboutPlay() {
        return ok(about_play.render("Your new application is ready."));
    }

    public Result register(){
        return ok(register.render());
    }

    public Result driver(){
        return ok(driver.render());
    }
}
