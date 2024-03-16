package fr.pajonti.sejuapi.enums.league;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;

/**
 * <a href="https://static.developer.riotgames.com/docs/lol/maps.json">https://static.developer.riotgames.com/docs/lol/maps.json</a>
 */
@JsonAdapter(SummonerSpell.Serializer.class)
public enum SummonerSpell {
    BARRIER(21),
    CLEANSE(1),
    IGNITE(14),
    EXHAUST(3),
    FLASH(4),
    GHOST(6),
    HEAL(7),
    CLARITY(13),
    TO_THE_KING(30),
    PORO_TOSS(31),
    SMITE(11),
    MARK_URF(39),
    MARK_ARAM(32),
    TELEPORT(12),
    ULTIMATE_SPELLBOOK_PLACEHOLDER(54),
    ULTIMATE_SPELLBOOK_SMITE(55),
    CHERRY_FLASH(2202),
    CHERRY_GHOST(2201);

    public final Integer key;

    SummonerSpell(Integer key) {
        this.key = key;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public Integer getValue(){
        return key;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static SummonerSpell getEnum(Integer value){
        for (SummonerSpell p : values()) {
            if (p.key.equals(value)) {
                return p;
            }
        }
        return null;
    }

    static class Serializer implements JsonSerializer<SummonerSpell>, JsonDeserializer<SummonerSpell> {

        @Override
        public SummonerSpell deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return SummonerSpell.getEnum(jsonElement.getAsInt());
        }

        @Override
        public JsonElement serialize(SummonerSpell summonerSpell, Type type, JsonSerializationContext jsonSerializationContext) {
            return jsonSerializationContext.serialize(summonerSpell == null ? null : summonerSpell.key);
        }
    }
}
