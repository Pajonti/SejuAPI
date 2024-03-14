

# MatchV5InfoDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gameCreation** | **Long** | Unix timestamp for when the game is created on the game server (i.e., the loading screen). |  |
|**gameDuration** | **Long** | Prior to patch 11.20, this field returns the game length in milliseconds calculated from gameEndTimestamp - gameStartTimestamp. Post patch 11.20, this field returns the max timePlayed of any participant in the game in seconds, which makes the behavior of this field consistent with that of match-v4. The best way to handling the change in this field is to treat the value as milliseconds if the gameEndTimestamp field isn&#39;t in the response and to treat the value as seconds if gameEndTimestamp is in the response. |  |
|**gameEndTimestamp** | **Long** | Unix timestamp for when match ends on the game server. This timestamp can occasionally be significantly longer than when the match \&quot;ends\&quot;. The most reliable way of determining the timestamp for the end of the match would be to add the max time played of any participant to the gameStartTimestamp. This field was added to match-v5 in patch 11.20 on Oct 5th, 2021. |  [optional] |
|**gameId** | **Long** |  |  |
|**gameMode** | **String** | Refer to the Game Constants documentation. |  |
|**gameName** | **String** |  |  |
|**gameStartTimestamp** | **Long** | Unix timestamp for when match starts on the game server. |  |
|**gameType** | **String** |  |  |
|**gameVersion** | **String** | The first two parts can be used to determine the patch a game was played on. |  |
|**mapId** | **Integer** | Refer to the Game Constants documentation. |  |
|**participants** | [**List&lt;MatchV5ParticipantDto&gt;**](MatchV5ParticipantDto.md) |  |  |
|**platformId** | **String** | Platform where the match was played. |  |
|**queueId** | **Integer** | Refer to the Game Constants documentation. |  |
|**teams** | [**List&lt;MatchV5TeamDto&gt;**](MatchV5TeamDto.md) |  |  |
|**tournamentCode** | **String** | Tournament code used to generate the match. This field was added to match-v5 in patch 11.13 on June 23rd, 2021. |  [optional] |
|**endOfGameResult** | **String** |  |  [optional] |



