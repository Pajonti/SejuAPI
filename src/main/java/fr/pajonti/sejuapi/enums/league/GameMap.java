package fr.pajonti.sejuapi.enums.league;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;

/**
 * <a href="https://static.developer.riotgames.com/docs/lol/maps.json">https://static.developer.riotgames.com/docs/lol/maps.json</a>
 */
@JsonAdapter(GameMap.Serializer.class)
public enum GameMap {
    /**
     * Original Summer variant
     */
    SUMMONERS_RIFT_SUMMER(1),
    /**
     * Original Autumn variant
     */
    SUMMONERS_RIFT_AUTUMN(2),
    /**
     * The Proving Grounds - Tutorial Map
     */
    PROVING_GROUNDS_TUTORIAL(3),
    /**
     * Twisted Treeline - Original Map
     */
    TWISTED_TREELINE_ORIGINAL(4),
    /**
     * Dominion map
     */
    CRYSTAL_SCAR_DOMINION(8),
    /**
     * Last TT map
     */
    TWISTED_TREELINE_LAST(10),
    /**
     * Current Version
     */
    SUMMONERS_RIFT(11),
    /**
     * ARAM map
     */
    HOWLING_ABYSS(12),
    /**
     * Alternate ARAM map
     */
    BUTCHERS_BRIDGE(14),
    /**
     * Dark Star: Singularity map
     */
    COSMIC_RUINS(16),
    /**
     * Star Guardian Invasion map
     */
    VALORAN_CITY_PARK(18),
    /**
     * PROJECT: Hunters map
     */
    SUBSTRUCTURE_43(19),
    /**
     * Odyssey: Extraction map
     */
    CRASH_SITE(20),
    /**
     * Nexus Blitz map
     */
    NEXUS_BLITZ(21),
    /**
     * Teamfight Tactics map
     */
    CONVERGENCE(22),
    /**
     * Arena map
     */
    RINGS_OF_WRATH(30);

    public final Integer id;

    GameMap(Integer id) {
        this.id = id;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public Integer getValue(){
        return id;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static GameMap getEnum(Integer value){
        for (GameMap p : values()) {
            if (p.id.equals(value)) {
                return p;
            }
        }
        return null;
    }

    static class Serializer implements JsonSerializer<GameMap>, JsonDeserializer<GameMap> {

        @Override
        public GameMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return GameMap.getEnum(jsonElement.getAsInt());
        }

        @Override
        public JsonElement serialize(GameMap gameMap, Type type, JsonSerializationContext jsonSerializationContext) {
            return jsonSerializationContext.serialize(gameMap.id);
        }
    }
}
