package api_service.models;

import java.util.Date;
import java.util.Arrays;
import java.text.*;
/**
 * Created by joseph on 19/04/16.
 */
public class Ride {

    // A CLASSE RIDE PRECISA TER TAMBÉM UM ATRIBUTO ROTA, PEGAMOS DA CLASSE ESTÁTICA CIDADE, O ARRAY CORRESPONDENTE AO
    // ENDEREÇO DE PARTIDA (PENSAR SOBRE A VIAGEM DE VOLTA)

    private String init_address;
    private String departure_time;
    private String final_address;
    private String phoneNumber;
    private String driver_id;
    private int seats;
    private int ride_id;

    String[] trajectory;

    // CONSTRUTOR TEMPORÁRIO
    public Ride(){}

    public Ride(String driver, String phoneNumber, String init_address, String final_address, String departure_time, int seats){

            this.init_address = init_address;
            this.departure_time = departure_time;
            this.final_address = final_address;
            this.phoneNumber = phoneNumber;
            this.driver_id = driver;
            this.seats = seats;

            if(init_address.equals("bodocongo")){
                this.trajectory = City.getTrajectory(final_address);
                reverseTrajectory(this.trajectory);
            }else{
                this.trajectory = City.getTrajectory(init_address);
            }

            generateId();


    }

    private void reverseTrajectory(String[] ride){
        // PRIMEIRAMENTE, PEGAMOS A ROTA NORMAL E A INVERTEMOS
        for(int i = 0; i < ride.length / 2; i++){
            String temp = ride[i];
            ride[i] = ride[ride.length - i - 1];
            ride[ride.length - i - 1] = temp;
        }


    }

    public String getDriver() {
        return driver_id;
    }
    
    public void generateId(){

    }

    public String getInitAddress(){
        return this.init_address;
    }

    public String getDepartureTime(){
        return this.departure_time;
    }

    public String getFinalAddress(){
        return this.final_address;
    }

    public String[] getTrajectory(){
        return this.trajectory;
    }

    public int getSeats(){
        return this.seats;
    }

    public boolean isSimilarTo(Ride ride){
        if( //this.init_address.equals(ride.getInitAddress()) &&
            Arrays.asList(this.trajectory).contains(ride.getInitAddress()) &&
            this.departure_time.equals(ride.getDepartureTime()) &&
            this.final_address.equals(ride.getFinalAddress())){
            // CASO DE VIAGEM DE IDA
            return true;
        }else if(Arrays.asList(this.trajectory).contains(ride.getFinalAddress()) &&
            this.departure_time.equals(ride.getDepartureTime()) &&
            this.init_address.equals(ride.getInitAddress())
            ){
            // CASO DE VIAGEM DE VOLTA
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        return "Motorista: " + this.driver_id + "\nParte de: " + this.init_address;
    }

}
