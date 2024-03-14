# LeagueExpV4Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**leagueExpV4GetLeagueEntries**](LeagueExpV4Api.md#leagueExpV4GetLeagueEntries) | **GET** /lol/league-exp/v4/entries/{queue}/{tier}/{division} | Get all the league entries. |


<a id="leagueExpV4GetLeagueEntries"></a>
# **leagueExpV4GetLeagueEntries**
> List&lt;LeagueExpV4LeagueEntryDTO&gt; leagueExpV4GetLeagueEntries(queue, tier, division, page)

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
import fr.pajonti.sejuapi.api.LeagueExpV4Api;

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

    LeagueExpV4Api apiInstance = new LeagueExpV4Api(defaultClient);
    String queue = "RANKED_SOLO_5x5"; // String | Note that the queue value must be a valid ranked queue.
    String tier = "CHALLENGER"; // String | 
    String division = "I"; // String | 
    Integer page = 56; // Integer | Defaults to 1. Starts with page 1.
    try {
      List<LeagueExpV4LeagueEntryDTO> result = apiInstance.leagueExpV4GetLeagueEntries(queue, tier, division, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeagueExpV4Api#leagueExpV4GetLeagueEntries");
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
| **queue** | **String**| Note that the queue value must be a valid ranked queue. | [enum: RANKED_SOLO_5x5, RANKED_TFT, RANKED_FLEX_SR, RANKED_FLEX_TT] |
| **tier** | **String**|  | [enum: CHALLENGER, GRANDMASTER, MASTER, DIAMOND, EMERALD, PLATINUM, GOLD, SILVER, BRONZE, IRON] |
| **division** | **String**|  | [enum: I, II, III, IV] |
| **page** | **Integer**| Defaults to 1. Starts with page 1. | [optional] |

### Return type

[**List&lt;LeagueExpV4LeagueEntryDTO&gt;**](LeagueExpV4LeagueEntryDTO.md)

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

