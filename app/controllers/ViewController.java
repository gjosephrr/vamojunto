package controllers;

import api_service.models.*;
import play.*;
import play.data.Form;
import play.mvc.*;

import java.util.ArrayList;

import views.formdata.LoginFormData;
import views.html.*;
import java.util.Random;

public class ViewController extends Controller {

    ArrayList<Ride> similarDepartureRides = null;
    ArrayList<Ride> similarReturnRides = null;
    ArrayList<Ride> myRides = null;
    ArrayList<Solicitation> mySolicitations = null;
    AuthToken userToken = null;

    public Result mainDecoder(String method){
        if(!Secured.isLoggedIn(ctx())){
            switch (method){
                case "index":
                    return index(null);
                case "register":
                    return register();
                case "login":
                    return login();
                case "post login":
                    return postLogin();

            }
        } else if(Secured.isLoggedIn(ctx())) {
            if(this.userToken != null && !this.userToken.hasExpired()){
                switch (method){
                    case "index":
                        return index(null);
                    case "main page":
                        return mainPage();
                    case "request ride":
                        return requestRide();
                    case "register rides":
                        return registerRides();
                    case "register":
                        return register();
                    case "login":
                        return login();
                    case "post login":
                        return postLogin();
                }
            } else {
                logoutUser();
                return index("Your authentication token has expired, please login again");
            }
        }
        return index(null);
    }

    public Result index(String tokenMessage) {
        return ok(index.render(tokenMessage));
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
            return redirect(routes.ViewController.mainDecoder("main page"));
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

            this.userToken = new AuthToken();
            this.userToken.generateToken(formData.get().school_id + new Integer(new Random().nextInt(100)).toString());

            return redirect(routes.ViewController.mainDecoder("main page"));
        }
    }

    @Security.Authenticated(Secured.class)
    public Result logoutUser(){
        session().clear();
        resetCurrentData();
        return redirect(routes.ViewController.mainDecoder("login"));
    }

    private void resetCurrentData(){
        this.similarDepartureRides = null;
        this.similarReturnRides = null;
        this.myRides = null;
        this.mySolicitations = null;
        this.userToken = null;
    }
}
