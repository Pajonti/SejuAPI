# SpectatorV4Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**spectatorV4GetCurrentGameInfoBySummoner**](SpectatorV4Api.md#spectatorV4GetCurrentGameInfoBySummoner) | **GET** /lol/spectator/v4/active-games/by-summoner/{encryptedSummonerId} | Get current game information for the given summoner ID. |
| [**spectatorV4GetFeaturedGames**](SpectatorV4Api.md#spectatorV4GetFeaturedGames) | **GET** /lol/spectator/v4/featured-games | Get list of featured games. |


<a id="spectatorV4GetCurrentGameInfoBySummoner"></a>
# **spectatorV4GetCurrentGameInfoBySummoner**
> SpectatorV4CurrentGameInfo spectatorV4GetCurrentGameInfoBySummoner(encryptedSummonerId)

Get current game information for the given summoner ID.

Get current game information for the given summoner ID.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.SpectatorV4Api;

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

    SpectatorV4Api apiInstance = new SpectatorV4Api(defaultClient);
    String encryptedSummonerId = "encryptedSummonerId_example"; // String | The ID of the summoner.
    try {
      SpectatorV4CurrentGameInfo result = apiInstance.spectatorV4GetCurrentGameInfoBySummoner(encryptedSummonerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectatorV4Api#spectatorV4GetCurrentGameInfoBySummoner");
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
| **encryptedSummonerId** | **String**| The ID of the summoner. | |

### Return type

[**SpectatorV4CurrentGameInfo**](SpectatorV4CurrentGameInfo.md)

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

<a id="spectatorV4GetFeaturedGames"></a>
# **spectatorV4GetFeaturedGames**
> SpectatorV4FeaturedGames spectatorV4GetFeaturedGames()

Get list of featured games.

Get list of featured games.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.SpectatorV4Api;

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

    SpectatorV4Api apiInstance = new SpectatorV4Api(defaultClient);
    try {
      SpectatorV4FeaturedGames result = apiInstance.spectatorV4GetFeaturedGames();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectatorV4Api#spectatorV4GetFeaturedGames");
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

[**SpectatorV4FeaturedGames**](SpectatorV4FeaturedGames.md)

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

