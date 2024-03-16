package fr.pajonti.sejuapi.enums.league;

public enum LanePosition {
    UNSELECTED("UNSELECTED"),
    FILL("FILL"),
    TOP("TOP"),
    JUNGLE("JUNGLE"),
    MIDDLE("MIDDLE"),
    BOTTOM("BOTTOM"),
    UTILITY("UTILITY");

    public final String textValue;

    LanePosition(String textValue) {
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
    public static LanePosition getEnum(String value){
        for (LanePosition p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
