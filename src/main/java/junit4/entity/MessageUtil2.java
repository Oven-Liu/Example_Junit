package junit4.entity;

/**
 * @author Liu Xudong
 * @date 2020-05-04 13:01
 */
public class MessageUtil2 {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil2(String message){
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        System.out.println(message);
        while(true) {}
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
