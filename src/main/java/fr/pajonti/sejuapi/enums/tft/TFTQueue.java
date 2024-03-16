package fr.pajonti.sejuapi.enums.tft;

public enum TFTQueue {
    NORMAL_TFT("NORMAL_TFT"),
    RANKED_TFT("RANKED_TFT"),
    TUTORIAL_TFT("TUTORIAL_TFT"),
    RANKED_TFT_TURBO("RANKED_TFT_TURBO"),
    RANKED_TFT_DOUBLE_UP("RANKED_TFT_DOUBLE_UP"),
    SF_TFT("SF_TFT"),
    LYN23_TFT("NORMAL_TFT");

    public final String textValue;

    TFTQueue(String textValue) {
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
    public static TFTQueue getEnum(String value){
        for (TFTQueue p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
