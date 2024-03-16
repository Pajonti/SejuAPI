package fr.pajonti.sejuapi.enums.league;

public enum GameMode {

    /**
     * Classic Summoner's Rift and Twisted Treeline games
     */
    CLASSIC("CLASSIC"),
    /**
     * Dominion/Crystal Scar games
     */
    ODIN("ODIN"),
    /**
     * ARAM games
     */
    ARAM("ARAM"),
    /**
     * Tutorial games
     */
    TUTORIAL("TUTORIAL"),
    /**
     * URF games
     */
    URF("URF"),
    /**
     * Doom Bot games
     */
    DOOMBOTSTEEMO("DOOMBOTSTEEMO"),
    /**
     * One for All games
     */
    ONEFORALL("ONEFORALL"),
    /**
     * Ascension games
     */
    ASCENSION("ASCENSION"),
    /**
     * Snowdown Showdown games
     */
    FIRSTBLOOD("FIRSTBLOOD"),
    /**
     * Legend of the Poro King games
     */
    KINGPORO("KINGPORO"),
    /**
     * Nexus Siege games
     */
    SIEGE("SIEGE"),
    /**
     * Blood Hunt Assassin games
     */
    ASSASSINATE("ASSASSINATE"),
    /**
     * All Random Summoner's Rift games
     */
    ARSR("ARSR"),
    /**
     * Dark Star: Singularity games
     */
    DARKSTAR("DARKSTAR"),
    /**
     * Star Guardian Invasion games
     */
    STARGUARDIAN("STARGUARDIAN"),
    /**
     * PROJECT: Hunters games
     */
    PROJECT("PROJECT"),
    /**
     * Nexus Blitz games
     */
    GAMEMODEX("GAMEMODEX"),
    /**
     * Odyssey: Extraction games
     */
    ODYSSEY("ODYSSEY"),
    /**
     * Nexus Blitz games
     */
    NEXUSBLITZ("NEXUSBLITZ"),
    /**
     * Ultimate Spellbook games
     */
    ULTBOOK("ULTBOOK");


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
