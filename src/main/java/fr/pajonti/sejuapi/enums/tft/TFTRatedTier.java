package fr.pajonti.sejuapi.enums.tft;

public enum TFTRatedTier {
    ORANGE("ORANGE"),
    PURPLE("PURPLE"),
    BLUE("BLUE"),
    GREEN("GREEN"),
    GRAY("GRAY");

    public final String textValue;

    TFTRatedTier(String textValue) {
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
    public static TFTRatedTier getEnum(String value){
        for (TFTRatedTier p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
