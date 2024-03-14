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
 * LolChallengesV1PlayerClientPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class LolChallengesV1PlayerClientPreferences {
  public static final String SERIALIZED_NAME_BANNER_ACCENT = "bannerAccent";
  @SerializedName(SERIALIZED_NAME_BANNER_ACCENT)
  private String bannerAccent;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CHALLENGE_IDS = "challengeIds";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_IDS)
  private List<Long> challengeIds;

  public static final String SERIALIZED_NAME_CREST_BORDER = "crestBorder";
  @SerializedName(SERIALIZED_NAME_CREST_BORDER)
  private String crestBorder;

  public static final String SERIALIZED_NAME_PRESTIGE_CREST_BORDER_LEVEL = "prestigeCrestBorderLevel";
  @SerializedName(SERIALIZED_NAME_PRESTIGE_CREST_BORDER_LEVEL)
  private Integer prestigeCrestBorderLevel;

  public LolChallengesV1PlayerClientPreferences() {
  }

  public LolChallengesV1PlayerClientPreferences bannerAccent(String bannerAccent) {
    this.bannerAccent = bannerAccent;
    return this;
  }

   /**
   * Get bannerAccent
   * @return bannerAccent
  **/
  @javax.annotation.Nullable
  public String getBannerAccent() {
    return bannerAccent;
  }

  public void setBannerAccent(String bannerAccent) {
    this.bannerAccent = bannerAccent;
  }


  public LolChallengesV1PlayerClientPreferences title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public LolChallengesV1PlayerClientPreferences challengeIds(List<Long> challengeIds) {
    this.challengeIds = challengeIds;
    return this;
  }

  public LolChallengesV1PlayerClientPreferences addChallengeIdsItem(Long challengeIdsItem) {
    if (this.challengeIds == null) {
      this.challengeIds = new ArrayList<>();
    }
    this.challengeIds.add(challengeIdsItem);
    return this;
  }

   /**
   * Get challengeIds
   * @return challengeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getChallengeIds() {
    return challengeIds;
  }

  public void setChallengeIds(List<Long> challengeIds) {
    this.challengeIds = challengeIds;
  }


  public LolChallengesV1PlayerClientPreferences crestBorder(String crestBorder) {
    this.crestBorder = crestBorder;
    return this;
  }

   /**
   * Get crestBorder
   * @return crestBorder
  **/
  @javax.annotation.Nullable
  public String getCrestBorder() {
    return crestBorder;
  }

  public void setCrestBorder(String crestBorder) {
    this.crestBorder = crestBorder;
  }


  public LolChallengesV1PlayerClientPreferences prestigeCrestBorderLevel(Integer prestigeCrestBorderLevel) {
    this.prestigeCrestBorderLevel = prestigeCrestBorderLevel;
    return this;
  }

   /**
   * Get prestigeCrestBorderLevel
   * @return prestigeCrestBorderLevel
  **/
  @javax.annotation.Nullable
  public Integer getPrestigeCrestBorderLevel() {
    return prestigeCrestBorderLevel;
  }

  public void setPrestigeCrestBorderLevel(Integer prestigeCrestBorderLevel) {
    this.prestigeCrestBorderLevel = prestigeCrestBorderLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LolChallengesV1PlayerClientPreferences lolChallengesV1PlayerClientPreferences = (LolChallengesV1PlayerClientPreferences) o;
    return Objects.equals(this.bannerAccent, lolChallengesV1PlayerClientPreferences.bannerAccent) &&
        Objects.equals(this.title, lolChallengesV1PlayerClientPreferences.title) &&
        Objects.equals(this.challengeIds, lolChallengesV1PlayerClientPreferences.challengeIds) &&
        Objects.equals(this.crestBorder, lolChallengesV1PlayerClientPreferences.crestBorder) &&
        Objects.equals(this.prestigeCrestBorderLevel, lolChallengesV1PlayerClientPreferences.prestigeCrestBorderLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannerAccent, title, challengeIds, crestBorder, prestigeCrestBorderLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LolChallengesV1PlayerClientPreferences {\n");
    sb.append("    bannerAccent: ").append(toIndentedString(bannerAccent)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    challengeIds: ").append(toIndentedString(challengeIds)).append("\n");
    sb.append("    crestBorder: ").append(toIndentedString(crestBorder)).append("\n");
    sb.append("    prestigeCrestBorderLevel: ").append(toIndentedString(prestigeCrestBorderLevel)).append("\n");
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
    openapiFields.add("bannerAccent");
    openapiFields.add("title");
    openapiFields.add("challengeIds");
    openapiFields.add("crestBorder");
    openapiFields.add("prestigeCrestBorderLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LolChallengesV1PlayerClientPreferences
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LolChallengesV1PlayerClientPreferences.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LolChallengesV1PlayerClientPreferences is not found in the empty JSON string", LolChallengesV1PlayerClientPreferences.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LolChallengesV1PlayerClientPreferences.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LolChallengesV1PlayerClientPreferences` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bannerAccent") != null && !jsonObj.get("bannerAccent").isJsonNull()) && !jsonObj.get("bannerAccent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerAccent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerAccent").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("challengeIds") != null && !jsonObj.get("challengeIds").isJsonNull() && !jsonObj.get("challengeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `challengeIds` to be an array in the JSON string but got `%s`", jsonObj.get("challengeIds").toString()));
      }
      if ((jsonObj.get("crestBorder") != null && !jsonObj.get("crestBorder").isJsonNull()) && !jsonObj.get("crestBorder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crestBorder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crestBorder").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LolChallengesV1PlayerClientPreferences.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LolChallengesV1PlayerClientPreferences' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LolChallengesV1PlayerClientPreferences> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LolChallengesV1PlayerClientPreferences.class));

       return (TypeAdapter<T>) new TypeAdapter<LolChallengesV1PlayerClientPreferences>() {
           @Override
           public void write(JsonWriter out, LolChallengesV1PlayerClientPreferences value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LolChallengesV1PlayerClientPreferences read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LolChallengesV1PlayerClientPreferences given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LolChallengesV1PlayerClientPreferences
  * @throws IOException if the JSON string is invalid with respect to LolChallengesV1PlayerClientPreferences
  */
  public static LolChallengesV1PlayerClientPreferences fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LolChallengesV1PlayerClientPreferences.class);
  }

 /**
  * Convert an instance of LolChallengesV1PlayerClientPreferences to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

