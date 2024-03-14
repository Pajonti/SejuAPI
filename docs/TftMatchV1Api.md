# TftMatchV1Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tftMatchV1GetMatch**](TftMatchV1Api.md#tftMatchV1GetMatch) | **GET** /tft/match/v1/matches/{matchId} | Get a match by match id |
| [**tftMatchV1GetMatchIdsByPUUID**](TftMatchV1Api.md#tftMatchV1GetMatchIdsByPUUID) | **GET** /tft/match/v1/matches/by-puuid/{puuid}/ids | Get a list of match ids by PUUID |


<a id="tftMatchV1GetMatch"></a>
# **tftMatchV1GetMatch**
> TftMatchV1MatchDto tftMatchV1GetMatch(matchId)

Get a match by match id

Get a match by match id

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftMatchV1Api;

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

    TftMatchV1Api apiInstance = new TftMatchV1Api(defaultClient);
    String matchId = "matchId_example"; // String | 
    try {
      TftMatchV1MatchDto result = apiInstance.tftMatchV1GetMatch(matchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftMatchV1Api#tftMatchV1GetMatch");
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
| **matchId** | **String**|  | |

### Return type

[**TftMatchV1MatchDto**](TftMatchV1MatchDto.md)

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

<a id="tftMatchV1GetMatchIdsByPUUID"></a>
# **tftMatchV1GetMatchIdsByPUUID**
> List&lt;String&gt; tftMatchV1GetMatchIdsByPUUID(puuid, start, endTime, startTime, count)

Get a list of match ids by PUUID

Get a list of match ids by PUUID

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TftMatchV1Api;

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

    TftMatchV1Api apiInstance = new TftMatchV1Api(defaultClient);
    String puuid = "puuid_example"; // String | 
    Integer start = 56; // Integer | Defaults to 0. Start index.
    Long endTime = 56L; // Long | Epoch timestamp in seconds.
    Long startTime = 56L; // Long | Epoch timestamp in seconds. The matchlist started storing timestamps on June 16th, 2021. Any matches played before June 16th, 2021 won't be included in the results if the startTime filter is set.
    Integer count = 56; // Integer | Defaults to 20. Number of match ids to return.
    try {
      List<String> result = apiInstance.tftMatchV1GetMatchIdsByPUUID(puuid, start, endTime, startTime, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TftMatchV1Api#tftMatchV1GetMatchIdsByPUUID");
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
| **start** | **Integer**| Defaults to 0. Start index. | [optional] |
| **endTime** | **Long**| Epoch timestamp in seconds. | [optional] |
| **startTime** | **Long**| Epoch timestamp in seconds. The matchlist started storing timestamps on June 16th, 2021. Any matches played before June 16th, 2021 won&#39;t be included in the results if the startTime filter is set. | [optional] |
| **count** | **Integer**| Defaults to 20. Number of match ids to return. | [optional] |

### Return type

**List&lt;String&gt;**

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

