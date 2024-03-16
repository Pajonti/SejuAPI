package fr.pajonti.sejuapi.enums.league;

public enum LeagueDivision {
    I("I"),
    II("II"),
    III("III"),
    IV("IV");

    public final String textValue;

    LeagueDivision(String textValue) {
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
    public static LeagueDivision getEnum(String value){
        for (LeagueDivision p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
