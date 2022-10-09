
/**
 * A command class that saves the document as a file
 */
public class SaveCommand extends Command {

    /**
     * Creates an WriteCommand instance
     * 
     * @param doc The document to create the WriteCommand with
     */
    public SaveCommand(Document doc) {
        super(doc);
    }

    /**
     * Saves the document as a file
     * 
     * @return The string to output to inform the user of the save operation
     */
    public String execute() {
        return this.doc.save();
    }
}