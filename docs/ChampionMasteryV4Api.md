# ChampionMasteryV4Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**championMasteryV4GetAllChampionMasteriesByPUUID**](ChampionMasteryV4Api.md#championMasteryV4GetAllChampionMasteriesByPUUID) | **GET** /lol/champion-mastery/v4/champion-masteries/by-puuid/{encryptedPUUID} | Get all champion mastery entries sorted by number of champion points descending. |
| [**championMasteryV4GetChampionMasteryByPUUID**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMasteryByPUUID) | **GET** /lol/champion-mastery/v4/champion-masteries/by-puuid/{encryptedPUUID}/by-champion/{championId} | Get a champion mastery by puuid and champion ID. |
| [**championMasteryV4GetChampionMasteryScoreByPUUID**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMasteryScoreByPUUID) | **GET** /lol/champion-mastery/v4/scores/by-puuid/{encryptedPUUID} | Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels. |
| [**championMasteryV4GetTopChampionMasteriesByPUUID**](ChampionMasteryV4Api.md#championMasteryV4GetTopChampionMasteriesByPUUID) | **GET** /lol/champion-mastery/v4/champion-masteries/by-puuid/{encryptedPUUID}/top | Get specified number of top champion mastery entries sorted by number of champion points descending. |


<a id="championMasteryV4GetAllChampionMasteriesByPUUID"></a>
# **championMasteryV4GetAllChampionMasteriesByPUUID**
> List&lt;ChampionMasteryV4ChampionMasteryDto&gt; championMasteryV4GetAllChampionMasteriesByPUUID(encryptedPUUID)

Get all champion mastery entries sorted by number of champion points descending.

Get all champion mastery entries sorted by number of champion points descending.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.ChampionMasteryV4Api;

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

    ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api(defaultClient);
    String encryptedPUUID = "encryptedPUUID_example"; // String | 
    try {
      List<ChampionMasteryV4ChampionMasteryDto> result = apiInstance.championMasteryV4GetAllChampionMasteriesByPUUID(encryptedPUUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetAllChampionMasteriesByPUUID");
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
| **encryptedPUUID** | **String**|  | |

### Return type

[**List&lt;ChampionMasteryV4ChampionMasteryDto&gt;**](ChampionMasteryV4ChampionMasteryDto.md)

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

<a id="championMasteryV4GetChampionMasteryByPUUID"></a>
# **championMasteryV4GetChampionMasteryByPUUID**
> ChampionMasteryV4ChampionMasteryDto championMasteryV4GetChampionMasteryByPUUID(encryptedPUUID, championId)

Get a champion mastery by puuid and champion ID.

Get a champion mastery by puuid and champion ID.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.ChampionMasteryV4Api;

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

    ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api(defaultClient);
    String encryptedPUUID = "encryptedPUUID_example"; // String | 
    String championId = "championId_example"; // String | Champion ID to retrieve Champion Mastery.
    try {
      ChampionMasteryV4ChampionMasteryDto result = apiInstance.championMasteryV4GetChampionMasteryByPUUID(encryptedPUUID, championId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetChampionMasteryByPUUID");
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
| **encryptedPUUID** | **String**|  | |
| **championId** | **String**| Champion ID to retrieve Champion Mastery. | |

### Return type

[**ChampionMasteryV4ChampionMasteryDto**](ChampionMasteryV4ChampionMasteryDto.md)

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

<a id="championMasteryV4GetChampionMasteryScoreByPUUID"></a>
# **championMasteryV4GetChampionMasteryScoreByPUUID**
> Integer championMasteryV4GetChampionMasteryScoreByPUUID(encryptedPUUID)

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.ChampionMasteryV4Api;

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

    ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api(defaultClient);
    String encryptedPUUID = "encryptedPUUID_example"; // String | 
    try {
      Integer result = apiInstance.championMasteryV4GetChampionMasteryScoreByPUUID(encryptedPUUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetChampionMasteryScoreByPUUID");
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
| **encryptedPUUID** | **String**|  | |

### Return type

**Integer**

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

<a id="championMasteryV4GetTopChampionMasteriesByPUUID"></a>
# **championMasteryV4GetTopChampionMasteriesByPUUID**
> List&lt;ChampionMasteryV4ChampionMasteryDto&gt; championMasteryV4GetTopChampionMasteriesByPUUID(encryptedPUUID, count)

Get specified number of top champion mastery entries sorted by number of champion points descending.

Get specified number of top champion mastery entries sorted by number of champion points descending.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.ChampionMasteryV4Api;

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

    ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api(defaultClient);
    String encryptedPUUID = "encryptedPUUID_example"; // String | 
    Integer count = 56; // Integer | Number of entries to retrieve, defaults to 3.
    try {
      List<ChampionMasteryV4ChampionMasteryDto> result = apiInstance.championMasteryV4GetTopChampionMasteriesByPUUID(encryptedPUUID, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetTopChampionMasteriesByPUUID");
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
| **encryptedPUUID** | **String**|  | |
| **count** | **Integer**| Number of entries to retrieve, defaults to 3. | [optional] |

### Return type

[**List&lt;ChampionMasteryV4ChampionMasteryDto&gt;**](ChampionMasteryV4ChampionMasteryDto.md)

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

