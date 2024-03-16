package fr.pajonti.sejuapi.enums.lor;

public enum GameType {

    RANKED("Ranked"),
    NORMAL("Normal"),
    TUTORIAL("Tutorial"),
    VANILLATRIAL("VanillaTrial"),
    SINGLETON("Singleton"),
    STANDARDGAUNTLET("StandardGauntlet");

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
