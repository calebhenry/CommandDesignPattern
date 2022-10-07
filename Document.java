import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines;

    private final int TAB_SIZE = 8;

    public Document(String fileName) {
        this.fileName = fileName;
        lines = FileManipulator.readFile(fileName);
    }

    public String view() {
        int maxIntLength = 0;
        String result = "";

        for (String line : lines) {
            if (line.length() > maxIntLength)
                maxIntLength = line.length();
        }

        for (int i = 0; i < maxIntLength + TAB_SIZE * 2; i++)
            result += "-";
        result += "\n";

        for (String line : lines) {
            result += "|\t";
            result += line;
            for (int i = line.length(); i < maxIntLength + TAB_SIZE; i++)
                result += " ";
            result += "|\n";
        }

        for (int i = 0; i < maxIntLength + TAB_SIZE * 2; i++)
            result += "-";
        result += "\n";

        return result;
    }

    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }

    public String write(String line) {
        lines.clear();
        lines.add(line);
        return "The line was written to the file";
    }

    public String save() {
        if (FileManipulator.writeFile(fileName, lines)) {
            return "The file has been saved";
        } else {
            return "Sorry, we cannot save at this time";
        }

    }
}
