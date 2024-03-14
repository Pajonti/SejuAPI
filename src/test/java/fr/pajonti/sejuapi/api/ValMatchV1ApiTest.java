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
import fr.pajonti.sejuapi.model.ValMatchV1MatchDto;
import fr.pajonti.sejuapi.model.ValMatchV1MatchlistDto;
import fr.pajonti.sejuapi.model.ValMatchV1RecentMatchesDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValMatchV1Api
 */
@Disabled
public class ValMatchV1ApiTest {

    private final ValMatchV1Api api = new ValMatchV1Api();

    /**
     * Get match by id
     *
     * Get match by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void valMatchV1GetMatchTest() throws ApiException {
        String matchId = null;
        ValMatchV1MatchDto response = api.valMatchV1GetMatch(matchId);
        // TODO: test validations
    }

    /**
     * Get matchlist for games played by puuid
     *
     * Get matchlist for games played by puuid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void valMatchV1GetMatchlistTest() throws ApiException {
        String puuid = null;
        ValMatchV1MatchlistDto response = api.valMatchV1GetMatchlist(puuid);
        // TODO: test validations
    }

    /**
     * Get recent matches
     *
     * Get recent matches ## Implementation Notes Returns a list of match ids that have completed in the last 10 minutes for live regions and 12 hours for the esports routing value. NA/LATAM/BR share a match history deployment. As such, recent matches will return a combined list of matches from those three regions. Requests are load balanced so you may see some inconsistencies as matches are added/removed from the list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void valMatchV1GetRecentTest() throws ApiException {
        String queue = null;
        ValMatchV1RecentMatchesDto response = api.valMatchV1GetRecent(queue);
        // TODO: test validations
    }

}
