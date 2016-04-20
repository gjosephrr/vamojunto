package api_service.models;

/**
 * Created by joseph on 19/04/16.
 */

public class User {

    private enum UserRoles{
        DRIVER, PASSENGER;
    }

    private String name;
    private String email;
    private String schoolId;
    private String password;
    private String phoneNumber;
    private String neighborhood;
    private String street;

    private int vehicleSeats;

    private UserRoles role;

    public User(String name, String email,
                String school_id, String password,
                String password2, String phoneNumber,
                String neighborhood, String street,
                int vehicleSeats){

        this.name = name;
        this.email = email;
        this.schoolId = school_id;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.neighborhood = neighborhood;
        this.street = street;

        if(vehicleSeats != 0){
            userBecomeDriver(vehicleSeats);
        }else{
            this.role = UserRoles.PASSENGER;
        }

    }

    public void userBecomeDriver(int vehicleSeats){
        this.vehicleSeats = vehicleSeats;
        this.role = UserRoles.DRIVER;
    }

    public boolean validadeSchoolId(){
        // TODO
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\nMatrícula: " + this.schoolId + "\nPapel: " + this.role;
    }
}