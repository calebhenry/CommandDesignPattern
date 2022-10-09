import java.util.Scanner;

/**
 * A command class that replaces the document with a user-inputted line
 */
public class WriteCommand extends Command {
    private Scanner in;

    /**
     * Creates an WriteCommand instance
     * 
     * @param doc The document to create the WriteCommand with
     */
    public WriteCommand(Document doc) {
        super(doc);
        in = new Scanner(System.in);
    }

    /**
     * Replaces the document with a user-inputted line
     * 
     * @return The string to output to inform the user of the write operation
     */
    public String execute() {
        System.out.println("Enter text: ");
        return doc.write(in.nextLine());
    }
}