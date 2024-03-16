package fr.pajonti.sejuapi.enums.tft;

public enum TFTGameType {

    MATCHED("MATCHED");

    public final String textValue;

    TFTGameType(String textValue) {
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
    public static TFTGameType getEnum(String value){
        for (TFTGameType p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
