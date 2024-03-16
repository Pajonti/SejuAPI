package fr.pajonti.sejuapi.enums.league;

public enum GameType {

    /**
     * Custom games
     */
    CUSTOM_GAME("CUSTOM_GAME"),
    /**
     * Tutorial games
     */
    TUTORIAL_GAME("TUTORIAL_GAME"),
    /**
     * all other games
     */
    MATCHED_GAME("MATCHED_GAME");


    public final String textValue;

    GameType(String textValue) {
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
    public static GameType getEnum(String value){
        for (GameType p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
