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
 * MatchV5ParticipantMissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class MatchV5ParticipantMissions {
  public static final String SERIALIZED_NAME_PLAYER_SCORE0 = "playerScore0";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE0)
  private Integer playerScore0;

  public static final String SERIALIZED_NAME_PLAYER_SCORE1 = "playerScore1";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE1)
  private Integer playerScore1;

  public static final String SERIALIZED_NAME_PLAYER_SCORE10 = "playerScore10";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE10)
  private Integer playerScore10;

  public static final String SERIALIZED_NAME_PLAYER_SCORE11 = "playerScore11";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE11)
  private Integer playerScore11;

  public static final String SERIALIZED_NAME_PLAYER_SCORE2 = "playerScore2";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE2)
  private Integer playerScore2;

  public static final String SERIALIZED_NAME_PLAYER_SCORE3 = "playerScore3";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE3)
  private Integer playerScore3;

  public static final String SERIALIZED_NAME_PLAYER_SCORE4 = "playerScore4";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE4)
  private Integer playerScore4;

  public static final String SERIALIZED_NAME_PLAYER_SCORE5 = "playerScore5";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE5)
  private Integer playerScore5;

  public static final String SERIALIZED_NAME_PLAYER_SCORE6 = "playerScore6";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE6)
  private Integer playerScore6;

  public static final String SERIALIZED_NAME_PLAYER_SCORE7 = "playerScore7";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE7)
  private Integer playerScore7;

  public static final String SERIALIZED_NAME_PLAYER_SCORE8 = "playerScore8";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE8)
  private Integer playerScore8;

  public static final String SERIALIZED_NAME_PLAYER_SCORE9 = "playerScore9";
  @SerializedName(SERIALIZED_NAME_PLAYER_SCORE9)
  private Integer playerScore9;

  public MatchV5ParticipantMissions() {
  }

  public MatchV5ParticipantMissions playerScore0(Integer playerScore0) {
    this.playerScore0 = playerScore0;
    return this;
  }

   /**
   * Get playerScore0
   * @return playerScore0
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore0() {
    return playerScore0;
  }

  public void setPlayerScore0(Integer playerScore0) {
    this.playerScore0 = playerScore0;
  }


  public MatchV5ParticipantMissions playerScore1(Integer playerScore1) {
    this.playerScore1 = playerScore1;
    return this;
  }

   /**
   * Get playerScore1
   * @return playerScore1
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore1() {
    return playerScore1;
  }

  public void setPlayerScore1(Integer playerScore1) {
    this.playerScore1 = playerScore1;
  }


  public MatchV5ParticipantMissions playerScore10(Integer playerScore10) {
    this.playerScore10 = playerScore10;
    return this;
  }

   /**
   * Get playerScore10
   * @return playerScore10
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore10() {
    return playerScore10;
  }

  public void setPlayerScore10(Integer playerScore10) {
    this.playerScore10 = playerScore10;
  }


  public MatchV5ParticipantMissions playerScore11(Integer playerScore11) {
    this.playerScore11 = playerScore11;
    return this;
  }

   /**
   * Get playerScore11
   * @return playerScore11
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore11() {
    return playerScore11;
  }

  public void setPlayerScore11(Integer playerScore11) {
    this.playerScore11 = playerScore11;
  }


  public MatchV5ParticipantMissions playerScore2(Integer playerScore2) {
    this.playerScore2 = playerScore2;
    return this;
  }

   /**
   * Get playerScore2
   * @return playerScore2
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore2() {
    return playerScore2;
  }

  public void setPlayerScore2(Integer playerScore2) {
    this.playerScore2 = playerScore2;
  }


  public MatchV5ParticipantMissions playerScore3(Integer playerScore3) {
    this.playerScore3 = playerScore3;
    return this;
  }

   /**
   * Get playerScore3
   * @return playerScore3
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore3() {
    return playerScore3;
  }

  public void setPlayerScore3(Integer playerScore3) {
    this.playerScore3 = playerScore3;
  }


  public MatchV5ParticipantMissions playerScore4(Integer playerScore4) {
    this.playerScore4 = playerScore4;
    return this;
  }

   /**
   * Get playerScore4
   * @return playerScore4
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore4() {
    return playerScore4;
  }

  public void setPlayerScore4(Integer playerScore4) {
    this.playerScore4 = playerScore4;
  }


  public MatchV5ParticipantMissions playerScore5(Integer playerScore5) {
    this.playerScore5 = playerScore5;
    return this;
  }

   /**
   * Get playerScore5
   * @return playerScore5
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore5() {
    return playerScore5;
  }

  public void setPlayerScore5(Integer playerScore5) {
    this.playerScore5 = playerScore5;
  }


  public MatchV5ParticipantMissions playerScore6(Integer playerScore6) {
    this.playerScore6 = playerScore6;
    return this;
  }

   /**
   * Get playerScore6
   * @return playerScore6
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore6() {
    return playerScore6;
  }

  public void setPlayerScore6(Integer playerScore6) {
    this.playerScore6 = playerScore6;
  }


  public MatchV5ParticipantMissions playerScore7(Integer playerScore7) {
    this.playerScore7 = playerScore7;
    return this;
  }

   /**
   * Get playerScore7
   * @return playerScore7
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore7() {
    return playerScore7;
  }

  public void setPlayerScore7(Integer playerScore7) {
    this.playerScore7 = playerScore7;
  }


  public MatchV5ParticipantMissions playerScore8(Integer playerScore8) {
    this.playerScore8 = playerScore8;
    return this;
  }

   /**
   * Get playerScore8
   * @return playerScore8
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore8() {
    return playerScore8;
  }

  public void setPlayerScore8(Integer playerScore8) {
    this.playerScore8 = playerScore8;
  }


  public MatchV5ParticipantMissions playerScore9(Integer playerScore9) {
    this.playerScore9 = playerScore9;
    return this;
  }

   /**
   * Get playerScore9
   * @return playerScore9
  **/
  @javax.annotation.Nonnull
  public Integer getPlayerScore9() {
    return playerScore9;
  }

  public void setPlayerScore9(Integer playerScore9) {
    this.playerScore9 = playerScore9;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchV5ParticipantMissions matchV5ParticipantMissions = (MatchV5ParticipantMissions) o;
    return Objects.equals(this.playerScore0, matchV5ParticipantMissions.playerScore0) &&
        Objects.equals(this.playerScore1, matchV5ParticipantMissions.playerScore1) &&
        Objects.equals(this.playerScore10, matchV5ParticipantMissions.playerScore10) &&
        Objects.equals(this.playerScore11, matchV5ParticipantMissions.playerScore11) &&
        Objects.equals(this.playerScore2, matchV5ParticipantMissions.playerScore2) &&
        Objects.equals(this.playerScore3, matchV5ParticipantMissions.playerScore3) &&
        Objects.equals(this.playerScore4, matchV5ParticipantMissions.playerScore4) &&
        Objects.equals(this.playerScore5, matchV5ParticipantMissions.playerScore5) &&
        Objects.equals(this.playerScore6, matchV5ParticipantMissions.playerScore6) &&
        Objects.equals(this.playerScore7, matchV5ParticipantMissions.playerScore7) &&
        Objects.equals(this.playerScore8, matchV5ParticipantMissions.playerScore8) &&
        Objects.equals(this.playerScore9, matchV5ParticipantMissions.playerScore9);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerScore0, playerScore1, playerScore10, playerScore11, playerScore2, playerScore3, playerScore4, playerScore5, playerScore6, playerScore7, playerScore8, playerScore9);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchV5ParticipantMissions {\n");
    sb.append("    playerScore0: ").append(toIndentedString(playerScore0)).append("\n");
    sb.append("    playerScore1: ").append(toIndentedString(playerScore1)).append("\n");
    sb.append("    playerScore10: ").append(toIndentedString(playerScore10)).append("\n");
    sb.append("    playerScore11: ").append(toIndentedString(playerScore11)).append("\n");
    sb.append("    playerScore2: ").append(toIndentedString(playerScore2)).append("\n");
    sb.append("    playerScore3: ").append(toIndentedString(playerScore3)).append("\n");
    sb.append("    playerScore4: ").append(toIndentedString(playerScore4)).append("\n");
    sb.append("    playerScore5: ").append(toIndentedString(playerScore5)).append("\n");
    sb.append("    playerScore6: ").append(toIndentedString(playerScore6)).append("\n");
    sb.append("    playerScore7: ").append(toIndentedString(playerScore7)).append("\n");
    sb.append("    playerScore8: ").append(toIndentedString(playerScore8)).append("\n");
    sb.append("    playerScore9: ").append(toIndentedString(playerScore9)).append("\n");
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
    openapiFields.add("playerScore0");
    openapiFields.add("playerScore1");
    openapiFields.add("playerScore10");
    openapiFields.add("playerScore11");
    openapiFields.add("playerScore2");
    openapiFields.add("playerScore3");
    openapiFields.add("playerScore4");
    openapiFields.add("playerScore5");
    openapiFields.add("playerScore6");
    openapiFields.add("playerScore7");
    openapiFields.add("playerScore8");
    openapiFields.add("playerScore9");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("playerScore0");
    openapiRequiredFields.add("playerScore1");
    openapiRequiredFields.add("playerScore10");
    openapiRequiredFields.add("playerScore11");
    openapiRequiredFields.add("playerScore2");
    openapiRequiredFields.add("playerScore3");
    openapiRequiredFields.add("playerScore4");
    openapiRequiredFields.add("playerScore5");
    openapiRequiredFields.add("playerScore6");
    openapiRequiredFields.add("playerScore7");
    openapiRequiredFields.add("playerScore8");
    openapiRequiredFields.add("playerScore9");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MatchV5ParticipantMissions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MatchV5ParticipantMissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchV5ParticipantMissions is not found in the empty JSON string", MatchV5ParticipantMissions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MatchV5ParticipantMissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchV5ParticipantMissions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MatchV5ParticipantMissions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchV5ParticipantMissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchV5ParticipantMissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchV5ParticipantMissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchV5ParticipantMissions.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchV5ParticipantMissions>() {
           @Override
           public void write(JsonWriter out, MatchV5ParticipantMissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchV5ParticipantMissions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MatchV5ParticipantMissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MatchV5ParticipantMissions
  * @throws IOException if the JSON string is invalid with respect to MatchV5ParticipantMissions
  */
  public static MatchV5ParticipantMissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchV5ParticipantMissions.class);
  }

 /**
  * Convert an instance of MatchV5ParticipantMissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

