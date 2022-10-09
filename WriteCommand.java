import java.util.Scanner;

public class WriteCommand extends Command {
    private Scanner in;

    public WriteCommand(Document doc) {
        super(doc);
        in = new Scanner(System.in);
    }

    public String execute() {
        System.out.println("Enter text: ");
        return doc.write(in.nextLine());
    }
}