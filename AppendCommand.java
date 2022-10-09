import java.util.Scanner;

public class AppendCommand extends Command {
    private Scanner in;

    public AppendCommand(Document doc) {
        super(doc);
        in = new Scanner(System.in);
    }

    public String execute() {
        System.out.println("Enter text: ");
        return doc.append(in.nextLine());
    }
}
