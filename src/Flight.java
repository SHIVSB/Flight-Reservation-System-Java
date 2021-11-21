//package src;
//import java.io.*;
//import src.*;

public class Flight {
    private String flightName = "Shi";
    private int flightCapacity = 240;
    private int flightNumber = 123;
    private String airlineName = "Shivanshu Airline";
    private int seatsBooked = 180;

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

    public int updateSeats() {
        this.seatsBooked = this.seatsBooked + 1;
        return this.seatsBooked;
    }


    public static void main(String[] args) {
        Flight fl = new Flight();
        fl.getFlightDetails();

        Passenger obj = new Passenger();
        Passenger obj2 = new Passenger();
        Passenger obj4 = new Passenger();
        obj4.ContactObject();
        Passenger obj3 = new Passenger();
        obj3.AddressObject();

        System.out.println(obj4.getPassengerCount());

//        Ticket obj3 = new TouristTicket();
//        obj3.TicketDetails();
    }

}

abstract class Ticket {
    private int pnr;
    private String departureLocation;
    private String destinationLocation;
    private String flightName;
    private int dateDeparture;
    private int timeDeparture;
    private int dateArrival;
    private int timeArrival;
    private int seatNumber;
    private int price;
    private boolean cancelled;

    Ticket(int pnr, String departureLocation,String destinationLocation,String flightName, int dateDeparture,int timeDeparture,int dateArrival,int timeArrival, int seatNumber,int price,boolean cancelled){
        this.pnr = pnr;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flightName = flightName;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.dateArrival = dateArrival;
        this.timeArrival = timeArrival;
        this.seatNumber = seatNumber;
        this.price = price;
        this.cancelled = cancelled;
    }

    public void TicketDetails(){
        System.out.println("PNR : " + this.pnr);
        System.out.println("Departure Location : "+this.departureLocation );
        System.out.println("Destination Location : "+this.destinationLocation );
        System.out.println("Flight Name : "+this.flightName);
        System.out.println("Date Departure : "+ this.dateDeparture);
        System.out.println("Time Departure : "+this.timeDeparture);
        System.out.println("Date Arrival : "+this.dateArrival );
        System.out.println("Time Arrival : "+this.timeArrival);
        System.out.println("Seat Number : "+this.seatNumber);
        System.out.println("Price : "+this.price);
        System.out.println("Cancel Status : "+this.cancelled);
    }

    public void checkFlightStatus(){
        System.out.println("Status : " + this.cancelled);
    }

    public void setFlightStatus(){
        if(this.cancelled){
            this.cancelled = false;
        }else{
            this.cancelled = true;
        }
    }

//    public void duration(){
//        System.out.println("Duration left : " + this.dateArrival-this.dateDeparture + " Days and " + this.timeArrival-this.timeDeparture + " hours.");
//    }

}

class RegularTicket extends Ticket{
    private String specialService;
    RegularTicket(){
        super(123, "Roorkee", "Delhi", "Shiv", 24 , 4, 24, 6, 23, 6000, false);
    }
    public void getService(){
        System.out.println(this.specialService);
    }
    public void setService(String serv){
        this.specialService = serv;
    }
}

class TouristTicket extends Ticket {
    private String hotelAddress;
    private String touristLocation;

    public TouristTicket(){
        super(123, "Roorkee", "Delhi", "Shiv", 24 , 4, 24, 6, 23, 6000, false);
    }

    public void setHotelAddress(String add){
        this.hotelAddress = add;
    }

    public void getTouristTicketDetail(){
        super.TicketDetails();
    }

    public void getTouristLocation(){
        System.out.println("Your tourist Locations are : " + this.touristLocation);
    }

    public void setTouristLocation(String location){
        this.touristLocation = this.touristLocation + location;
    }
}

class Passenger {

    private static int idCounter = 180;

    Passenger(){
        Passenger.idCounter = Passenger.idCounter + 1;
    }
    //Contact class nested inside passenger class
    private static class Contact {
        private String name;
        private int phone;
        private String email;

        public void getcontact(){
            System.out.println("Passenger Details are as follows : ");
            System.out.println("Name : " + this.name);
            System.out.println("Phone : " + this.phone);
            System.out.println("Email : " + this.email);
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }
    }

    //Address classed nested inside passenger class
    private static class Address {
        private String street;
        private String city;
        private String state;

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void getAddress(){
            System.out.println("Street : " + this.street);
            System.out.println("City : " + this.city);
            System.out.println("State : " + this.state);
        }

    }

    public void AddressObject(){
        Address address = new Passenger.Address();
        address.setCity("Roorkee");
        address.setState("Uk");
        address.setStreet("Civil Lines");
        address.getAddress();
    }

    public void ContactObject(){
        Contact contact = new Passenger.Contact();
        contact.setName("Apple");
        contact.setPhone(1234);
        contact.setEmail("apple@game.com");
        contact.getcontact();
    }


    public int getPassengerCount(){
        return this.idCounter;
    }

}