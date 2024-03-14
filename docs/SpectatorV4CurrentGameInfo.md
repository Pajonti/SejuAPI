

# SpectatorV4CurrentGameInfo


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
|**bannedChampions** | [**List&lt;SpectatorV4BannedChampion&gt;**](SpectatorV4BannedChampion.md) | Banned champion information |  |
|**gameQueueConfigId** | **Long** | The queue type (queue types are documented on the Game Constants page) |  [optional] |
|**observers** | [**SpectatorV4Observer**](SpectatorV4Observer.md) |  |  |
|**participants** | [**List&lt;SpectatorV4CurrentGameParticipant&gt;**](SpectatorV4CurrentGameParticipant.md) | The participant information |  |



