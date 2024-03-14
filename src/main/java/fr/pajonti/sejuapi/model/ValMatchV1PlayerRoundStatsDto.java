/*
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([view file](../openapi-3.0.0.json), [ui select](?url=../openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([view file](../openapi-3.0.0.min.json), [ui select](?url=../openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([view file](../openapi-3.0.0.yml), [ui select](?url=../openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([view file](../openapi-3.0.0.min.yml), [ui select](?url=../openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([view file](../swaggerspec-2.0.json), [ui select](?url=../swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([view file](../swaggerspec-2.0.min.json), [ui select](?url=../swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([view file](../swaggerspec-2.0.yml), [ui select](?url=../swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([view file](../swaggerspec-2.0.min.yml), [ui select](?url=../swaggerspec-2.0.min.yml)) ## Other Files - Missing DTOs: [`missing.json`](../missing.json) - Routes Table: [`routesTable.json`](../routesTable.json) - [Enum Files](../enums/) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.com/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * The version of the OpenAPI document: 879affafe206ccc5b48127e68c0bd466fcc73c84
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.pajonti.sejuapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import fr.pajonti.sejuapi.model.ValMatchV1AbilityDto;
import fr.pajonti.sejuapi.model.ValMatchV1DamageDto;
import fr.pajonti.sejuapi.model.ValMatchV1EconomyDto;
import fr.pajonti.sejuapi.model.ValMatchV1KillDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.pajonti.sejuapi.invoker.JSON;

/**
 * ValMatchV1PlayerRoundStatsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class ValMatchV1PlayerRoundStatsDto {
  public static final String SERIALIZED_NAME_PUUID = "puuid";
  @SerializedName(SERIALIZED_NAME_PUUID)
  private String puuid;

  public static final String SERIALIZED_NAME_KILLS = "kills";
  @SerializedName(SERIALIZED_NAME_KILLS)
  private List<ValMatchV1KillDto> kills = new ArrayList<>();

  public static final String SERIALIZED_NAME_DAMAGE = "damage";
  @SerializedName(SERIALIZED_NAME_DAMAGE)
  private List<ValMatchV1DamageDto> damage = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_ECONOMY = "economy";
  @SerializedName(SERIALIZED_NAME_ECONOMY)
  private ValMatchV1EconomyDto economy;

  public static final String SERIALIZED_NAME_ABILITY = "ability";
  @SerializedName(SERIALIZED_NAME_ABILITY)
  private ValMatchV1AbilityDto ability;

  public ValMatchV1PlayerRoundStatsDto() {
  }

  public ValMatchV1PlayerRoundStatsDto puuid(String puuid) {
    this.puuid = puuid;
    return this;
  }

   /**
   * Get puuid
   * @return puuid
  **/
  @javax.annotation.Nonnull
  public String getPuuid() {
    return puuid;
  }

  public void setPuuid(String puuid) {
    this.puuid = puuid;
  }


  public ValMatchV1PlayerRoundStatsDto kills(List<ValMatchV1KillDto> kills) {
    this.kills = kills;
    return this;
  }

  public ValMatchV1PlayerRoundStatsDto addKillsItem(ValMatchV1KillDto killsItem) {
    if (this.kills == null) {
      this.kills = new ArrayList<>();
    }
    this.kills.add(killsItem);
    return this;
  }

   /**
   * Get kills
   * @return kills
  **/
  @javax.annotation.Nonnull
  public List<ValMatchV1KillDto> getKills() {
    return kills;
  }

  public void setKills(List<ValMatchV1KillDto> kills) {
    this.kills = kills;
  }


  public ValMatchV1PlayerRoundStatsDto damage(List<ValMatchV1DamageDto> damage) {
    this.damage = damage;
    return this;
  }

  public ValMatchV1PlayerRoundStatsDto addDamageItem(ValMatchV1DamageDto damageItem) {
    if (this.damage == null) {
      this.damage = new ArrayList<>();
    }
    this.damage.add(damageItem);
    return this;
  }

   /**
   * Get damage
   * @return damage
  **/
  @javax.annotation.Nonnull
  public List<ValMatchV1DamageDto> getDamage() {
    return damage;
  }

  public void setDamage(List<ValMatchV1DamageDto> damage) {
    this.damage = damage;
  }


  public ValMatchV1PlayerRoundStatsDto score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nonnull
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  public ValMatchV1PlayerRoundStatsDto economy(ValMatchV1EconomyDto economy) {
    this.economy = economy;
    return this;
  }

   /**
   * Get economy
   * @return economy
  **/
  @javax.annotation.Nonnull
  public ValMatchV1EconomyDto getEconomy() {
    return economy;
  }

  public void setEconomy(ValMatchV1EconomyDto economy) {
    this.economy = economy;
  }


  public ValMatchV1PlayerRoundStatsDto ability(ValMatchV1AbilityDto ability) {
    this.ability = ability;
    return this;
  }

   /**
   * Get ability
   * @return ability
  **/
  @javax.annotation.Nonnull
  public ValMatchV1AbilityDto getAbility() {
    return ability;
  }

  public void setAbility(ValMatchV1AbilityDto ability) {
    this.ability = ability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValMatchV1PlayerRoundStatsDto valMatchV1PlayerRoundStatsDto = (ValMatchV1PlayerRoundStatsDto) o;
    return Objects.equals(this.puuid, valMatchV1PlayerRoundStatsDto.puuid) &&
        Objects.equals(this.kills, valMatchV1PlayerRoundStatsDto.kills) &&
        Objects.equals(this.damage, valMatchV1PlayerRoundStatsDto.damage) &&
        Objects.equals(this.score, valMatchV1PlayerRoundStatsDto.score) &&
        Objects.equals(this.economy, valMatchV1PlayerRoundStatsDto.economy) &&
        Objects.equals(this.ability, valMatchV1PlayerRoundStatsDto.ability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(puuid, kills, damage, score, economy, ability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValMatchV1PlayerRoundStatsDto {\n");
    sb.append("    puuid: ").append(toIndentedString(puuid)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("puuid");
    openapiFields.add("kills");
    openapiFields.add("damage");
    openapiFields.add("score");
    openapiFields.add("economy");
    openapiFields.add("ability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("puuid");
    openapiRequiredFields.add("kills");
    openapiRequiredFields.add("damage");
    openapiRequiredFields.add("score");
    openapiRequiredFields.add("economy");
    openapiRequiredFields.add("ability");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValMatchV1PlayerRoundStatsDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValMatchV1PlayerRoundStatsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValMatchV1PlayerRoundStatsDto is not found in the empty JSON string", ValMatchV1PlayerRoundStatsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValMatchV1PlayerRoundStatsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValMatchV1PlayerRoundStatsDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValMatchV1PlayerRoundStatsDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("puuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `puuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("puuid").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("kills").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `kills` to be an array in the JSON string but got `%s`", jsonObj.get("kills").toString()));
      }

      JsonArray jsonArraykills = jsonObj.getAsJsonArray("kills");
      // validate the required field `kills` (array)
      for (int i = 0; i < jsonArraykills.size(); i++) {
        ValMatchV1KillDto.validateJsonElement(jsonArraykills.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("damage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `damage` to be an array in the JSON string but got `%s`", jsonObj.get("damage").toString()));
      }

      JsonArray jsonArraydamage = jsonObj.getAsJsonArray("damage");
      // validate the required field `damage` (array)
      for (int i = 0; i < jsonArraydamage.size(); i++) {
        ValMatchV1DamageDto.validateJsonElement(jsonArraydamage.get(i));
      };
      // validate the required field `economy`
      ValMatchV1EconomyDto.validateJsonElement(jsonObj.get("economy"));
      // validate the required field `ability`
      ValMatchV1AbilityDto.validateJsonElement(jsonObj.get("ability"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValMatchV1PlayerRoundStatsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValMatchV1PlayerRoundStatsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValMatchV1PlayerRoundStatsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValMatchV1PlayerRoundStatsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ValMatchV1PlayerRoundStatsDto>() {
           @Override
           public void write(JsonWriter out, ValMatchV1PlayerRoundStatsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValMatchV1PlayerRoundStatsDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValMatchV1PlayerRoundStatsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValMatchV1PlayerRoundStatsDto
  * @throws IOException if the JSON string is invalid with respect to ValMatchV1PlayerRoundStatsDto
  */
  public static ValMatchV1PlayerRoundStatsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValMatchV1PlayerRoundStatsDto.class);
  }

 /**
  * Convert an instance of ValMatchV1PlayerRoundStatsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

