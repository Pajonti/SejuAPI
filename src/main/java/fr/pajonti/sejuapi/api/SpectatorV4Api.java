/*
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([view file](../openapi-3.0.0.json), [ui select](?url=../openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([view file](../openapi-3.0.0.min.json), [ui select](?url=../openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([view file](../openapi-3.0.0.yml), [ui select](?url=../openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([view file](../openapi-3.0.0.min.yml), [ui select](?url=../openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([view file](../swaggerspec-2.0.json), [ui select](?url=../swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([view file](../swaggerspec-2.0.min.json), [ui select](?url=../swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([view file](../swaggerspec-2.0.yml), [ui select](?url=../swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([view file](../swaggerspec-2.0.min.yml), [ui select](?url=../swaggerspec-2.0.min.yml)) ## Other Files - Missing DTOs: [`missing.json`](../missing.json) - Routes Table: [`routesTable.json`](../routesTable.json) - [Enum Files](../enums/) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.com/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * The version of the OpenAPI document: 879affafe206ccc5b48127e68c0bd466fcc73c84
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.pajonti.sejuapi.api;

import fr.pajonti.sejuapi.invoker.ApiCallback;
import fr.pajonti.sejuapi.invoker.ApiClient;
import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.invoker.ApiResponse;
import fr.pajonti.sejuapi.invoker.Configuration;
import fr.pajonti.sejuapi.invoker.Pair;
import fr.pajonti.sejuapi.invoker.ProgressRequestBody;
import fr.pajonti.sejuapi.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import fr.pajonti.sejuapi.model.SpectatorV4CurrentGameInfo;
import fr.pajonti.sejuapi.model.SpectatorV4FeaturedGames;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpectatorV4Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SpectatorV4Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SpectatorV4Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for spectatorV4GetCurrentGameInfoBySummoner
     * @param encryptedSummonerId The ID of the summoner. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getCurrentGameInfoBySummoner">Get current game information for the given summoner ID. Documentation</a>
     */
    public okhttp3.Call spectatorV4GetCurrentGameInfoBySummonerCall(String encryptedSummonerId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lol/spectator/v4/active-games/by-summoner/{encryptedSummonerId}"
            .replace("{" + "encryptedSummonerId" + "}", localVarApiClient.escapeString(encryptedSummonerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "X-Riot-Token", "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call spectatorV4GetCurrentGameInfoBySummonerValidateBeforeCall(String encryptedSummonerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'encryptedSummonerId' is set
        if (encryptedSummonerId == null) {
            throw new ApiException("Missing the required parameter 'encryptedSummonerId' when calling spectatorV4GetCurrentGameInfoBySummoner(Async)");
        }

        return spectatorV4GetCurrentGameInfoBySummonerCall(encryptedSummonerId, _callback);

    }

    /**
     * Get current game information for the given summoner ID.
     * Get current game information for the given summoner ID.
     * @param encryptedSummonerId The ID of the summoner. (required)
     * @return SpectatorV4CurrentGameInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getCurrentGameInfoBySummoner">Get current game information for the given summoner ID. Documentation</a>
     */
    public SpectatorV4CurrentGameInfo spectatorV4GetCurrentGameInfoBySummoner(String encryptedSummonerId) throws ApiException {
        ApiResponse<SpectatorV4CurrentGameInfo> localVarResp = spectatorV4GetCurrentGameInfoBySummonerWithHttpInfo(encryptedSummonerId);
        return localVarResp.getData();
    }

    /**
     * Get current game information for the given summoner ID.
     * Get current game information for the given summoner ID.
     * @param encryptedSummonerId The ID of the summoner. (required)
     * @return ApiResponse&lt;SpectatorV4CurrentGameInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getCurrentGameInfoBySummoner">Get current game information for the given summoner ID. Documentation</a>
     */
    public ApiResponse<SpectatorV4CurrentGameInfo> spectatorV4GetCurrentGameInfoBySummonerWithHttpInfo(String encryptedSummonerId) throws ApiException {
        okhttp3.Call localVarCall = spectatorV4GetCurrentGameInfoBySummonerValidateBeforeCall(encryptedSummonerId, null);
        Type localVarReturnType = new TypeToken<SpectatorV4CurrentGameInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get current game information for the given summoner ID. (asynchronously)
     * Get current game information for the given summoner ID.
     * @param encryptedSummonerId The ID of the summoner. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getCurrentGameInfoBySummoner">Get current game information for the given summoner ID. Documentation</a>
     */
    public okhttp3.Call spectatorV4GetCurrentGameInfoBySummonerAsync(String encryptedSummonerId, final ApiCallback<SpectatorV4CurrentGameInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = spectatorV4GetCurrentGameInfoBySummonerValidateBeforeCall(encryptedSummonerId, _callback);
        Type localVarReturnType = new TypeToken<SpectatorV4CurrentGameInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for spectatorV4GetFeaturedGames
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getFeaturedGames">Get list of featured games. Documentation</a>
     */
    public okhttp3.Call spectatorV4GetFeaturedGamesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lol/spectator/v4/featured-games";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "X-Riot-Token", "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call spectatorV4GetFeaturedGamesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return spectatorV4GetFeaturedGamesCall(_callback);

    }

    /**
     * Get list of featured games.
     * Get list of featured games.
     * @return SpectatorV4FeaturedGames
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getFeaturedGames">Get list of featured games. Documentation</a>
     */
    public SpectatorV4FeaturedGames spectatorV4GetFeaturedGames() throws ApiException {
        ApiResponse<SpectatorV4FeaturedGames> localVarResp = spectatorV4GetFeaturedGamesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get list of featured games.
     * Get list of featured games.
     * @return ApiResponse&lt;SpectatorV4FeaturedGames&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getFeaturedGames">Get list of featured games. Documentation</a>
     */
    public ApiResponse<SpectatorV4FeaturedGames> spectatorV4GetFeaturedGamesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = spectatorV4GetFeaturedGamesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<SpectatorV4FeaturedGames>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get list of featured games. (asynchronously)
     * Get list of featured games.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Data not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method not allowed </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported media type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#spectator-v4/GET_getFeaturedGames">Get list of featured games. Documentation</a>
     */
    public okhttp3.Call spectatorV4GetFeaturedGamesAsync(final ApiCallback<SpectatorV4FeaturedGames> _callback) throws ApiException {

        okhttp3.Call localVarCall = spectatorV4GetFeaturedGamesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<SpectatorV4FeaturedGames>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
