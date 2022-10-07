public class ViewCommand extends Command {
    public ViewCommand(Document doc) {
        super(doc);
    }

    public String execute() {
        return this.doc.view();
    }
}
