package fr.pajonti.sejuapi.enums.lor;

public enum LorGameMode {

    CONSTRUCTED("Constructed"),
    TUTORIAL("Tutorial"),
    EXPEDITIONS("Expeditions");

    public final String textValue;

    LorGameMode(String textValue) {
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
    public static LorGameMode getEnum(String value){
        for (LorGameMode p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
