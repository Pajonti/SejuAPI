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

import fr.pajonti.sejuapi.invoker.ApiException;
import fr.pajonti.sejuapi.model.SpectatorV4CurrentGameInfo;
import fr.pajonti.sejuapi.model.SpectatorV4FeaturedGames;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpectatorV4Api
 */
@Disabled
public class SpectatorV4ApiTest {

    private final SpectatorV4Api api = new SpectatorV4Api();

    /**
     * Get current game information for the given summoner ID.
     *
     * Get current game information for the given summoner ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void spectatorV4GetCurrentGameInfoBySummonerTest() throws ApiException {
        String encryptedSummonerId = null;
        SpectatorV4CurrentGameInfo response = api.spectatorV4GetCurrentGameInfoBySummoner(encryptedSummonerId);
        // TODO: test validations
    }

    /**
     * Get list of featured games.
     *
     * Get list of featured games.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void spectatorV4GetFeaturedGamesTest() throws ApiException {
        SpectatorV4FeaturedGames response = api.spectatorV4GetFeaturedGames();
        // TODO: test validations
    }

}
