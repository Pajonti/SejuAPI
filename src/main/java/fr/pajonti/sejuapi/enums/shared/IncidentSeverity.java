package fr.pajonti.sejuapi.enums.shared;

public enum IncidentSeverity {

    INFO("info"),
    WARNING("warning"),
    CRITICAL("critical");

    public final String textValue;

    IncidentSeverity(String textValue) {
        this.textValue = textValue;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public String getValue(){
        return textValue;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static IncidentSeverity getEnum(String value){
        for (IncidentSeverity p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
