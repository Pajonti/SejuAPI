

# ChampionMasteryV4ChampionMasteryDto

This object contains single Champion Mastery information for player and champion combination.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**championPointsUntilNextLevel** | **Long** | Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion. |  |
|**chestGranted** | **Boolean** | Is chest granted for this champion or not in current season. |  |
|**championId** | **Long** | Champion ID for this entry. |  |
|**lastPlayTime** | **Long** | Last time this champion was played by this player - in Unix milliseconds time format. |  |
|**championLevel** | **Integer** | Champion level for specified player and champion combination. |  |
|**summonerId** | **String** | Summoner ID for this entry. (Encrypted) |  |
|**championPoints** | **Integer** | Total number of champion points for this player and champion combination - they are used to determine championLevel. |  |
|**championPointsSinceLastLevel** | **Long** | Number of points earned since current level has been achieved. |  |
|**tokensEarned** | **Integer** | The token earned for this champion at the current championLevel. When the championLevel is advanced the tokensEarned resets to 0. |  |
|**puuid** | **String** |  |  [optional] |



