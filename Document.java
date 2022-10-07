import java.util.ArrayList;


public class Document {
    private String fileName;
    private ArrayList<String> lines;

    public Document(String fileName) {
        this.fileName = fileName;  
        FileManipulator reader = new FileManipulator();      
        lines = reader.readFile(fileName);
    }

    public String view() {
        return "";
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
        FileManipulator writer = new FileManipulator();
        if(writer.writeFile(fileName, lines)) {
            return "The file has been saved";
        }
        else{
            return "Sorry, we cannot save at this time";
        }
        
    }
}
