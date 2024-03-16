package fr.pajonti.sejuapi.enums.league;

public enum State {

    /**
     * DISABLED - not visible and not calculated
     */
    DISABLED("DISABLED"),
    /**
     * HIDDEN - not visible, but calculated
     */
    HIDDEN("HIDDEN"),
    /**
     * ENABLED - visible and calculated
     */
    ENABLED("ENABLED"),
    /**
     * ARCHIVED - visible, but not calculated
     */
    ARCHIVED("ARCHIVED");

    public final String textValue;

    State(String textValue) {
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
    public static State getEnum(String value){
        for (State p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
