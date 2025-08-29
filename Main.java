import java.util.Scanner;


public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Hello User!");
        initialMenu();
        scanner.close();
    }

    static void initialMenu(){
        int x = 0;

        System.out.print("\t1) Manage Contacts\n\t2) Send Messages\n\t3) Quit\n\t->");
        x = scanner.nextInt();
        switch(x){
            case 1:
                manageContact();
            break;
            case 2:
                manageMessages();
            break;
            case 3:
            System.out.println("Quitting...");
            break;
        }
        if(x != 3){
            initialMenu();
        }
    }

    static void manageMessages(){
        int x;
        System.out.print("\t1) See the list of all messages\n\t2) Send a new Message\n\t3) Go back to the previous menu\n\t->");
        x = scanner.nextInt();
        //scanner.nextLine();
        
        switch(x){
            case 1:
                seeAllMessages();
            break;
            case 2:
                sendNewMessage();
            break;
            case 3:
                
            break;
        }
        if(x != 3){
            manageMessages();
        }
    }

    static void sendNewMessage(){
        // get id then recipent then message
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter recipent Name: ");
        String recipent = scanner.nextLine();
        if(recipent.isBlank()){
            System.out.println("Recipent Name is invalid.");
            sendNewMessage();
        }
        System.out.print("Enter the Message: ");
        String message = scanner.nextLine();
        if(message.isBlank()){
            System.out.println("Message Name is invalid.");
            sendNewMessage();
        }
        Message newMessage = new Message(id, recipent, message);
        Message.messages.add(newMessage);
    }

    static void seeAllMessages(){
        if(Message.messages.isEmpty()){
            System.out.println("No messages sent.");
        }
        else{
            for(Message m : Message.messages){
                m.showFullMessage();
            }
        }
    }

    static void manageContact(){
        int x = 0;
        System.out.print("\t1) Show All Contacts\n\t2) Add a new Contact\n\t3) Search for a contact\n\t4)Delete a contact\n\t5)Go back to the previous menu\n\t->");
        x = scanner.nextInt();
        scanner.nextLine();
        
        switch(x){
            case 1:
                showContactInformation();
            break;
            case 2:
                addContact();
            break;
            case 3:
                searchContact();
            break;
            case 4:
                deleteContact();
            break;
            case 5:
                System.out.println("Going back...");
        }
        if(x != 5){
            manageContact();
        }
    }

    static void showContactInformation(){
        if(Contact.ContactList.isEmpty()){
            System.out.println("There are currently no Contacts.");
        }
        else{
            for(Object c : Contact.ContactList){
                ((Contact)c).showContactInformation();
            }
        }
    }
    
    static void addContact(){
        
        System.out.print("Enter Full Name: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.print("Enter Email: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        int phoneNumber = scanner.nextInt();
        Contact NewContact = new Contact(firstName, lastName, email, phoneNumber);
        Contact.ContactList.add(NewContact);
        System.out.print("Contact Added.\n");
    }

    static void searchContact(){
        
        System.out.print("Enter the contact's Phone Number: ");
        int p = scanner.nextInt();

        for(Contact c : Contact.ContactList){
            int ContactPhoneNumber = c.getPhoneNumber();
            if(ContactPhoneNumber == p){
                ((Contact)c).showContactInformation();
                
                return;
            }
        }
        System.out.println("Contact Not Found.");
        

    }

    static void deleteContact(){
        
        System.out.print("Enter the contact's Phone Number: ");
        int p = scanner.nextInt();

        for(Contact c : Contact.ContactList){
            int ContactPhoneNumber = c.getPhoneNumber();
            if(ContactPhoneNumber == p){
                Contact.ContactList.remove(Contact.ContactList.indexOf(c));
                System.out.print("Contact Removed.\n");
                return;
            }
        }
        System.out.println("Contact Not Found.");
        
    }
}
