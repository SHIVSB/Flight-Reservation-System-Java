import java.io.*;

public class Address {
    public String street;
    public String city;
    public String state;

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