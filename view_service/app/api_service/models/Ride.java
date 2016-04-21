package api_service.models;

import java.util.Date;
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

    // CONSTRUTOR TEMPORÁRIO
    public Ride(){}

    public Ride(String driver, String phoneNumber, String init_address, String final_address, String departure_time, int seats){

            this.init_address = init_address;
            this.departure_time = departure_time;
            this.final_address = final_address;
            this.phoneNumber = phoneNumber;
            this.driver_id = driver;
            this.seats = seats;

            generateId();


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

    public int getSeats(){
        return this.seats;
    }

    // OBS: Por enquanto, considero apenas o mesmo endereço de partida, ajustar isso depois
    public boolean isSimilarTo(Ride ride){
        if( this.init_address.equals(ride.getInitAddress()) &&
            this.departure_time.equals(ride.getDepartureTime()) &&
            this.final_address.equals(ride.getFinalAddress())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Motorista: " + this.driver_id + "\nParte de: " + this.init_address + "\nChega em: " + this.final_address;
    }

}
