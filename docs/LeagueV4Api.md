# LeagueV4Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**leagueV4GetChallengerLeague**](LeagueV4Api.md#leagueV4GetChallengerLeague) | **GET** /lol/league/v4/challengerleagues/by-queue/{queue} | Get the challenger league for given queue. |
| [**leagueV4GetGrandmasterLeague**](LeagueV4Api.md#leagueV4GetGrandmasterLeague) | **GET** /lol/league/v4/grandmasterleagues/by-queue/{queue} | Get the grandmaster league of a specific queue. |
| [**leagueV4GetLeagueById**](LeagueV4Api.md#leagueV4GetLeagueById) | **GET** /lol/league/v4/leagues/{leagueId} | Get league with given ID, including inactive entries. |
| [**leagueV4GetLeagueEntries**](LeagueV4Api.md#leagueV4GetLeagueEntries) | **GET** /lol/league/v4/entries/{queue}/{tier}/{division} | Get all the league entries. |
| [**leagueV4GetLeagueEntriesForSummoner**](LeagueV4Api.md#leagueV4GetLeagueEntriesForSummoner) | **GET** /lol/league/v4/entries/by-summoner/{encryptedSummonerId} | Get league entries in all queues for a given summoner ID. |
| [**leagueV4GetMasterLeague**](LeagueV4Api.md#leagueV4GetMasterLeague) | **GET** /lol/league/v4/masterleagues/by-queue/{queue} | Get the master league for given queue. |


<a id="leagueV4GetChallengerLeague"></a>
# **leagueV4GetChallengerLeague**
> LeagueV4LeagueListDTO leagueV4GetChallengerLeague(queue)

Get the challenger league for given queue.

Get the challenger league for given queue.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LeagueV4Api;

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

    LeagueV4Api apiInstance = new LeagueV4Api(defaultClient);
    String queue = "RANKED_SOLO_5x5"; // String | 
    try {
      LeagueV4LeagueListDTO result = apiInstance.leagueV4GetChallengerLeague(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueV4Api#leagueV4GetChallengerLeague");
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
| **queue** | **String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT] |

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

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

<a id="leagueV4GetGrandmasterLeague"></a>
# **leagueV4GetGrandmasterLeague**
> LeagueV4LeagueListDTO leagueV4GetGrandmasterLeague(queue)

Get the grandmaster league of a specific queue.

Get the grandmaster league of a specific queue.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LeagueV4Api;

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

    LeagueV4Api apiInstance = new LeagueV4Api(defaultClient);
    String queue = "RANKED_SOLO_5x5"; // String | 
    try {
      LeagueV4LeagueListDTO result = apiInstance.leagueV4GetGrandmasterLeague(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueV4Api#leagueV4GetGrandmasterLeague");
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
| **queue** | **String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT] |

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

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

<a id="leagueV4GetLeagueById"></a>
# **leagueV4GetLeagueById**
> LeagueV4LeagueListDTO leagueV4GetLeagueById(leagueId)

Get league with given ID, including inactive entries.

Get league with given ID, including inactive entries.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LeagueV4Api;

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

    LeagueV4Api apiInstance = new LeagueV4Api(defaultClient);
    String leagueId = "leagueId_example"; // String | The UUID of the league.
    try {
      LeagueV4LeagueListDTO result = apiInstance.leagueV4GetLeagueById(leagueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueV4Api#leagueV4GetLeagueById");
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
| **leagueId** | **String**| The UUID of the league. | |

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

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

<a id="leagueV4GetLeagueEntries"></a>
# **leagueV4GetLeagueEntries**
> List&lt;LeagueV4LeagueEntryDTO&gt; leagueV4GetLeagueEntries(division, tier, queue, page)

Get all the league entries.

Get all the league entries.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LeagueV4Api;

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

    LeagueV4Api apiInstance = new LeagueV4Api(defaultClient);
    String division = "I"; // String | 
    String tier = "DIAMOND"; // String | 
    String queue = "RANKED_SOLO_5x5"; // String | Note that the queue value must be a valid ranked queue.
    Integer page = 56; // Integer | Defaults to 1. Starts with page 1.
    try {
      List<LeagueV4LeagueEntryDTO> result = apiInstance.leagueV4GetLeagueEntries(division, tier, queue, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueV4Api#leagueV4GetLeagueEntries");
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
| **division** | **String**|  | [enum: I, II, III, IV] |
| **tier** | **String**|  | [enum: DIAMOND, EMERALD, PLATINUM, GOLD, SILVER, BRONZE, IRON] |
| **queue** | **String**| Note that the queue value must be a valid ranked queue. | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT] |
| **page** | **Integer**| Defaults to 1. Starts with page 1. | [optional] |

### Return type

[**List&lt;LeagueV4LeagueEntryDTO&gt;**](LeagueV4LeagueEntryDTO.md)

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

<a id="leagueV4GetLeagueEntriesForSummoner"></a>
# **leagueV4GetLeagueEntriesForSummoner**
> List&lt;LeagueV4LeagueEntryDTO&gt; leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId)

Get league entries in all queues for a given summoner ID.

Get league entries in all queues for a given summoner ID.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LeagueV4Api;

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

    LeagueV4Api apiInstance = new LeagueV4Api(defaultClient);
    String encryptedSummonerId = "encryptedSummonerId_example"; // String | 
    try {
      List<LeagueV4LeagueEntryDTO> result = apiInstance.leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueV4Api#leagueV4GetLeagueEntriesForSummoner");
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
| **encryptedSummonerId** | **String**|  | |

### Return type

[**List&lt;LeagueV4LeagueEntryDTO&gt;**](LeagueV4LeagueEntryDTO.md)

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

<a id="leagueV4GetMasterLeague"></a>
# **leagueV4GetMasterLeague**
> LeagueV4LeagueListDTO leagueV4GetMasterLeague(queue)

Get the master league for given queue.

Get the master league for given queue.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.LeagueV4Api;

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

    LeagueV4Api apiInstance = new LeagueV4Api(defaultClient);
    String queue = "RANKED_SOLO_5x5"; // String | 
    try {
      LeagueV4LeagueListDTO result = apiInstance.leagueV4GetMasterLeague(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueV4Api#leagueV4GetMasterLeague");
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
| **queue** | **String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT] |

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

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

