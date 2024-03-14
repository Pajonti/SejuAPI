

# ValRankedV1LeaderboardDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shard** | **String** | The shard for the given leaderboard. |  |
|**actId** | **String** | The act id for the given leaderboard. Act ids can be found using the val-content API. |  |
|**totalPlayers** | **Long** | The total number of players in the leaderboard. |  |
|**players** | [**List&lt;ValRankedV1PlayerDto&gt;**](ValRankedV1PlayerDto.md) |  |  |
|**immortalStartingPage** | **Long** |  |  [optional] |
|**immortalStartingIndex** | **Long** |  |  [optional] |
|**topTierRRThreshold** | **Long** |  |  [optional] |
|**tierDetails** | [**Map&lt;String, ValRankedV1TierDetailDto&gt;**](ValRankedV1TierDetailDto.md) |  |  [optional] |
|**startIndex** | **Long** |  |  [optional] |
|**query** | **String** |  |  [optional] |



