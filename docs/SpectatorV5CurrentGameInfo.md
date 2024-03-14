

# SpectatorV5CurrentGameInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gameId** | **Long** | The ID of the game |  |
|**gameType** | **String** | The game type |  |
|**gameStartTime** | **Long** | The game start time represented in epoch milliseconds |  |
|**mapId** | **Long** | The ID of the map |  |
|**gameLength** | **Long** | The amount of time in seconds that has passed since the game started |  |
|**platformId** | **String** | The ID of the platform on which the game is being played |  |
|**gameMode** | **String** | The game mode |  |
|**bannedChampions** | [**List&lt;SpectatorV5BannedChampion&gt;**](SpectatorV5BannedChampion.md) | Banned champion information |  |
|**gameQueueConfigId** | **Long** | The queue type (queue types are documented on the Game Constants page) |  [optional] |
|**observers** | [**SpectatorV5Observer**](SpectatorV5Observer.md) |  |  |
|**participants** | [**List&lt;SpectatorV5CurrentGameParticipant&gt;**](SpectatorV5CurrentGameParticipant.md) | The participant information |  |



