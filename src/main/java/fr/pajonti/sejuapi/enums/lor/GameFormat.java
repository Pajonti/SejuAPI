package fr.pajonti.sejuapi.enums.lor;

public enum GameFormat {

    STANDARD("standard"),
    ETERNAL("eternal");

    public final String textValue;

    GameFormat(String textValue) {
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
    public static GameFormat getEnum(String value){
        for (GameFormat p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
