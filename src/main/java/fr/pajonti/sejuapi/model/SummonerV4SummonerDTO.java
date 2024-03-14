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
 * represents a summoner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class SummonerV4SummonerDTO {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_PROFILE_ICON_ID = "profileIconId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ICON_ID)
  private Integer profileIconId;

  public static final String SERIALIZED_NAME_REVISION_DATE = "revisionDate";
  @SerializedName(SERIALIZED_NAME_REVISION_DATE)
  private Long revisionDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUUID = "puuid";
  @SerializedName(SERIALIZED_NAME_PUUID)
  private String puuid;

  public static final String SERIALIZED_NAME_SUMMONER_LEVEL = "summonerLevel";
  @SerializedName(SERIALIZED_NAME_SUMMONER_LEVEL)
  private Long summonerLevel;

  public SummonerV4SummonerDTO() {
  }

  public SummonerV4SummonerDTO accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Encrypted account ID. Max length 56 characters.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SummonerV4SummonerDTO profileIconId(Integer profileIconId) {
    this.profileIconId = profileIconId;
    return this;
  }

   /**
   * ID of the summoner icon associated with the summoner.
   * @return profileIconId
  **/
  @javax.annotation.Nonnull
  public Integer getProfileIconId() {
    return profileIconId;
  }

  public void setProfileIconId(Integer profileIconId) {
    this.profileIconId = profileIconId;
  }


  public SummonerV4SummonerDTO revisionDate(Long revisionDate) {
    this.revisionDate = revisionDate;
    return this;
  }

   /**
   * Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
   * @return revisionDate
  **/
  @javax.annotation.Nonnull
  public Long getRevisionDate() {
    return revisionDate;
  }

  public void setRevisionDate(Long revisionDate) {
    this.revisionDate = revisionDate;
  }


  public SummonerV4SummonerDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Summoner name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SummonerV4SummonerDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Encrypted summoner ID. Max length 63 characters.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public SummonerV4SummonerDTO puuid(String puuid) {
    this.puuid = puuid;
    return this;
  }

   /**
   * Encrypted PUUID. Exact length of 78 characters.
   * @return puuid
  **/
  @javax.annotation.Nonnull
  public String getPuuid() {
    return puuid;
  }

  public void setPuuid(String puuid) {
    this.puuid = puuid;
  }


  public SummonerV4SummonerDTO summonerLevel(Long summonerLevel) {
    this.summonerLevel = summonerLevel;
    return this;
  }

   /**
   * Summoner level associated with the summoner.
   * @return summonerLevel
  **/
  @javax.annotation.Nonnull
  public Long getSummonerLevel() {
    return summonerLevel;
  }

  public void setSummonerLevel(Long summonerLevel) {
    this.summonerLevel = summonerLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummonerV4SummonerDTO summonerV4SummonerDTO = (SummonerV4SummonerDTO) o;
    return Objects.equals(this.accountId, summonerV4SummonerDTO.accountId) &&
        Objects.equals(this.profileIconId, summonerV4SummonerDTO.profileIconId) &&
        Objects.equals(this.revisionDate, summonerV4SummonerDTO.revisionDate) &&
        Objects.equals(this.name, summonerV4SummonerDTO.name) &&
        Objects.equals(this.id, summonerV4SummonerDTO.id) &&
        Objects.equals(this.puuid, summonerV4SummonerDTO.puuid) &&
        Objects.equals(this.summonerLevel, summonerV4SummonerDTO.summonerLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, profileIconId, revisionDate, name, id, puuid, summonerLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummonerV4SummonerDTO {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    profileIconId: ").append(toIndentedString(profileIconId)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    puuid: ").append(toIndentedString(puuid)).append("\n");
    sb.append("    summonerLevel: ").append(toIndentedString(summonerLevel)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("profileIconId");
    openapiFields.add("revisionDate");
    openapiFields.add("name");
    openapiFields.add("id");
    openapiFields.add("puuid");
    openapiFields.add("summonerLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("profileIconId");
    openapiRequiredFields.add("revisionDate");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("puuid");
    openapiRequiredFields.add("summonerLevel");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SummonerV4SummonerDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SummonerV4SummonerDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SummonerV4SummonerDTO is not found in the empty JSON string", SummonerV4SummonerDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SummonerV4SummonerDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SummonerV4SummonerDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SummonerV4SummonerDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("puuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `puuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("puuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SummonerV4SummonerDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SummonerV4SummonerDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SummonerV4SummonerDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SummonerV4SummonerDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SummonerV4SummonerDTO>() {
           @Override
           public void write(JsonWriter out, SummonerV4SummonerDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SummonerV4SummonerDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SummonerV4SummonerDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SummonerV4SummonerDTO
  * @throws IOException if the JSON string is invalid with respect to SummonerV4SummonerDTO
  */
  public static SummonerV4SummonerDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SummonerV4SummonerDTO.class);
  }

 /**
  * Convert an instance of SummonerV4SummonerDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

