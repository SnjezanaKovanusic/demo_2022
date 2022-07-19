import model.Student;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Foo {
    public static void main(String[] args) throws ParseException {
        Student stringToParse= new Student();
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(stringToParse.toString());
    }
}
