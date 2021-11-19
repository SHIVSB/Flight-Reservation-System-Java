public class TouristTicket {
    public String hotelAddress;
    public String touristLocation;
    public void getTouristLocation(){
        System.out.println("Your tourist Locations are : " + this.touristLocation);
    }

    public void setTouristLocation(String location){
        this.touristLocation = this.touristLocation + location;
    }
}