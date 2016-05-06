package controllers;

import api_service.models.User;
import DataAccessLayer.UserDAO;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("school_id");
    }

    @Override
    public Result onUnauthorized(Context context) {
        return redirect(routes.ViewController.login());
    }

    public static String getUser(Context ctx) {
        return ctx.session().get("school_id");
    }

    public static boolean isLoggedIn(Context ctx) {
        return (getUser(ctx) != null);
    }

    public static User getUserInfo(Context ctx) {
        return (isLoggedIn(ctx) ? UserDAO.retrieveUser(getUser(ctx)) : null);
    }
}
