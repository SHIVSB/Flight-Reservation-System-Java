//Flight Class containing the main class
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Flight {
    private String flightName = "Shiv";
    private int flightCapacity = 240;
    private int flightNumber = 123;
    private String airlineName = "Shivanshu Airline";
    private int seatsBooked = 0;
    private int pnrUpdate;

    private static HashMap<Integer,Integer> pnrMap ;
    private static HashMap<Integer,String> m ;
    private static HashMap<Integer,String> Location ;

    public Flight(){
        m = new HashMap<>();
        Location = new HashMap<>();
        pnrMap = new HashMap<>();
    }

    public HashMap<Integer, Integer> getPnrMap() {
        return pnrMap;
    }

    public HashMap<Integer, String> getM() {
        return m;
    }
    public HashMap<Integer, String> getLocation() {
        return Location;
    }


    public void getFlightDetails(){
        System.out.println("Flight Name : " + this.flightName);
        System.out.println("Flight Total capacity : " + this.flightCapacity);
        System.out.println("Flight Number : " + this.flightNumber);
        System.out.println("AirLine Name : " + this.airlineName);
    }

    public void updatePNR(int pnr){
        this.pnrUpdate = pnr;
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
        Flight flight = new Flight();
        Map<Integer,String> m = flight.getM();

        Scanner sc = new Scanner(System.in);
        Flight fl = new Flight();
        fl.getFlightDetails();

        System.out.println("-----Please press the keys according to the operation to be performed : ");
        System.out.println("-----Press 1 to Book Ticket : ");
        System.out.println("-----Press 2 to get Passenger Name By Phone Number : ");
        System.out.println("-----Press 3 to check the seat availability : ");
        System.out.println("-----Press 4 to get you PNR number : ");
        System.out.println("-----Press 5 to exit the program : ");
        int caseNumber = sc.nextInt();
        switch (caseNumber){
            case 1 : System.out.println("--Please enter the number of Tickets to be Booked : ");
                     int n = sc.nextInt();
                     while(n>0) {
                    Passenger obj = new Passenger();
                    System.out.println("Please enter the passenger phone number : ");
                    int phone = sc.nextInt();
                    System.out.println("Please enter the passenger name : ");
                    String name = sc.next();
                    m.put(phone,name);
                    obj.ContactObject(phone,name);
                    obj.AddressObject();
                    n--;
                    System.out.println("Total number of Passenger count : " + obj.getPassengerCount());
                    fl.seatsBooked = obj.getPassengerCount();
                    if(n>0) {
                        System.out.println("---Enter the details for another user---");
                    }
                }
                    boolean operationNumber = false;
                    System.out.println("Please type true if you want to perform further operations : ");
                    operationNumber = sc.nextBoolean();
                    while(operationNumber){

                             System.out.println("-----Please press the keys according to the operation to be performed otherwise type false : ");
                             System.out.println("-----Press 1 to Book Ticket : ");
                             System.out.println("-----Press 2 to get Passenger Name By Phone Number : ");
                             System.out.println("-----Press 3 to check the seat availability : ");
                             System.out.println("-----Press 4 to get you PNR number : ");
                             System.out.println("-----Press 5 to exit the program : ");
                             int caseNum = sc.nextInt();

                             if(caseNum == 1){
                                 System.out.println("--Please enter the number of Tickets to be Booked : ");
                                 int nmbr = sc.nextInt();
                                 while(nmbr>0) {
                                     Passenger obj = new Passenger();
                                     System.out.println("Please enter the passenger phone number : ");
                                     int phone = sc.nextInt();
                                     System.out.println("Please enter the passenger name : ");
                                     String name = sc.next();
                                     m.put(phone,name);
                                     obj.ContactObject(phone,name);
                                     obj.AddressObject();
                                     nmbr--;
                                     System.out.println("Total number of Passenger count : " + obj.getPassengerCount());
                                     fl.seatsBooked = obj.getPassengerCount();
                                     if(n>0) {
                                         System.out.println("---Enter the details for another user---");
                                     }
                                 }
                                 System.out.println("Please type true if you want to perform further operations otherwise type false : ");
                                 operationNumber = sc.nextBoolean();
                             }else if(caseNum == 2){
                                 int k;
                                 System.out.println("Please enter the passenger phone number to get the name : ");
                                 k = sc.nextInt();
                                 System.out.println("Passenger Name is : " + m.get(k));
                                 System.out.println("Please type true if you want to perform further operations otherwise type false : ");
                                 operationNumber = sc.nextBoolean();
                             }else if(caseNum == 3){
                                 if(fl.seatsBooked >= fl.flightCapacity){
                                     System.out.println("Sorry, the Flight is full");
                                 }else{
                                     System.out.println("Total Seats : " + fl.flightCapacity);
                                     System.out.println("Seats Booked : " + fl.seatsBooked);
                                 }
                                 System.out.println("Please type true if you want to perform further operations otherwise type false : ");
                                 operationNumber = sc.nextBoolean();
                             }else if(caseNum == 4){
                                 System.out.println("Please enter your seat number to know the PNR number : ");
                                 int seat = sc.nextInt();
                                 System.out.println("Your PNR number is : " + pnrMap.get(seat));
                             }else if(caseNum == 5){
                                 System.out.println("Hope You enjoyed the experience !!!!! :)");
                                 break;
                             }

                     }
                     break;

            case 2 :  int k;
                      System.out.println("Please enter the passenger phone number to get the name : ");
                      k = sc.nextInt();
                      System.out.println("Passenger Name is : " + m.get(k));
                      break;

            case 3 : if(fl.seatsBooked >= fl.flightCapacity){
                     System.out.println("Sorry, the Flight is full");
                     }else{
                     System.out.println("Total Seats : " + fl.flightCapacity);
                     System.out.println("Seats Booked : " + fl.seatsBooked);
                     }
                     break;

            case 4 :
                System.out.println("Please enter your seat number to know the PNR number : ");
                int seat = sc.nextInt();
                System.out.println("Your PNR number is : " + pnrMap.get(seat));
                break;

            case 5 :
                System.out.println("Hope you enjoyed the experience");
                break;

        }




    }

}


//-------------------------------------------------------------------------------------------------------------------


//Abstract Ticket class
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
        Flight flight = new Flight();
        flight.updatePNR(this.pnr);
        Map<Integer,Integer> pnrMap = flight.getPnrMap();
        pnrMap.put(this.seatNumber,this.pnr);
        System.out.println("Following is your Ticket Detail : ");
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

    public int getPnr(){
        return pnr;
    }

    public void setFlightStatus(){
        if(this.cancelled){
            this.cancelled = false;
        }else{
            this.cancelled = true;
        }
    }

}


//-------------------------------------------------------------------------------------------------------------------


//Inheriting the commong Ticket Properties into RegularTicket Class
class RegularTicket extends Ticket{
    private String specialService;
    RegularTicket(int num,int psngercnt){
        super(num, "Roorkee", "Delhi", "Shiv", 24 , 4, 24, 6, psngercnt, 6000, false);
    }
    public void getService(){
        System.out.println(this.specialService);
    }
    public void setService(String serv){
        this.specialService = serv;
    }
}

//-------------------------------------------------------------------------------------------------------------------


//Inheriting the common Ticket Properties into TouristTicket Class
class TouristTicket extends Ticket {
    private String hotelAddress;

    public TouristTicket(int num,int psngercnt){
        super(num, "Roorkee", "Delhi", "Shiv", 24 , 4, 24, 6, psngercnt, 6000, false);
    }
    //Using super keyword to access the properties of the parent class

    //To provide the hotel address
    public void setHotelAddress(String add){
        this.hotelAddress = add;
    }
    //To get ticket details
    public void getTouristTicketDetail(){
        super.TicketDetails();
    }
    //To get Tourist locations
    public void getTouristLocation(int pnr){
        System.out.println("Your tourist Locations are : " + Location.get(pnr));
    }
    Flight flight = new Flight();
    Map<Integer,String> Location = flight.getLocation();
    //To add tourist locations
    public void setTouristLocation(String location){
        Location.put(super.getPnr(),location);
    }
}

//-------------------------------------------------------------------------------------------------------------------


//Passenger Class
class Passenger {

    private static int idCounter = 0; // Using idCounter to maintain the count of Passengers
    Scanner sc = new Scanner(System.in);

    Passenger()
    {
        Passenger.idCounter = Passenger.idCounter + 1;
    } // To increment the passenger count every time a new passenger books the flight

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

        public int getPhone(){
            return this.phone;
        }

        public String getName(){
            return this.name;
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
        Address address = new Passenger.Address();// Creating an obeject of the inner class

        System.out.println("Please enter the city : ");
        String a = sc.next();
        System.out.println("Please enter the state : ");
        String b = sc.next();
        System.out.println("Please enter the street : ");
        String c = sc.next();
        address.setCity(a);//Using setter to set various properties
        address.setState(b);
        address.setStreet(c);
        address.getAddress();

        System.out.println("If you want to Book a Tourist Ticket press 1 else press 2 for regular Ticket : ");
        int k = sc.nextInt();
        if(k == 1){
            int max = 12000;
            int min =300;
            TouristTicket ob1 = new TouristTicket(123+(int)(Math.random()*(max-min+1)+min),getPassengerCount());// Using random ftn to generate varying PNR number
            ob1.TicketDetails();
            System.out.println("Please enter the Hotel Address : ");
            String l = sc.next();
            ob1.setHotelAddress(l);
            System.out.println("Please add 5 Tourist Locations separated by a space : ");

            String str = sc.next();
            ob1.setTouristLocation(str);

        }else if(k == 2){
            int max = 50000;
            int min =14000;
            RegularTicket ob2 = new RegularTicket(123+(int)(Math.random()*(max-min+1)+min), getPassengerCount()); // Using random ftn to generate varying PNR number
            ob2.TicketDetails();
            System.out.println("Please Enter any special Service you need : ");
            String s = sc.next();
            ob2.setService(s);
        }
    }

    public void ContactObject(int phone,String name){
        Contact contact = new Passenger.Contact(); // Creating an obeject of the inner class
        System.out.println("Please enter the Passenger Email Id : ");
        String c = sc.next();
        contact.setName(name); //Using setter to set various properties
        contact.setPhone(phone);
        contact.setEmail(c);
        contact.getcontact();
    }

    public int getPassengerCount(){ //To get the Passenger Count
        return this.idCounter;
    }


}

