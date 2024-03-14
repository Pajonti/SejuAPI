# TournamentV5Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tournamentV5CreateTournamentCode**](TournamentV5Api.md#tournamentV5CreateTournamentCode) | **POST** /lol/tournament/v5/codes | Create a tournament code for the given tournament. |
| [**tournamentV5GetGames**](TournamentV5Api.md#tournamentV5GetGames) | **GET** /lol/tournament/v5/games/by-code/{tournamentCode} | Get games details |
| [**tournamentV5GetLobbyEventsByCode**](TournamentV5Api.md#tournamentV5GetLobbyEventsByCode) | **GET** /lol/tournament/v5/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code. |
| [**tournamentV5GetTournamentCode**](TournamentV5Api.md#tournamentV5GetTournamentCode) | **GET** /lol/tournament/v5/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string. |
| [**tournamentV5RegisterProviderData**](TournamentV5Api.md#tournamentV5RegisterProviderData) | **POST** /lol/tournament/v5/providers | Creates a tournament provider and returns its ID. |
| [**tournamentV5RegisterTournament**](TournamentV5Api.md#tournamentV5RegisterTournament) | **POST** /lol/tournament/v5/tournaments | Creates a tournament and returns its ID. |
| [**tournamentV5UpdateCode**](TournamentV5Api.md#tournamentV5UpdateCode) | **PUT** /lol/tournament/v5/codes/{tournamentCode} | Update the pick type, map, spectator type, or allowed puuids for a code. |


<a id="tournamentV5CreateTournamentCode"></a>
# **tournamentV5CreateTournamentCode**
> List&lt;String&gt; tournamentV5CreateTournamentCode(tournamentId, tournamentV5TournamentCodeParametersV5, count)

Create a tournament code for the given tournament.

Create a tournament code for the given tournament.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    Long tournamentId = 56L; // Long | The tournament ID
    TournamentV5TournamentCodeParametersV5 tournamentV5TournamentCodeParametersV5 = new TournamentV5TournamentCodeParametersV5(); // TournamentV5TournamentCodeParametersV5 | Metadata for the generated code
    Integer count = 56; // Integer | The number of codes to create (max 1000)
    try {
      List<String> result = apiInstance.tournamentV5CreateTournamentCode(tournamentId, tournamentV5TournamentCodeParametersV5, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5CreateTournamentCode");
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
| **tournamentId** | **Long**| The tournament ID | |
| **tournamentV5TournamentCodeParametersV5** | [**TournamentV5TournamentCodeParametersV5**](TournamentV5TournamentCodeParametersV5.md)| Metadata for the generated code | |
| **count** | **Integer**| The number of codes to create (max 1000) | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="tournamentV5GetGames"></a>
# **tournamentV5GetGames**
> List&lt;TournamentV5TournamentGamesV5&gt; tournamentV5GetGames(tournamentCode)

Get games details

Get games details ## Implementation Notes Additional endpoint to get tournament games. From this endpoint, you are able to get participants PUUID (the callback doesn&#39;t contain this info).  You can also use it to check if the game was recorded and validate callbacks. If the endpoint returns the game, it means a callback was attempted.  This will only work for tournament codes created after November 10, 2023.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    String tournamentCode = "tournamentCode_example"; // String | 
    try {
      List<TournamentV5TournamentGamesV5> result = apiInstance.tournamentV5GetGames(tournamentCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5GetGames");
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
| **tournamentCode** | **String**|  | |

### Return type

[**List&lt;TournamentV5TournamentGamesV5&gt;**](TournamentV5TournamentGamesV5.md)

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

<a id="tournamentV5GetLobbyEventsByCode"></a>
# **tournamentV5GetLobbyEventsByCode**
> TournamentV5LobbyEventV5DTOWrapper tournamentV5GetLobbyEventsByCode(tournamentCode)

Gets a list of lobby events by tournament code.

Gets a list of lobby events by tournament code.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    String tournamentCode = "tournamentCode_example"; // String | The short code to look up lobby events for
    try {
      TournamentV5LobbyEventV5DTOWrapper result = apiInstance.tournamentV5GetLobbyEventsByCode(tournamentCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5GetLobbyEventsByCode");
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
| **tournamentCode** | **String**| The short code to look up lobby events for | |

### Return type

[**TournamentV5LobbyEventV5DTOWrapper**](TournamentV5LobbyEventV5DTOWrapper.md)

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

<a id="tournamentV5GetTournamentCode"></a>
# **tournamentV5GetTournamentCode**
> TournamentV5TournamentCodeV5DTO tournamentV5GetTournamentCode(tournamentCode)

Returns the tournament code DTO associated with a tournament code string.

Returns the tournament code DTO associated with a tournament code string.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    String tournamentCode = "tournamentCode_example"; // String | The tournament code string.
    try {
      TournamentV5TournamentCodeV5DTO result = apiInstance.tournamentV5GetTournamentCode(tournamentCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5GetTournamentCode");
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
| **tournamentCode** | **String**| The tournament code string. | |

### Return type

[**TournamentV5TournamentCodeV5DTO**](TournamentV5TournamentCodeV5DTO.md)

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

<a id="tournamentV5RegisterProviderData"></a>
# **tournamentV5RegisterProviderData**
> Integer tournamentV5RegisterProviderData(tournamentV5ProviderRegistrationParametersV5)

Creates a tournament provider and returns its ID.

Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    TournamentV5ProviderRegistrationParametersV5 tournamentV5ProviderRegistrationParametersV5 = new TournamentV5ProviderRegistrationParametersV5(); // TournamentV5ProviderRegistrationParametersV5 | The provider definition.
    try {
      Integer result = apiInstance.tournamentV5RegisterProviderData(tournamentV5ProviderRegistrationParametersV5);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5RegisterProviderData");
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
| **tournamentV5ProviderRegistrationParametersV5** | [**TournamentV5ProviderRegistrationParametersV5**](TournamentV5ProviderRegistrationParametersV5.md)| The provider definition. | |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="tournamentV5RegisterTournament"></a>
# **tournamentV5RegisterTournament**
> Integer tournamentV5RegisterTournament(tournamentV5TournamentRegistrationParametersV5)

Creates a tournament and returns its ID.

Creates a tournament and returns its ID.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    TournamentV5TournamentRegistrationParametersV5 tournamentV5TournamentRegistrationParametersV5 = new TournamentV5TournamentRegistrationParametersV5(); // TournamentV5TournamentRegistrationParametersV5 | The tournament definition.
    try {
      Integer result = apiInstance.tournamentV5RegisterTournament(tournamentV5TournamentRegistrationParametersV5);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5RegisterTournament");
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
| **tournamentV5TournamentRegistrationParametersV5** | [**TournamentV5TournamentRegistrationParametersV5**](TournamentV5TournamentRegistrationParametersV5.md)| The tournament definition. | |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="tournamentV5UpdateCode"></a>
# **tournamentV5UpdateCode**
> tournamentV5UpdateCode(tournamentCode, tournamentV5TournamentCodeUpdateParametersV5)

Update the pick type, map, spectator type, or allowed puuids for a code.

Update the pick type, map, spectator type, or allowed puuids for a code.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentV5Api;

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

    TournamentV5Api apiInstance = new TournamentV5Api(defaultClient);
    String tournamentCode = "tournamentCode_example"; // String | The tournament code to update
    TournamentV5TournamentCodeUpdateParametersV5 tournamentV5TournamentCodeUpdateParametersV5 = new TournamentV5TournamentCodeUpdateParametersV5(); // TournamentV5TournamentCodeUpdateParametersV5 | The fields to update
    try {
      apiInstance.tournamentV5UpdateCode(tournamentCode, tournamentV5TournamentCodeUpdateParametersV5);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentV5Api#tournamentV5UpdateCode");
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
| **tournamentCode** | **String**| The tournament code to update | |
| **tournamentV5TournamentCodeUpdateParametersV5** | [**TournamentV5TournamentCodeUpdateParametersV5**](TournamentV5TournamentCodeUpdateParametersV5.md)| The fields to update | [optional] |

### Return type

null (empty response body)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

