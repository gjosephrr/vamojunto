package views.formdata;

import DataAccessLayer.UserDAO;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

public class LoginFormData {

    public String school_id = "";
    public String password = "";

    /** Required for form instantiation. */
    public LoginFormData() {
    }

    public List<ValidationError> validate() {

        List<ValidationError> errors = new ArrayList<>();

        if (!UserDAO.isValid(school_id, password)) {
            errors.add(new ValidationError("school_id", ""));
            errors.add(new ValidationError("password", ""));
        }

        return (errors.size() > 0) ? errors : null;
    }

}