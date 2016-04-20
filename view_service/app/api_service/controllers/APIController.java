package api_service.controllers;

import api_service.DataAccessLayer.UserDAO;
import api_service.models.User;
import play.*;
import play.mvc.*;

import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

/**
 * Created by js on 19/04/16.
 */
public class APIController extends Controller{

    UserDAO userDAO = new UserDAO();


    public Result newUser(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String name = dynamicForm.get("name");
        String email= dynamicForm.get("email");
        String schoolId = dynamicForm.get("school_id");
        String password = dynamicForm.get("password");
        String password2 = dynamicForm.get("password2");
        String phoneNumber = dynamicForm.get("phoneNumber");
        String neighborhood = dynamicForm.get("neighborhood");
        String street = dynamicForm.get("street");

        int vehicleSeats = Integer.parseInt(dynamicForm.get("vehicle_seats"));

        userDAO.registerUser(name, email, schoolId,
                password, password2, phoneNumber,
                neighborhood, street, vehicleSeats);

        userDAO.listUsers();
        return ok(dynamicForm.get("school_id"));
    }



    public Result login(){

        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String schoolId = dynamicForm.get("school_id");
        String password = dynamicForm.get("password");


        return ok (userDAO.authenticateUser(schoolId,password).toString());


    }
}
