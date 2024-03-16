package fr.pajonti.sejuapi.enums.lor;

public enum GameMode {

    CONSTRUCTED("Constructed"),
    TUTORIAL("Tutorial"),
    EXPEDITIONS("Expeditions");

    public final String textValue;

    GameMode(String textValue) {
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
    public static GameMode getEnum(String value){
        for (GameMode p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
