public class SaveCommand extends Command {
    public SaveCommand(Document doc) {
        super(doc);
    }

    public String execute() {
        return this.doc.save();
    }
}