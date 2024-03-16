package fr.pajonti.sejuapi.enums.lor;

public enum LorGameFormat {

    STANDARD("standard"),
    ETERNAL("eternal");

    public final String textValue;

    LorGameFormat(String textValue) {
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
    public static LorGameFormat getEnum(String value){
        for (LorGameFormat p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
