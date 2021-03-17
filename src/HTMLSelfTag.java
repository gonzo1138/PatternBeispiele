import java.util.ArrayList;
import java.util.List;

public class HTMLSelfTag extends HTMLAttribute implements HTMLPrintable{

    public static final int INDENTATON = 2;
    ArrayList<HTMLAttribute> attributes;

    public HTMLSelfTag(String _name, String _value) {
        super(_name, _value);
    }

    @Override
    public String toHTMLTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName());
        for (HTMLAttribute h : attributes) {
            sb.append(" ");
            sb.append(h.toString());
        }
        sb.append("/>\n");
        return sb.toString();
    }
}
