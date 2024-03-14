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
import fr.pajonti.sejuapi.model.SpectatorV5FeaturedGameInfo;
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
 * SpectatorV5FeaturedGames
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class SpectatorV5FeaturedGames {
  public static final String SERIALIZED_NAME_GAME_LIST = "gameList";
  @SerializedName(SERIALIZED_NAME_GAME_LIST)
  private List<SpectatorV5FeaturedGameInfo> gameList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_REFRESH_INTERVAL = "clientRefreshInterval";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFRESH_INTERVAL)
  private Long clientRefreshInterval;

  public SpectatorV5FeaturedGames() {
  }

  public SpectatorV5FeaturedGames gameList(List<SpectatorV5FeaturedGameInfo> gameList) {
    this.gameList = gameList;
    return this;
  }

  public SpectatorV5FeaturedGames addGameListItem(SpectatorV5FeaturedGameInfo gameListItem) {
    if (this.gameList == null) {
      this.gameList = new ArrayList<>();
    }
    this.gameList.add(gameListItem);
    return this;
  }

   /**
   * The list of featured games
   * @return gameList
  **/
  @javax.annotation.Nonnull
  public List<SpectatorV5FeaturedGameInfo> getGameList() {
    return gameList;
  }

  public void setGameList(List<SpectatorV5FeaturedGameInfo> gameList) {
    this.gameList = gameList;
  }


  public SpectatorV5FeaturedGames clientRefreshInterval(Long clientRefreshInterval) {
    this.clientRefreshInterval = clientRefreshInterval;
    return this;
  }

   /**
   * The suggested interval to wait before requesting FeaturedGames again
   * @return clientRefreshInterval
  **/
  @javax.annotation.Nullable
  public Long getClientRefreshInterval() {
    return clientRefreshInterval;
  }

  public void setClientRefreshInterval(Long clientRefreshInterval) {
    this.clientRefreshInterval = clientRefreshInterval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpectatorV5FeaturedGames spectatorV5FeaturedGames = (SpectatorV5FeaturedGames) o;
    return Objects.equals(this.gameList, spectatorV5FeaturedGames.gameList) &&
        Objects.equals(this.clientRefreshInterval, spectatorV5FeaturedGames.clientRefreshInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameList, clientRefreshInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpectatorV5FeaturedGames {\n");
    sb.append("    gameList: ").append(toIndentedString(gameList)).append("\n");
    sb.append("    clientRefreshInterval: ").append(toIndentedString(clientRefreshInterval)).append("\n");
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
    openapiFields.add("gameList");
    openapiFields.add("clientRefreshInterval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gameList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SpectatorV5FeaturedGames
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpectatorV5FeaturedGames.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpectatorV5FeaturedGames is not found in the empty JSON string", SpectatorV5FeaturedGames.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpectatorV5FeaturedGames.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpectatorV5FeaturedGames` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpectatorV5FeaturedGames.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("gameList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gameList` to be an array in the JSON string but got `%s`", jsonObj.get("gameList").toString()));
      }

      JsonArray jsonArraygameList = jsonObj.getAsJsonArray("gameList");
      // validate the required field `gameList` (array)
      for (int i = 0; i < jsonArraygameList.size(); i++) {
        SpectatorV5FeaturedGameInfo.validateJsonElement(jsonArraygameList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpectatorV5FeaturedGames.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpectatorV5FeaturedGames' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpectatorV5FeaturedGames> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpectatorV5FeaturedGames.class));

       return (TypeAdapter<T>) new TypeAdapter<SpectatorV5FeaturedGames>() {
           @Override
           public void write(JsonWriter out, SpectatorV5FeaturedGames value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpectatorV5FeaturedGames read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpectatorV5FeaturedGames given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpectatorV5FeaturedGames
  * @throws IOException if the JSON string is invalid with respect to SpectatorV5FeaturedGames
  */
  public static SpectatorV5FeaturedGames fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpectatorV5FeaturedGames.class);
  }

 /**
  * Convert an instance of SpectatorV5FeaturedGames to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

