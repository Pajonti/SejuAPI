# LolChallengesV1Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**lolChallengesV1GetAllChallengeConfigs**](LolChallengesV1Api.md#lolChallengesV1GetAllChallengeConfigs) | **GET** /lol/challenges/v1/challenges/config | List of all basic challenge configuration information (includes all translations for names and descriptions) |
| [**lolChallengesV1GetAllChallengePercentiles**](LolChallengesV1Api.md#lolChallengesV1GetAllChallengePercentiles) | **GET** /lol/challenges/v1/challenges/percentiles | Map of level to percentile of players who have achieved it - keys: ChallengeId -&gt; Season -&gt; Level -&gt; percentile of players who achieved it |
| [**lolChallengesV1GetChallengeConfigs**](LolChallengesV1Api.md#lolChallengesV1GetChallengeConfigs) | **GET** /lol/challenges/v1/challenges/{challengeId}/config | Get challenge configuration (REST) |
| [**lolChallengesV1GetChallengeLeaderboards**](LolChallengesV1Api.md#lolChallengesV1GetChallengeLeaderboards) | **GET** /lol/challenges/v1/challenges/{challengeId}/leaderboards/by-level/{level} | Return top players for each level. Level must be MASTER, GRANDMASTER or CHALLENGER. |
| [**lolChallengesV1GetChallengePercentiles**](LolChallengesV1Api.md#lolChallengesV1GetChallengePercentiles) | **GET** /lol/challenges/v1/challenges/{challengeId}/percentiles | Map of level to percentile of players who have achieved it |
| [**lolChallengesV1GetPlayerData**](LolChallengesV1Api.md#lolChallengesV1GetPlayerData) | **GET** /lol/challenges/v1/player-data/{puuid} | Returns player information with list of all progressed challenges (REST) |


<a id="lolChallengesV1GetAllChallengeConfigs"></a>
# **lolChallengesV1GetAllChallengeConfigs**
> List&lt;LolChallengesV1ChallengeConfigInfoDto&gt; lolChallengesV1GetAllChallengeConfigs()

List of all basic challenge configuration information (includes all translations for names and descriptions)

List of all basic challenge configuration information (includes all translations for names and descriptions)

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LolChallengesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://americas.api.riotgames.com");
    
    // Configure API key authorization: X-Riot-Token
    ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
    X-Riot-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Riot-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    LolChallengesV1Api apiInstance = new LolChallengesV1Api(defaultClient);
    try {
      List<LolChallengesV1ChallengeConfigInfoDto> result = apiInstance.lolChallengesV1GetAllChallengeConfigs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LolChallengesV1Api#lolChallengesV1GetAllChallengeConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LolChallengesV1ChallengeConfigInfoDto&gt;**](LolChallengesV1ChallengeConfigInfoDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Data not found |  -  |
| **405** | Method not allowed |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Rate limit exceeded |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="lolChallengesV1GetAllChallengePercentiles"></a>
# **lolChallengesV1GetAllChallengePercentiles**
> Map&lt;String, Map&lt;String, Double&gt;&gt; lolChallengesV1GetAllChallengePercentiles()

Map of level to percentile of players who have achieved it - keys: ChallengeId -&gt; Season -&gt; Level -&gt; percentile of players who achieved it

Map of level to percentile of players who have achieved it - keys: ChallengeId -&gt; Season -&gt; Level -&gt; percentile of players who achieved it

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LolChallengesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://americas.api.riotgames.com");
    
    // Configure API key authorization: X-Riot-Token
    ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
    X-Riot-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Riot-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    LolChallengesV1Api apiInstance = new LolChallengesV1Api(defaultClient);
    try {
      Map<String, Map<String, Double>> result = apiInstance.lolChallengesV1GetAllChallengePercentiles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LolChallengesV1Api#lolChallengesV1GetAllChallengePercentiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Map&lt;String, Double&gt;&gt;**](Map.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Data not found |  -  |
| **405** | Method not allowed |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Rate limit exceeded |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="lolChallengesV1GetChallengeConfigs"></a>
# **lolChallengesV1GetChallengeConfigs**
> LolChallengesV1ChallengeConfigInfoDto lolChallengesV1GetChallengeConfigs(challengeId)

Get challenge configuration (REST)

Get challenge configuration (REST)

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LolChallengesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://americas.api.riotgames.com");
    
    // Configure API key authorization: X-Riot-Token
    ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
    X-Riot-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Riot-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    LolChallengesV1Api apiInstance = new LolChallengesV1Api(defaultClient);
    Long challengeId = 56L; // Long | 
    try {
      LolChallengesV1ChallengeConfigInfoDto result = apiInstance.lolChallengesV1GetChallengeConfigs(challengeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LolChallengesV1Api#lolChallengesV1GetChallengeConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **challengeId** | **Long**|  | |

### Return type

[**LolChallengesV1ChallengeConfigInfoDto**](LolChallengesV1ChallengeConfigInfoDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Data not found |  -  |
| **405** | Method not allowed |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Rate limit exceeded |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="lolChallengesV1GetChallengeLeaderboards"></a>
# **lolChallengesV1GetChallengeLeaderboards**
> List&lt;LolChallengesV1ApexPlayerInfoDto&gt; lolChallengesV1GetChallengeLeaderboards(level, challengeId, limit)

Return top players for each level. Level must be MASTER, GRANDMASTER or CHALLENGER.

Return top players for each level. Level must be MASTER, GRANDMASTER or CHALLENGER.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LolChallengesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://americas.api.riotgames.com");
    
    // Configure API key authorization: X-Riot-Token
    ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
    X-Riot-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Riot-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    LolChallengesV1Api apiInstance = new LolChallengesV1Api(defaultClient);
    String level = "NONE"; // String | 
    Long challengeId = 56L; // Long | 
    Integer limit = 56; // Integer | 
    try {
      List<LolChallengesV1ApexPlayerInfoDto> result = apiInstance.lolChallengesV1GetChallengeLeaderboards(level, challengeId, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LolChallengesV1Api#lolChallengesV1GetChallengeLeaderboards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **level** | **String**|  | [enum: NONE, IRON, BRONZE, SILVER, GOLD, PLATINUM, DIAMOND, MASTER, GRANDMASTER, CHALLENGER, HIGHEST_NOT_LEADERBOARD_ONLY, HIGHEST, LOWEST] |
| **challengeId** | **Long**|  | |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;LolChallengesV1ApexPlayerInfoDto&gt;**](LolChallengesV1ApexPlayerInfoDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Data not found |  -  |
| **405** | Method not allowed |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Rate limit exceeded |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="lolChallengesV1GetChallengePercentiles"></a>
# **lolChallengesV1GetChallengePercentiles**
> Map&lt;String, Double&gt; lolChallengesV1GetChallengePercentiles(challengeId)

Map of level to percentile of players who have achieved it

Map of level to percentile of players who have achieved it

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LolChallengesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://americas.api.riotgames.com");
    
    // Configure API key authorization: X-Riot-Token
    ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
    X-Riot-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Riot-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    LolChallengesV1Api apiInstance = new LolChallengesV1Api(defaultClient);
    Long challengeId = 56L; // Long | 
    try {
      Map<String, Double> result = apiInstance.lolChallengesV1GetChallengePercentiles(challengeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LolChallengesV1Api#lolChallengesV1GetChallengePercentiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **challengeId** | **Long**|  | |

### Return type

**Map&lt;String, Double&gt;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Data not found |  -  |
| **405** | Method not allowed |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Rate limit exceeded |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="lolChallengesV1GetPlayerData"></a>
# **lolChallengesV1GetPlayerData**
> LolChallengesV1PlayerInfoDto lolChallengesV1GetPlayerData(puuid)

Returns player information with list of all progressed challenges (REST)

Returns player information with list of all progressed challenges (REST)

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LolChallengesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://americas.api.riotgames.com");
    
    // Configure API key authorization: X-Riot-Token
    ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
    X-Riot-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Riot-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    LolChallengesV1Api apiInstance = new LolChallengesV1Api(defaultClient);
    String puuid = "puuid_example"; // String | 
    try {
      LolChallengesV1PlayerInfoDto result = apiInstance.lolChallengesV1GetPlayerData(puuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LolChallengesV1Api#lolChallengesV1GetPlayerData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **puuid** | **String**|  | |

### Return type

[**LolChallengesV1PlayerInfoDto**](LolChallengesV1PlayerInfoDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Data not found |  -  |
| **405** | Method not allowed |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Rate limit exceeded |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

