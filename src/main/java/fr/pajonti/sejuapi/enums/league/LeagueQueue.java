package fr.pajonti.sejuapi.enums.league;

public enum LeagueQueue {
    RANKED_SOLO_5X5("RANKED_SOLO_5X5"),
    RANKED_TFT("RANKED_TFT"),
    RANKED_FLEX_SR("RANKED_FLEX_SR"),
    RANKED_FLEX_TT("RANKED_FLEX_TT");

    public final String textValue;

    LeagueQueue(String textValue) {
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
    public static LeagueQueue getEnum(String value){
        for (LeagueQueue p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
