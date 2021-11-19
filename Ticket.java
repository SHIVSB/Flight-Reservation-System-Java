import java.io.*;

public class Ticket extends Flight {
    public int pnr;
    public String departureLocation;
    public String destinationLocation;
    public String flightName;
    public String dateDeparture;
    public String timeDeparture;
    public String dateArrival;
    public String timeArrival;
    public int seatNumber;
    public int price;
    public boolean cancelled;

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