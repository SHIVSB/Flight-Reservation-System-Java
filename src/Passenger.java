package src;
import java.io.*;

class Passenger {

    private static int idCounter;

    public Passenger(){
        idCounter++;
    }
    //Contact class nested inside passenger class
    private static class Contact {
        private String name;
        private int phone;
        private String email;

        public void getcontact(int phone){
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

    Address address = new Passenger.Address();
    Contact contact = new Passenger.Contact();

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public String getPassengerCount(){
        return this.idCounter;
    }

}