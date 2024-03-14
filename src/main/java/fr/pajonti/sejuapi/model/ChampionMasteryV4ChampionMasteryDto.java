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
import java.io.IOException;
import java.util.Arrays;

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
 * This object contains single Champion Mastery information for player and champion combination.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class ChampionMasteryV4ChampionMasteryDto {
  public static final String SERIALIZED_NAME_CHAMPION_POINTS_UNTIL_NEXT_LEVEL = "championPointsUntilNextLevel";
  @SerializedName(SERIALIZED_NAME_CHAMPION_POINTS_UNTIL_NEXT_LEVEL)
  private Long championPointsUntilNextLevel;

  public static final String SERIALIZED_NAME_CHEST_GRANTED = "chestGranted";
  @SerializedName(SERIALIZED_NAME_CHEST_GRANTED)
  private Boolean chestGranted;

  public static final String SERIALIZED_NAME_CHAMPION_ID = "championId";
  @SerializedName(SERIALIZED_NAME_CHAMPION_ID)
  private Long championId;

  public static final String SERIALIZED_NAME_LAST_PLAY_TIME = "lastPlayTime";
  @SerializedName(SERIALIZED_NAME_LAST_PLAY_TIME)
  private Long lastPlayTime;

  public static final String SERIALIZED_NAME_CHAMPION_LEVEL = "championLevel";
  @SerializedName(SERIALIZED_NAME_CHAMPION_LEVEL)
  private Integer championLevel;

  public static final String SERIALIZED_NAME_SUMMONER_ID = "summonerId";
  @SerializedName(SERIALIZED_NAME_SUMMONER_ID)
  private String summonerId;

  public static final String SERIALIZED_NAME_CHAMPION_POINTS = "championPoints";
  @SerializedName(SERIALIZED_NAME_CHAMPION_POINTS)
  private Integer championPoints;

  public static final String SERIALIZED_NAME_CHAMPION_POINTS_SINCE_LAST_LEVEL = "championPointsSinceLastLevel";
  @SerializedName(SERIALIZED_NAME_CHAMPION_POINTS_SINCE_LAST_LEVEL)
  private Long championPointsSinceLastLevel;

  public static final String SERIALIZED_NAME_TOKENS_EARNED = "tokensEarned";
  @SerializedName(SERIALIZED_NAME_TOKENS_EARNED)
  private Integer tokensEarned;

  public static final String SERIALIZED_NAME_PUUID = "puuid";
  @SerializedName(SERIALIZED_NAME_PUUID)
  private String puuid;

  public ChampionMasteryV4ChampionMasteryDto() {
  }

  public ChampionMasteryV4ChampionMasteryDto championPointsUntilNextLevel(Long championPointsUntilNextLevel) {
    this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    return this;
  }

   /**
   * Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion.
   * @return championPointsUntilNextLevel
  **/
  @javax.annotation.Nonnull
  public Long getChampionPointsUntilNextLevel() {
    return championPointsUntilNextLevel;
  }

  public void setChampionPointsUntilNextLevel(Long championPointsUntilNextLevel) {
    this.championPointsUntilNextLevel = championPointsUntilNextLevel;
  }


  public ChampionMasteryV4ChampionMasteryDto chestGranted(Boolean chestGranted) {
    this.chestGranted = chestGranted;
    return this;
  }

   /**
   * Is chest granted for this champion or not in current season.
   * @return chestGranted
  **/
  @javax.annotation.Nonnull
  public Boolean getChestGranted() {
    return chestGranted;
  }

  public void setChestGranted(Boolean chestGranted) {
    this.chestGranted = chestGranted;
  }


  public ChampionMasteryV4ChampionMasteryDto championId(Long championId) {
    this.championId = championId;
    return this;
  }

   /**
   * Champion ID for this entry.
   * @return championId
  **/
  @javax.annotation.Nonnull
  public Long getChampionId() {
    return championId;
  }

  public void setChampionId(Long championId) {
    this.championId = championId;
  }


  public ChampionMasteryV4ChampionMasteryDto lastPlayTime(Long lastPlayTime) {
    this.lastPlayTime = lastPlayTime;
    return this;
  }

   /**
   * Last time this champion was played by this player - in Unix milliseconds time format.
   * @return lastPlayTime
  **/
  @javax.annotation.Nonnull
  public Long getLastPlayTime() {
    return lastPlayTime;
  }

  public void setLastPlayTime(Long lastPlayTime) {
    this.lastPlayTime = lastPlayTime;
  }


  public ChampionMasteryV4ChampionMasteryDto championLevel(Integer championLevel) {
    this.championLevel = championLevel;
    return this;
  }

   /**
   * Champion level for specified player and champion combination.
   * @return championLevel
  **/
  @javax.annotation.Nonnull
  public Integer getChampionLevel() {
    return championLevel;
  }

  public void setChampionLevel(Integer championLevel) {
    this.championLevel = championLevel;
  }


  public ChampionMasteryV4ChampionMasteryDto summonerId(String summonerId) {
    this.summonerId = summonerId;
    return this;
  }

   /**
   * Summoner ID for this entry. (Encrypted)
   * @return summonerId
  **/
  @javax.annotation.Nonnull
  public String getSummonerId() {
    return summonerId;
  }

  public void setSummonerId(String summonerId) {
    this.summonerId = summonerId;
  }


  public ChampionMasteryV4ChampionMasteryDto championPoints(Integer championPoints) {
    this.championPoints = championPoints;
    return this;
  }

   /**
   * Total number of champion points for this player and champion combination - they are used to determine championLevel.
   * @return championPoints
  **/
  @javax.annotation.Nonnull
  public Integer getChampionPoints() {
    return championPoints;
  }

  public void setChampionPoints(Integer championPoints) {
    this.championPoints = championPoints;
  }


  public ChampionMasteryV4ChampionMasteryDto championPointsSinceLastLevel(Long championPointsSinceLastLevel) {
    this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    return this;
  }

   /**
   * Number of points earned since current level has been achieved.
   * @return championPointsSinceLastLevel
  **/
  @javax.annotation.Nonnull
  public Long getChampionPointsSinceLastLevel() {
    return championPointsSinceLastLevel;
  }

  public void setChampionPointsSinceLastLevel(Long championPointsSinceLastLevel) {
    this.championPointsSinceLastLevel = championPointsSinceLastLevel;
  }


  public ChampionMasteryV4ChampionMasteryDto tokensEarned(Integer tokensEarned) {
    this.tokensEarned = tokensEarned;
    return this;
  }

   /**
   * The token earned for this champion at the current championLevel. When the championLevel is advanced the tokensEarned resets to 0.
   * @return tokensEarned
  **/
  @javax.annotation.Nonnull
  public Integer getTokensEarned() {
    return tokensEarned;
  }

  public void setTokensEarned(Integer tokensEarned) {
    this.tokensEarned = tokensEarned;
  }


  public ChampionMasteryV4ChampionMasteryDto puuid(String puuid) {
    this.puuid = puuid;
    return this;
  }

   /**
   * Get puuid
   * @return puuid
  **/
  @javax.annotation.Nullable
  public String getPuuid() {
    return puuid;
  }

  public void setPuuid(String puuid) {
    this.puuid = puuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChampionMasteryV4ChampionMasteryDto championMasteryV4ChampionMasteryDto = (ChampionMasteryV4ChampionMasteryDto) o;
    return Objects.equals(this.championPointsUntilNextLevel, championMasteryV4ChampionMasteryDto.championPointsUntilNextLevel) &&
        Objects.equals(this.chestGranted, championMasteryV4ChampionMasteryDto.chestGranted) &&
        Objects.equals(this.championId, championMasteryV4ChampionMasteryDto.championId) &&
        Objects.equals(this.lastPlayTime, championMasteryV4ChampionMasteryDto.lastPlayTime) &&
        Objects.equals(this.championLevel, championMasteryV4ChampionMasteryDto.championLevel) &&
        Objects.equals(this.summonerId, championMasteryV4ChampionMasteryDto.summonerId) &&
        Objects.equals(this.championPoints, championMasteryV4ChampionMasteryDto.championPoints) &&
        Objects.equals(this.championPointsSinceLastLevel, championMasteryV4ChampionMasteryDto.championPointsSinceLastLevel) &&
        Objects.equals(this.tokensEarned, championMasteryV4ChampionMasteryDto.tokensEarned) &&
        Objects.equals(this.puuid, championMasteryV4ChampionMasteryDto.puuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(championPointsUntilNextLevel, chestGranted, championId, lastPlayTime, championLevel, summonerId, championPoints, championPointsSinceLastLevel, tokensEarned, puuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChampionMasteryV4ChampionMasteryDto {\n");
    sb.append("    championPointsUntilNextLevel: ").append(toIndentedString(championPointsUntilNextLevel)).append("\n");
    sb.append("    chestGranted: ").append(toIndentedString(chestGranted)).append("\n");
    sb.append("    championId: ").append(toIndentedString(championId)).append("\n");
    sb.append("    lastPlayTime: ").append(toIndentedString(lastPlayTime)).append("\n");
    sb.append("    championLevel: ").append(toIndentedString(championLevel)).append("\n");
    sb.append("    summonerId: ").append(toIndentedString(summonerId)).append("\n");
    sb.append("    championPoints: ").append(toIndentedString(championPoints)).append("\n");
    sb.append("    championPointsSinceLastLevel: ").append(toIndentedString(championPointsSinceLastLevel)).append("\n");
    sb.append("    tokensEarned: ").append(toIndentedString(tokensEarned)).append("\n");
    sb.append("    puuid: ").append(toIndentedString(puuid)).append("\n");
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
    openapiFields.add("championPointsUntilNextLevel");
    openapiFields.add("chestGranted");
    openapiFields.add("championId");
    openapiFields.add("lastPlayTime");
    openapiFields.add("championLevel");
    openapiFields.add("summonerId");
    openapiFields.add("championPoints");
    openapiFields.add("championPointsSinceLastLevel");
    openapiFields.add("tokensEarned");
    openapiFields.add("puuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("championPointsUntilNextLevel");
    openapiRequiredFields.add("chestGranted");
    openapiRequiredFields.add("championId");
    openapiRequiredFields.add("lastPlayTime");
    openapiRequiredFields.add("championLevel");
    openapiRequiredFields.add("summonerId");
    openapiRequiredFields.add("championPoints");
    openapiRequiredFields.add("championPointsSinceLastLevel");
    openapiRequiredFields.add("tokensEarned");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChampionMasteryV4ChampionMasteryDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChampionMasteryV4ChampionMasteryDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChampionMasteryV4ChampionMasteryDto is not found in the empty JSON string", ChampionMasteryV4ChampionMasteryDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChampionMasteryV4ChampionMasteryDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChampionMasteryV4ChampionMasteryDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChampionMasteryV4ChampionMasteryDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("summonerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summonerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summonerId").toString()));
      }
      if ((jsonObj.get("puuid") != null && !jsonObj.get("puuid").isJsonNull()) && !jsonObj.get("puuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `puuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("puuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChampionMasteryV4ChampionMasteryDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChampionMasteryV4ChampionMasteryDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChampionMasteryV4ChampionMasteryDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChampionMasteryV4ChampionMasteryDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ChampionMasteryV4ChampionMasteryDto>() {
           @Override
           public void write(JsonWriter out, ChampionMasteryV4ChampionMasteryDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChampionMasteryV4ChampionMasteryDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChampionMasteryV4ChampionMasteryDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChampionMasteryV4ChampionMasteryDto
  * @throws IOException if the JSON string is invalid with respect to ChampionMasteryV4ChampionMasteryDto
  */
  public static ChampionMasteryV4ChampionMasteryDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChampionMasteryV4ChampionMasteryDto.class);
  }

 /**
  * Convert an instance of ChampionMasteryV4ChampionMasteryDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

