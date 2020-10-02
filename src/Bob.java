import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean userConfirmation = true;

        System.out.println("Hey, I'm Bob. What's up? If you're done talking to me, just say \"Convo is over.\"");

        do {
            String userResponse = sc.nextLine().trim();

            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out bro!");
            } else if (userResponse.trim().isEmpty()) {
                System.out.println("Fine, be that way.");
            } else if (userResponse.equalsIgnoreCase("Convo is over.")) {
                System.out.println("I didn't want to talk anyways.");
                userConfirmation = false;
            } else {
                System.out.println("Whatever.");
            }
        } while(userConfirmation);

    }
}
