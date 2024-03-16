package fr.pajonti.sejuapi.enums.shared;

public enum Platform {

    WINDOWS("windows"),
    MACOS("macos"),
    ANDROID("android"),
    PS4("ps4"),
    XBONE("xbone"),
    SWITCH("switch"),
    IOS("ios");

    public final String textValue;

    Platform(String textValue) {
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
    public static Platform getEnum(String value){
        for (Platform p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
