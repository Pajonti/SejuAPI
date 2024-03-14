# TournamentStubV5Api

All URIs are relative to *https://americas.api.riotgames.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tournamentStubV5CreateTournamentCode**](TournamentStubV5Api.md#tournamentStubV5CreateTournamentCode) | **POST** /lol/tournament-stub/v5/codes | Create a tournament code for the given tournament - Stub method |
| [**tournamentStubV5GetLobbyEventsByCode**](TournamentStubV5Api.md#tournamentStubV5GetLobbyEventsByCode) | **GET** /lol/tournament-stub/v5/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code - Stub method |
| [**tournamentStubV5GetTournamentCode**](TournamentStubV5Api.md#tournamentStubV5GetTournamentCode) | **GET** /lol/tournament-stub/v5/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string - Stub Method |
| [**tournamentStubV5RegisterProviderData**](TournamentStubV5Api.md#tournamentStubV5RegisterProviderData) | **POST** /lol/tournament-stub/v5/providers | Creates a tournament provider and returns its ID - Stub method |
| [**tournamentStubV5RegisterTournament**](TournamentStubV5Api.md#tournamentStubV5RegisterTournament) | **POST** /lol/tournament-stub/v5/tournaments | Creates a tournament and returns its ID - Stub method |


<a id="tournamentStubV5CreateTournamentCode"></a>
# **tournamentStubV5CreateTournamentCode**
> List&lt;String&gt; tournamentStubV5CreateTournamentCode(tournamentId, tournamentStubV5TournamentCodeParametersV5, count)

Create a tournament code for the given tournament - Stub method

Create a tournament code for the given tournament - Stub method

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentStubV5Api;

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

    TournamentStubV5Api apiInstance = new TournamentStubV5Api(defaultClient);
    Long tournamentId = 56L; // Long | The tournament ID
    TournamentStubV5TournamentCodeParametersV5 tournamentStubV5TournamentCodeParametersV5 = new TournamentStubV5TournamentCodeParametersV5(); // TournamentStubV5TournamentCodeParametersV5 | Metadata for the generated code
    Integer count = 56; // Integer | The number of codes to create (max 1000)
    try {
      List<String> result = apiInstance.tournamentStubV5CreateTournamentCode(tournamentId, tournamentStubV5TournamentCodeParametersV5, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentStubV5Api#tournamentStubV5CreateTournamentCode");
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
| **tournamentStubV5TournamentCodeParametersV5** | [**TournamentStubV5TournamentCodeParametersV5**](TournamentStubV5TournamentCodeParametersV5.md)| Metadata for the generated code | |
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

<a id="tournamentStubV5GetLobbyEventsByCode"></a>
# **tournamentStubV5GetLobbyEventsByCode**
> TournamentStubV5LobbyEventV5DTOWrapper tournamentStubV5GetLobbyEventsByCode(tournamentCode)

Gets a list of lobby events by tournament code - Stub method

Gets a list of lobby events by tournament code - Stub method

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentStubV5Api;

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

    TournamentStubV5Api apiInstance = new TournamentStubV5Api(defaultClient);
    String tournamentCode = "tournamentCode_example"; // String | The short code to look up lobby events for
    try {
      TournamentStubV5LobbyEventV5DTOWrapper result = apiInstance.tournamentStubV5GetLobbyEventsByCode(tournamentCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentStubV5Api#tournamentStubV5GetLobbyEventsByCode");
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

[**TournamentStubV5LobbyEventV5DTOWrapper**](TournamentStubV5LobbyEventV5DTOWrapper.md)

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

<a id="tournamentStubV5GetTournamentCode"></a>
# **tournamentStubV5GetTournamentCode**
> TournamentStubV5TournamentCodeV5DTO tournamentStubV5GetTournamentCode(tournamentCode)

Returns the tournament code DTO associated with a tournament code string - Stub Method

Returns the tournament code DTO associated with a tournament code string - Stub Method

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentStubV5Api;

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

    TournamentStubV5Api apiInstance = new TournamentStubV5Api(defaultClient);
    String tournamentCode = "tournamentCode_example"; // String | The tournament code string.
    try {
      TournamentStubV5TournamentCodeV5DTO result = apiInstance.tournamentStubV5GetTournamentCode(tournamentCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentStubV5Api#tournamentStubV5GetTournamentCode");
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

[**TournamentStubV5TournamentCodeV5DTO**](TournamentStubV5TournamentCodeV5DTO.md)

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

<a id="tournamentStubV5RegisterProviderData"></a>
# **tournamentStubV5RegisterProviderData**
> Integer tournamentStubV5RegisterProviderData(tournamentStubV5ProviderRegistrationParametersV5)

Creates a tournament provider and returns its ID - Stub method

Creates a tournament provider and returns its ID - Stub method ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentStubV5Api;

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

    TournamentStubV5Api apiInstance = new TournamentStubV5Api(defaultClient);
    TournamentStubV5ProviderRegistrationParametersV5 tournamentStubV5ProviderRegistrationParametersV5 = new TournamentStubV5ProviderRegistrationParametersV5(); // TournamentStubV5ProviderRegistrationParametersV5 | The provider definition.
    try {
      Integer result = apiInstance.tournamentStubV5RegisterProviderData(tournamentStubV5ProviderRegistrationParametersV5);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentStubV5Api#tournamentStubV5RegisterProviderData");
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
| **tournamentStubV5ProviderRegistrationParametersV5** | [**TournamentStubV5ProviderRegistrationParametersV5**](TournamentStubV5ProviderRegistrationParametersV5.md)| The provider definition. | |

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

<a id="tournamentStubV5RegisterTournament"></a>
# **tournamentStubV5RegisterTournament**
> Integer tournamentStubV5RegisterTournament(tournamentStubV5TournamentRegistrationParametersV5)

Creates a tournament and returns its ID - Stub method

Creates a tournament and returns its ID - Stub method

### Example
```java
// Import classes:
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.auth.*;
import fr.pajonti.sejuapi.invoker.models.*;
import fr.pajonti.sejuapi.api.TournamentStubV5Api;

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

    TournamentStubV5Api apiInstance = new TournamentStubV5Api(defaultClient);
    TournamentStubV5TournamentRegistrationParametersV5 tournamentStubV5TournamentRegistrationParametersV5 = new TournamentStubV5TournamentRegistrationParametersV5(); // TournamentStubV5TournamentRegistrationParametersV5 | The tournament definition.
    try {
      Integer result = apiInstance.tournamentStubV5RegisterTournament(tournamentStubV5TournamentRegistrationParametersV5);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentStubV5Api#tournamentStubV5RegisterTournament");
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
| **tournamentStubV5TournamentRegistrationParametersV5** | [**TournamentStubV5TournamentRegistrationParametersV5**](TournamentStubV5TournamentRegistrationParametersV5.md)| The tournament definition. | |

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

