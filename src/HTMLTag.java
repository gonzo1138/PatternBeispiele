import java.util.ArrayList;

public class HTMLTag extends HTMLAttribute implements HTMLPrintable{

    public static final int INDENTATON = 2;

    ArrayList<HTMLAttribute> attributes;
    ArrayList<HTMLPrintable> innerTag;

    public HTMLTag(String _name, String _value) {
        super(_name, _value);
    }

    @Override
    public String toHTMLTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName());
        for ( HTMLAttribute h: attributes){
                sb.append(" ");
                sb.append(h.toString());
        }
        sb.append(">");
        if(!innerTag.isEmpty() || !(getValue() == null)){
        sb.append("\n");
        for (HTMLPrintable h:innerTag)
        {
            for(int i = 0;i < INDENTATON;i++) {
                sb.append(' ');
            }
            h.toHTMLTag();
        }
        sb.append(getValue());
        sb.append("\n");
        }
        sb.append("<");
        sb.append("/");
        sb.append(getName());
        sb.append(">");
        return sb.toString();
    }
}
