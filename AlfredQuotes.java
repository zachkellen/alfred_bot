import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String response = String.format("Hello, %s! How are you?", name);
        return response;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Today's date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") != -1){
            return "Right away, sir. Alexis is too stupid for that!";
        } else if(conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally.";
        } else{
            return "Right. And with that I shall retire";
        }
    }
    
// NINJA BONUS
// See the specs to overload the guessGreeting method
// SENSEI BONUS
// Write your own AlfredQuote method using any of the String methods you have learned!
}

