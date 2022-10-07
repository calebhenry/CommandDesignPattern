public abstract class Command {
    protected Document doc;

    public Command(Document doc) {
        this.doc = doc;
    }

    public abstract String execute();
}
