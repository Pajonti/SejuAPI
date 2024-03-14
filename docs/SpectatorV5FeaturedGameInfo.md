

# SpectatorV5FeaturedGameInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gameMode** | [**GameModeEnum**](#GameModeEnum) | The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO) |  |
|**gameLength** | **Long** | The amount of time in seconds that has passed since the game started |  |
|**mapId** | **Long** | The ID of the map |  |
|**gameType** | [**GameTypeEnum**](#GameTypeEnum) | The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME) |  |
|**bannedChampions** | [**List&lt;SpectatorV5BannedChampion&gt;**](SpectatorV5BannedChampion.md) | Banned champion information |  |
|**gameId** | **Long** | The ID of the game |  |
|**observers** | [**SpectatorV5Observer**](SpectatorV5Observer.md) |  |  |
|**gameQueueConfigId** | **Long** | The queue type (queue types are documented on the Game Constants page) |  |
|**participants** | [**List&lt;SpectatorV5Participant&gt;**](SpectatorV5Participant.md) | The participant information |  |
|**platformId** | **String** | The ID of the platform on which the game is being played |  |



## Enum: GameModeEnum

| Name | Value |
|---- | -----|
| CLASSIC | &quot;CLASSIC&quot; |
| ODIN | &quot;ODIN&quot; |
| ARAM | &quot;ARAM&quot; |
| TUTORIAL | &quot;TUTORIAL&quot; |
| ONEFORALL | &quot;ONEFORALL&quot; |
| ASCENSION | &quot;ASCENSION&quot; |
| FIRSTBLOOD | &quot;FIRSTBLOOD&quot; |
| KINGPORO | &quot;KINGPORO&quot; |



## Enum: GameTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_GAME | &quot;CUSTOM_GAME&quot; |
| MATCHED_GAME | &quot;MATCHED_GAME&quot; |
| TUTORIAL_GAME | &quot;TUTORIAL_GAME&quot; |



