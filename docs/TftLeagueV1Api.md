# TftLeagueV1Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tftLeagueV1GetChallengerLeague**](TftLeagueV1Api.md#tftLeagueV1GetChallengerLeague) | **GET** /tft/league/v1/challenger | Get the challenger league. |
| [**tftLeagueV1GetGrandmasterLeague**](TftLeagueV1Api.md#tftLeagueV1GetGrandmasterLeague) | **GET** /tft/league/v1/grandmaster | Get the grandmaster league. |
| [**tftLeagueV1GetLeagueById**](TftLeagueV1Api.md#tftLeagueV1GetLeagueById) | **GET** /tft/league/v1/leagues/{leagueId} | Get league with given ID, including inactive entries. |
| [**tftLeagueV1GetLeagueEntries**](TftLeagueV1Api.md#tftLeagueV1GetLeagueEntries) | **GET** /tft/league/v1/entries/{tier}/{division} | Get all the league entries. |
| [**tftLeagueV1GetLeagueEntriesForSummoner**](TftLeagueV1Api.md#tftLeagueV1GetLeagueEntriesForSummoner) | **GET** /tft/league/v1/entries/by-summoner/{summonerId} | Get league entries for a given summoner ID. |
| [**tftLeagueV1GetMasterLeague**](TftLeagueV1Api.md#tftLeagueV1GetMasterLeague) | **GET** /tft/league/v1/master | Get the master league. |
| [**tftLeagueV1GetTopRatedLadder**](TftLeagueV1Api.md#tftLeagueV1GetTopRatedLadder) | **GET** /tft/league/v1/rated-ladders/{queue}/top | Get the top rated ladder for given queue |


<a id="tftLeagueV1GetChallengerLeague"></a>
# **tftLeagueV1GetChallengerLeague**
> TftLeagueV1LeagueListDTO tftLeagueV1GetChallengerLeague(queue)

Get the challenger league.

Get the challenger league.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String queue = "RANKED_TFT"; // String | Defaults to RANKED_TFT.
    try {
      TftLeagueV1LeagueListDTO result = apiInstance.tftLeagueV1GetChallengerLeague(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetChallengerLeague");
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
| **queue** | **String**| Defaults to RANKED_TFT. | [optional] [enum: RANKED_TFT, RANKED_TFT_DOUBLE_UP] |

### Return type

[**TftLeagueV1LeagueListDTO**](TftLeagueV1LeagueListDTO.md)

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

<a id="tftLeagueV1GetGrandmasterLeague"></a>
# **tftLeagueV1GetGrandmasterLeague**
> TftLeagueV1LeagueListDTO tftLeagueV1GetGrandmasterLeague(queue)

Get the grandmaster league.

Get the grandmaster league.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String queue = "RANKED_TFT"; // String | Defaults to RANKED_TFT.
    try {
      TftLeagueV1LeagueListDTO result = apiInstance.tftLeagueV1GetGrandmasterLeague(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetGrandmasterLeague");
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
| **queue** | **String**| Defaults to RANKED_TFT. | [optional] [enum: RANKED_TFT, RANKED_TFT_DOUBLE_UP] |

### Return type

[**TftLeagueV1LeagueListDTO**](TftLeagueV1LeagueListDTO.md)

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

<a id="tftLeagueV1GetLeagueById"></a>
# **tftLeagueV1GetLeagueById**
> TftLeagueV1LeagueListDTO tftLeagueV1GetLeagueById(leagueId)

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
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String leagueId = "leagueId_example"; // String | The UUID of the league.
    try {
      TftLeagueV1LeagueListDTO result = apiInstance.tftLeagueV1GetLeagueById(leagueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetLeagueById");
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

[**TftLeagueV1LeagueListDTO**](TftLeagueV1LeagueListDTO.md)

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

<a id="tftLeagueV1GetLeagueEntries"></a>
# **tftLeagueV1GetLeagueEntries**
> List&lt;TftLeagueV1LeagueEntryDTO&gt; tftLeagueV1GetLeagueEntries(tier, division, queue, page)

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
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String tier = "DIAMOND"; // String | 
    String division = "I"; // String | 
    String queue = "RANKED_TFT"; // String | Defaults to RANKED_TFT.
    Integer page = 56; // Integer | Defaults to 1. Starts with page 1.
    try {
      List<TftLeagueV1LeagueEntryDTO> result = apiInstance.tftLeagueV1GetLeagueEntries(tier, division, queue, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetLeagueEntries");
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
| **tier** | **String**|  | [enum: DIAMOND, EMERALD, PLATINUM, GOLD, SILVER, BRONZE, IRON] |
| **division** | **String**|  | [enum: I, II, III, IV] |
| **queue** | **String**| Defaults to RANKED_TFT. | [optional] [enum: RANKED_TFT, RANKED_TFT_DOUBLE_UP] |
| **page** | **Integer**| Defaults to 1. Starts with page 1. | [optional] |

### Return type

[**List&lt;TftLeagueV1LeagueEntryDTO&gt;**](TftLeagueV1LeagueEntryDTO.md)

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

<a id="tftLeagueV1GetLeagueEntriesForSummoner"></a>
# **tftLeagueV1GetLeagueEntriesForSummoner**
> List&lt;TftLeagueV1LeagueEntryDTO&gt; tftLeagueV1GetLeagueEntriesForSummoner(summonerId)

Get league entries for a given summoner ID.

Get league entries for a given summoner ID.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String summonerId = "summonerId_example"; // String | 
    try {
      List<TftLeagueV1LeagueEntryDTO> result = apiInstance.tftLeagueV1GetLeagueEntriesForSummoner(summonerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetLeagueEntriesForSummoner");
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
| **summonerId** | **String**|  | |

### Return type

[**List&lt;TftLeagueV1LeagueEntryDTO&gt;**](TftLeagueV1LeagueEntryDTO.md)

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

<a id="tftLeagueV1GetMasterLeague"></a>
# **tftLeagueV1GetMasterLeague**
> TftLeagueV1LeagueListDTO tftLeagueV1GetMasterLeague(queue)

Get the master league.

Get the master league.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String queue = "RANKED_TFT"; // String | Defaults to RANKED_TFT.
    try {
      TftLeagueV1LeagueListDTO result = apiInstance.tftLeagueV1GetMasterLeague(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetMasterLeague");
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
| **queue** | **String**| Defaults to RANKED_TFT. | [optional] [enum: RANKED_TFT, RANKED_TFT_DOUBLE_UP] |

### Return type

[**TftLeagueV1LeagueListDTO**](TftLeagueV1LeagueListDTO.md)

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

<a id="tftLeagueV1GetTopRatedLadder"></a>
# **tftLeagueV1GetTopRatedLadder**
> List&lt;TftLeagueV1TopRatedLadderEntryDto&gt; tftLeagueV1GetTopRatedLadder(queue)

Get the top rated ladder for given queue

Get the top rated ladder for given queue

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftLeagueV1Api;

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

    TftLeagueV1Api apiInstance = new TftLeagueV1Api(defaultClient);
    String queue = "RANKED_TFT_TURBO"; // String | 
    try {
      List<TftLeagueV1TopRatedLadderEntryDto> result = apiInstance.tftLeagueV1GetTopRatedLadder(queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftLeagueV1Api#tftLeagueV1GetTopRatedLadder");
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
| **queue** | **String**|  | [enum: RANKED_TFT_TURBO] |

### Return type

[**List&lt;TftLeagueV1TopRatedLadderEntryDto&gt;**](TftLeagueV1TopRatedLadderEntryDto.md)

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

