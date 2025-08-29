import java.util.ArrayList;

public class Contact{
    String firstName = new String();
    String lastName = new String();
    String email = new String();
    int phoneNumber;

    public static ArrayList<Contact> ContactList = new ArrayList<Contact>();


    Contact(String firstName, String lastName, String email, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    Contact(){
        ContactList.add(this);
    }

    // now set up the getters and setters

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void set(String firstName, String lastName, String email, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void showContactInformation(){
        System.out.print("Name: " + this.firstName + " " + this.lastName +
                         "\nPhone Number: " + this.phoneNumber + 
                         "\nEmail: " + this.phoneNumber + "\n*************\n");
    }

}