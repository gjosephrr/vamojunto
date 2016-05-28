
# PostPlay schema

# --- !Ups

CREATE TABLE iuser (
    schoolId int ,
    email text,
    password text,
    phoneNumber text ,
    neighborhood text,
    street text,
    vehicleSeats text,
    role text,
    departureRide text,
    returnRidetext text
);
CREATE TABLE ride (
    ride_id int,
    init_address text,
    departure_time text,
    final_address text,
    phoneNumber text,
    driver_id text,
    seats int

);
CREATE TABLE solicitation (
    passenger text,
    responser_id text,
    ride_id text,
    ride text,
    status text

);

# --- !Downs

DROP TABLE iuser;
DROP TABLE ride;
DROP TABLE solicitation;

