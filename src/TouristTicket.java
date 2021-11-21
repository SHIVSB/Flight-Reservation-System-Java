import java.io.*;

class TouristTicket extends Ticket {
    private String hotelAddress;
    private String touristLocation;

    super();
    public void getTouristLocation(){
        System.out.println("Your tourist Locations are : " + this.touristLocation);
    }

    public void setTouristLocation(String location){
        this.touristLocation = this.touristLocation + location;
    }
}