package fr.pajonti.sejuapi.enums.league;

public enum Tracking {

    /**
     * LIFETIME - stats are incremented without reset
     */
    LIFETIME("LIFETIME"),
    /**
     * SEASON - stats are accumulated by season and reset at the beginning of new season
     */
    SEASON("SEASON");

    public final String textValue;

    Tracking(String textValue) {
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
    public static Tracking getEnum(String value){
        for (Tracking p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
