package fr.pajonti.sejuapi.enums.league;

public enum Position {
    UNSELECTED("UNSELECTED"),
    FILL("FILL"),
    TOP("TOP"),
    JUNGLE("JUNGLE"),
    MIDDLE("MIDDLE"),
    BOTTOM("BOTTOM"),
    UTILITY("UTILITY");

    public final String textValue;

    Position(String textValue) {
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
    public static Position getEnum(String value){
        for (Position p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
