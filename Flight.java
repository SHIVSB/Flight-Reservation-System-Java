import java.io.*;

public class Flight {
    public String flightName = "Shi";
    public int flightCapacity = 240;
    public int flightNumber = 123;
    public String airlineName = "Shivanshu Airline";
    public int seatsBooked = 180;

    public void getFlightDetails(){
        System.out.println("Flight Name : " + this.flightName);
        System.out.println("Flight Total capacity : " + this.flightCapacity);
        System.out.println("Flight Number : " + this.flightNumber);
        System.out.println("AirLine Name : " + this.airlineName);
    }

    public void checkSeats() {
        System.out.println("Flight Total capacity : " + this.flightCapacity);
        System.out.println("Seats Booked : " + this.seatsBooked);
    }

    public void updateSeats() {
        this.seatsBooked = this.seatsBooked + 1;
        System.out.println("Booked Seat updated to : " + this.seatsBooked);
    }

    public static void main(String[] args) {
        Flight fl = new Flight();
        fl.getFlightDetails();
        fl.updateSeats();
    }
}