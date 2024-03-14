# ValRankedV1Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**valRankedV1GetLeaderboard**](ValRankedV1Api.md#valRankedV1GetLeaderboard) | **GET** /val/ranked/v1/leaderboards/by-act/{actId} | Get leaderboard for the competitive queue |


<a id="valRankedV1GetLeaderboard"></a>
# **valRankedV1GetLeaderboard**
> ValRankedV1LeaderboardDto valRankedV1GetLeaderboard(actId, size, startIndex)

Get leaderboard for the competitive queue

Get leaderboard for the competitive queue

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.ValRankedV1Api;

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

    ValRankedV1Api apiInstance = new ValRankedV1Api(defaultClient);
    String actId = "actId_example"; // String | Act ids can be found using the val-content API.
    Integer size = 56; // Integer | Defaults to 200. Valid values: 1 to 200.
    Integer startIndex = 56; // Integer | Defaults to 0.
    try {
      ValRankedV1LeaderboardDto result = apiInstance.valRankedV1GetLeaderboard(actId, size, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValRankedV1Api#valRankedV1GetLeaderboard");
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
| **actId** | **String**| Act ids can be found using the val-content API. | |
| **size** | **Integer**| Defaults to 200. Valid values: 1 to 200. | [optional] |
| **startIndex** | **Integer**| Defaults to 0. | [optional] |

### Return type

[**ValRankedV1LeaderboardDto**](ValRankedV1LeaderboardDto.md)

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

