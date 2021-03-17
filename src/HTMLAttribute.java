public class HTMLAttribute {

    private String name;
    private String value;

    public HTMLAttribute(String _name,String _value){
        name = _name;
        value = _value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}
