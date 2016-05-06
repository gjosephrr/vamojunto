package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import api_service.models.User;
import api_service.models.Ride;
import api_service.models.City;
import api_service.models.Solicitation;

import java.util.ArrayList;

import views.formdata.LoginFormData;
import views.html.*;

public class ViewController extends Controller {

    ArrayList<Ride> similarDepartureRides = null;
    ArrayList<Ride> similarReturnRides = null;
    ArrayList<Ride> myRides = null;
    ArrayList<Solicitation> mySolicitations = null;

    public Result index() {
        return ok(index.render());
    }

    public Result requestRide() {
        api_service.controllers.APIController.requestRide();

        return ok(main_page.render(Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()),
                myRides, similarDepartureRides,
                similarReturnRides, mySolicitations));
    }

    public Result register() {
        return ok(register.render());
    }

    @Security.Authenticated(Secured.class)
    public Result mainPage() {

        myRides = api_service.controllers.APIController.myRides(Secured.getUser(ctx()));
        similarDepartureRides = api_service.controllers.APIController.getSimilarDepartureRides(Secured.getUserInfo(ctx()));
        similarReturnRides = api_service.controllers.APIController.getSimilarReturnRides(Secured.getUserInfo(ctx()));
        mySolicitations = api_service.controllers.APIController.getSolicitations(Secured.getUser(ctx()));

        return ok(main_page.render(
                Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()),
                myRides,
                similarDepartureRides, similarReturnRides,
                mySolicitations)
        );
    }

    public Result registerRides() {
        api_service.controllers.APIController.registerRide();
        return ok(main_page.render(Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()),
                myRides,
                similarDepartureRides, similarReturnRides,
                mySolicitations));
    }

    // LOGIN METHODS

    public Result login() {
        if(!Secured.isLoggedIn(ctx())) {
            Form<LoginFormData> formData = Form.form(LoginFormData.class);
            return ok(login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
        }else{
            return redirect(routes.ViewController.mainPage());
        }
    }

    public Result postLogin() {
        // Get the submitted form data from the request object, and run validation.
        Form<LoginFormData> formData = Form.form(LoginFormData.class).bindFromRequest();
        if (formData.hasErrors()) {
            flash("error", "Matrícula ou senha incorretas, tente novamente");
            return badRequest(login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
        }
        else {
            // email/password OK, so now we set the session variable and only go to authenticated pages.
            session().clear();
            resetCurrentData();
            session("school_id", formData.get().school_id);
            return redirect(routes.ViewController.mainPage());
        }
    }

    @Security.Authenticated(Secured.class)
    public Result logoutUser(){
        session().clear();
        resetCurrentData();
        return redirect(routes.ViewController.login());
    }

    private void resetCurrentData(){
        this.similarDepartureRides = null;
        this.similarReturnRides = null;
        this.myRides = null;
        this.mySolicitations = null;
    }
}
