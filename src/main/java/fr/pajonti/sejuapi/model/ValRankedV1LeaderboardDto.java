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
import fr.pajonti.sejuapi.model.ValRankedV1PlayerDto;
import fr.pajonti.sejuapi.model.ValRankedV1TierDetailDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ValRankedV1LeaderboardDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class ValRankedV1LeaderboardDto {
  public static final String SERIALIZED_NAME_SHARD = "shard";
  @SerializedName(SERIALIZED_NAME_SHARD)
  private String shard;

  public static final String SERIALIZED_NAME_ACT_ID = "actId";
  @SerializedName(SERIALIZED_NAME_ACT_ID)
  private String actId;

  public static final String SERIALIZED_NAME_TOTAL_PLAYERS = "totalPlayers";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAYERS)
  private Long totalPlayers;

  public static final String SERIALIZED_NAME_PLAYERS = "players";
  @SerializedName(SERIALIZED_NAME_PLAYERS)
  private List<ValRankedV1PlayerDto> players = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMMORTAL_STARTING_PAGE = "immortalStartingPage";
  @SerializedName(SERIALIZED_NAME_IMMORTAL_STARTING_PAGE)
  private Long immortalStartingPage;

  public static final String SERIALIZED_NAME_IMMORTAL_STARTING_INDEX = "immortalStartingIndex";
  @SerializedName(SERIALIZED_NAME_IMMORTAL_STARTING_INDEX)
  private Long immortalStartingIndex;

  public static final String SERIALIZED_NAME_TOP_TIER_R_R_THRESHOLD = "topTierRRThreshold";
  @SerializedName(SERIALIZED_NAME_TOP_TIER_R_R_THRESHOLD)
  private Long topTierRRThreshold;

  public static final String SERIALIZED_NAME_TIER_DETAILS = "tierDetails";
  @SerializedName(SERIALIZED_NAME_TIER_DETAILS)
  private Map<String, ValRankedV1TierDetailDto> tierDetails = new HashMap<>();

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Long startIndex;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public ValRankedV1LeaderboardDto() {
  }

  public ValRankedV1LeaderboardDto shard(String shard) {
    this.shard = shard;
    return this;
  }

   /**
   * The shard for the given leaderboard.
   * @return shard
  **/
  @javax.annotation.Nonnull
  public String getShard() {
    return shard;
  }

  public void setShard(String shard) {
    this.shard = shard;
  }


  public ValRankedV1LeaderboardDto actId(String actId) {
    this.actId = actId;
    return this;
  }

   /**
   * The act id for the given leaderboard. Act ids can be found using the val-content API.
   * @return actId
  **/
  @javax.annotation.Nonnull
  public String getActId() {
    return actId;
  }

  public void setActId(String actId) {
    this.actId = actId;
  }


  public ValRankedV1LeaderboardDto totalPlayers(Long totalPlayers) {
    this.totalPlayers = totalPlayers;
    return this;
  }

   /**
   * The total number of players in the leaderboard.
   * @return totalPlayers
  **/
  @javax.annotation.Nonnull
  public Long getTotalPlayers() {
    return totalPlayers;
  }

  public void setTotalPlayers(Long totalPlayers) {
    this.totalPlayers = totalPlayers;
  }


  public ValRankedV1LeaderboardDto players(List<ValRankedV1PlayerDto> players) {
    this.players = players;
    return this;
  }

  public ValRankedV1LeaderboardDto addPlayersItem(ValRankedV1PlayerDto playersItem) {
    if (this.players == null) {
      this.players = new ArrayList<>();
    }
    this.players.add(playersItem);
    return this;
  }

   /**
   * Get players
   * @return players
  **/
  @javax.annotation.Nonnull
  public List<ValRankedV1PlayerDto> getPlayers() {
    return players;
  }

  public void setPlayers(List<ValRankedV1PlayerDto> players) {
    this.players = players;
  }


  public ValRankedV1LeaderboardDto immortalStartingPage(Long immortalStartingPage) {
    this.immortalStartingPage = immortalStartingPage;
    return this;
  }

   /**
   * Get immortalStartingPage
   * @return immortalStartingPage
  **/
  @javax.annotation.Nullable
  public Long getImmortalStartingPage() {
    return immortalStartingPage;
  }

  public void setImmortalStartingPage(Long immortalStartingPage) {
    this.immortalStartingPage = immortalStartingPage;
  }


  public ValRankedV1LeaderboardDto immortalStartingIndex(Long immortalStartingIndex) {
    this.immortalStartingIndex = immortalStartingIndex;
    return this;
  }

   /**
   * Get immortalStartingIndex
   * @return immortalStartingIndex
  **/
  @javax.annotation.Nullable
  public Long getImmortalStartingIndex() {
    return immortalStartingIndex;
  }

  public void setImmortalStartingIndex(Long immortalStartingIndex) {
    this.immortalStartingIndex = immortalStartingIndex;
  }


  public ValRankedV1LeaderboardDto topTierRRThreshold(Long topTierRRThreshold) {
    this.topTierRRThreshold = topTierRRThreshold;
    return this;
  }

   /**
   * Get topTierRRThreshold
   * @return topTierRRThreshold
  **/
  @javax.annotation.Nullable
  public Long getTopTierRRThreshold() {
    return topTierRRThreshold;
  }

  public void setTopTierRRThreshold(Long topTierRRThreshold) {
    this.topTierRRThreshold = topTierRRThreshold;
  }


  public ValRankedV1LeaderboardDto tierDetails(Map<String, ValRankedV1TierDetailDto> tierDetails) {
    this.tierDetails = tierDetails;
    return this;
  }

  public ValRankedV1LeaderboardDto putTierDetailsItem(String key, ValRankedV1TierDetailDto tierDetailsItem) {
    if (this.tierDetails == null) {
      this.tierDetails = new HashMap<>();
    }
    this.tierDetails.put(key, tierDetailsItem);
    return this;
  }

   /**
   * Get tierDetails
   * @return tierDetails
  **/
  @javax.annotation.Nullable
  public Map<String, ValRankedV1TierDetailDto> getTierDetails() {
    return tierDetails;
  }

  public void setTierDetails(Map<String, ValRankedV1TierDetailDto> tierDetails) {
    this.tierDetails = tierDetails;
  }


  public ValRankedV1LeaderboardDto startIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @javax.annotation.Nullable
  public Long getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
  }


  public ValRankedV1LeaderboardDto query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValRankedV1LeaderboardDto valRankedV1LeaderboardDto = (ValRankedV1LeaderboardDto) o;
    return Objects.equals(this.shard, valRankedV1LeaderboardDto.shard) &&
        Objects.equals(this.actId, valRankedV1LeaderboardDto.actId) &&
        Objects.equals(this.totalPlayers, valRankedV1LeaderboardDto.totalPlayers) &&
        Objects.equals(this.players, valRankedV1LeaderboardDto.players) &&
        Objects.equals(this.immortalStartingPage, valRankedV1LeaderboardDto.immortalStartingPage) &&
        Objects.equals(this.immortalStartingIndex, valRankedV1LeaderboardDto.immortalStartingIndex) &&
        Objects.equals(this.topTierRRThreshold, valRankedV1LeaderboardDto.topTierRRThreshold) &&
        Objects.equals(this.tierDetails, valRankedV1LeaderboardDto.tierDetails) &&
        Objects.equals(this.startIndex, valRankedV1LeaderboardDto.startIndex) &&
        Objects.equals(this.query, valRankedV1LeaderboardDto.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shard, actId, totalPlayers, players, immortalStartingPage, immortalStartingIndex, topTierRRThreshold, tierDetails, startIndex, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValRankedV1LeaderboardDto {\n");
    sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
    sb.append("    actId: ").append(toIndentedString(actId)).append("\n");
    sb.append("    totalPlayers: ").append(toIndentedString(totalPlayers)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    immortalStartingPage: ").append(toIndentedString(immortalStartingPage)).append("\n");
    sb.append("    immortalStartingIndex: ").append(toIndentedString(immortalStartingIndex)).append("\n");
    sb.append("    topTierRRThreshold: ").append(toIndentedString(topTierRRThreshold)).append("\n");
    sb.append("    tierDetails: ").append(toIndentedString(tierDetails)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
    openapiFields.add("shard");
    openapiFields.add("actId");
    openapiFields.add("totalPlayers");
    openapiFields.add("players");
    openapiFields.add("immortalStartingPage");
    openapiFields.add("immortalStartingIndex");
    openapiFields.add("topTierRRThreshold");
    openapiFields.add("tierDetails");
    openapiFields.add("startIndex");
    openapiFields.add("query");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shard");
    openapiRequiredFields.add("actId");
    openapiRequiredFields.add("totalPlayers");
    openapiRequiredFields.add("players");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValRankedV1LeaderboardDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValRankedV1LeaderboardDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValRankedV1LeaderboardDto is not found in the empty JSON string", ValRankedV1LeaderboardDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValRankedV1LeaderboardDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValRankedV1LeaderboardDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValRankedV1LeaderboardDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("shard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shard").toString()));
      }
      if (!jsonObj.get("actId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("players").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `players` to be an array in the JSON string but got `%s`", jsonObj.get("players").toString()));
      }

      JsonArray jsonArrayplayers = jsonObj.getAsJsonArray("players");
      // validate the required field `players` (array)
      for (int i = 0; i < jsonArrayplayers.size(); i++) {
        ValRankedV1PlayerDto.validateJsonElement(jsonArrayplayers.get(i));
      };
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValRankedV1LeaderboardDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValRankedV1LeaderboardDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValRankedV1LeaderboardDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValRankedV1LeaderboardDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ValRankedV1LeaderboardDto>() {
           @Override
           public void write(JsonWriter out, ValRankedV1LeaderboardDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValRankedV1LeaderboardDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValRankedV1LeaderboardDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValRankedV1LeaderboardDto
  * @throws IOException if the JSON string is invalid with respect to ValRankedV1LeaderboardDto
  */
  public static ValRankedV1LeaderboardDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValRankedV1LeaderboardDto.class);
  }

 /**
  * Convert an instance of ValRankedV1LeaderboardDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

