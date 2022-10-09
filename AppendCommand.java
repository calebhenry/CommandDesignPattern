import java.util.Scanner;

/**
 * A command class that appends a user-inputted line to the Document
 */
public class AppendCommand extends Command {
    private Scanner in;

    /**
     * Creates an AppendCommand instance
     * 
     * @param doc The document to create the AppendCommand with
     */
    public AppendCommand(Document doc) {
        super(doc);
        in = new Scanner(System.in);
    }

    /**
     * Accepts a line from the user as input and appends it to the document.
     * 
     * @return The string infroming the user of the append operation
     */
    public String execute() {
        System.out.println("Enter text: ");
        return doc.append(in.nextLine());
    }
}
