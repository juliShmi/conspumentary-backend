package juli_shmi.conspumentary.model.enums;

public enum Occupation {

    REPORTER("reporter"),
    CAMERAMAN("cameraman"),
    META_EXPERT("meta-expert"),
    BODYGUARD("bodyguard");

    private String value;


    Occupation(String value) {
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
