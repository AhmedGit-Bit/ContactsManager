import java.util.ArrayList;


public class Message {
    int id;
    String recipent;
    String message;
    public static ArrayList<Message> messages = new ArrayList<Message>();

    Message(int id, String recipent, String message){
        this.id = id;
        this.recipent = recipent;
        this.message = message;
    }
    Message(){
        messages.add(this);
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setRecipent(String recipent){
        this.recipent = recipent;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public int getId(){
        return this.id;
    }

    public String getRecipent(){
        return this.recipent;
    }

    public String getMessage(){
        return this.message;
    }

    public void showFullMessage(){
        System.out.print("ID: " + this.id +
        "\nRecipent: "+ this.recipent + 
        "\nMessage: " + this.message + "\n*************\n");
    }

}
