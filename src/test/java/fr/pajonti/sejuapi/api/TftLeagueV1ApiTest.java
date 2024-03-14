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
import fr.pajonti.sejuapi.model.TftLeagueV1LeagueEntryDTO;
import fr.pajonti.sejuapi.model.TftLeagueV1LeagueListDTO;
import fr.pajonti.sejuapi.model.TftLeagueV1TopRatedLadderEntryDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TftLeagueV1Api
 */
@Disabled
public class TftLeagueV1ApiTest {

    private final TftLeagueV1Api api = new TftLeagueV1Api();

    /**
     * Get the challenger league.
     *
     * Get the challenger league.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetChallengerLeagueTest() throws ApiException {
        String queue = null;
        TftLeagueV1LeagueListDTO response = api.tftLeagueV1GetChallengerLeague(queue);
        // TODO: test validations
    }

    /**
     * Get the grandmaster league.
     *
     * Get the grandmaster league.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetGrandmasterLeagueTest() throws ApiException {
        String queue = null;
        TftLeagueV1LeagueListDTO response = api.tftLeagueV1GetGrandmasterLeague(queue);
        // TODO: test validations
    }

    /**
     * Get league with given ID, including inactive entries.
     *
     * Get league with given ID, including inactive entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetLeagueByIdTest() throws ApiException {
        String leagueId = null;
        TftLeagueV1LeagueListDTO response = api.tftLeagueV1GetLeagueById(leagueId);
        // TODO: test validations
    }

    /**
     * Get all the league entries.
     *
     * Get all the league entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetLeagueEntriesTest() throws ApiException {
        String tier = null;
        String division = null;
        String queue = null;
        Integer page = null;
        List<TftLeagueV1LeagueEntryDTO> response = api.tftLeagueV1GetLeagueEntries(tier, division, queue, page);
        // TODO: test validations
    }

    /**
     * Get league entries for a given summoner ID.
     *
     * Get league entries for a given summoner ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetLeagueEntriesForSummonerTest() throws ApiException {
        String summonerId = null;
        List<TftLeagueV1LeagueEntryDTO> response = api.tftLeagueV1GetLeagueEntriesForSummoner(summonerId);
        // TODO: test validations
    }

    /**
     * Get the master league.
     *
     * Get the master league.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetMasterLeagueTest() throws ApiException {
        String queue = null;
        TftLeagueV1LeagueListDTO response = api.tftLeagueV1GetMasterLeague(queue);
        // TODO: test validations
    }

    /**
     * Get the top rated ladder for given queue
     *
     * Get the top rated ladder for given queue
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tftLeagueV1GetTopRatedLadderTest() throws ApiException {
        String queue = null;
        List<TftLeagueV1TopRatedLadderEntryDto> response = api.tftLeagueV1GetTopRatedLadder(queue);
        // TODO: test validations
    }

}
