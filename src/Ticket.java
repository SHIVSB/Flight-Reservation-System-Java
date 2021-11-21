import java.io.*;

abstract class Ticket extends Flight {
    private int pnr;
    private String departureLocation;
    private String destinationLocation;
    private String flightName;
    private String dateDeparture;
    private String timeDeparture;
    private String dateArrival;
    private String timeArrival;
    private int seatNumber;
    private int price;
    private boolean cancelled;

    public Ticket(int pnr, String departureLocation, String destinationLocation,String flightName, String dateDeparture,String timeDeparture, String dateArrival, String timeArrival, int seatNumber,int price,boolean cancelled){
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

    public void duration(){
        System.out.println("Duration left : " + this.dateArrival - this.dateDeparture + " Days and " + this.timeArrival-this.timeDeparture + " hours.");
    }

}