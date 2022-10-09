
/**
 * A generic class for a command that can be executed with a specific Document
 */
public abstract class Command {
    protected Document doc;

    /**
     * Creates the Command with the specified Document
     * 
     * @param doc The document to construct the command with
     */
    public Command(Document doc) {
        this.doc = doc;
    }

    /**
     * Performs the command
     * 
     * @return The output that the user should see after the command has been
     *         executed
     */
    public abstract String execute();
}
