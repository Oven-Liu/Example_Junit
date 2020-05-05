package junit4.entity;

/**
 * @author Liu Xudong
 * @date 2020-05-04 13:19
 */
public class MessageUtil3 {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil3(String message){
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        System.out.println(message);
        int a =0;
        int b = 1/a;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
