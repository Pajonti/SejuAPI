package fr.pajonti.sejuapi.enums.tft;

public enum TFTTier {
    CHALLENGER("CHALLENGER"),
    GRANDMASTER("GRANDMASTER"),
    MASTER("MASTER"),
    DIAMOND("DIAMOND"),
    PLATINUM("PLATINUM"),
    EMERALD("EMERALD"),
    GOLD("GOLD"),
    SILVER("SILVER"),
    BRONZE("BRONZE"),
    IRON("IRON");

    public final String textValue;

    TFTTier(String textValue) {
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
    public static TFTTier getEnum(String value){
        for (TFTTier p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
