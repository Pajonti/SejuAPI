

# TftLeagueV1LeagueEntryDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**puuid** | **String** | Player Universal Unique Identifier. Exact length of 78 characters. (Encrypted) |  [optional] |
|**leagueId** | **String** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**summonerId** | **String** | Player&#39;s encrypted summonerId. |  |
|**summonerName** | **String** |  |  |
|**queueType** | **String** |  |  |
|**ratedTier** | [**RatedTierEnum**](#RatedTierEnum) | Only included for the RANKED_TFT_TURBO queueType.              (Legal values:  ORANGE,  PURPLE,  BLUE,  GREEN,  GRAY) |  [optional] |
|**ratedRating** | **Integer** | Only included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**tier** | **String** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**rank** | **String** | The player&#39;s division within a tier. Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**leaguePoints** | **Integer** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**wins** | **Integer** | First placement. |  |
|**losses** | **Integer** | Second through eighth placement. |  |
|**hotStreak** | **Boolean** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**veteran** | **Boolean** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**freshBlood** | **Boolean** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**inactive** | **Boolean** | Not included for the RANKED_TFT_TURBO queueType. |  [optional] |
|**miniSeries** | [**TftLeagueV1MiniSeriesDTO**](TftLeagueV1MiniSeriesDTO.md) |  |  [optional] |



## Enum: RatedTierEnum

| Name | Value |
|---- | -----|
| ORANGE | &quot;ORANGE&quot; |
| PURPLE | &quot;PURPLE&quot; |
| BLUE | &quot;BLUE&quot; |
| GREEN | &quot;GREEN&quot; |
| GRAY | &quot;GRAY&quot; |



