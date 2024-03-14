

# TournamentV5TournamentCodeUpdateParametersV5


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedParticipants** | **List&lt;String&gt;** | Optional list of encrypted puuids in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future. |  [optional] |
|**pickType** | [**PickTypeEnum**](#PickTypeEnum) | The pick type              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT) |  |
|**mapType** | [**MapTypeEnum**](#MapTypeEnum) | The map type              (Legal values:  SUMMONERS_RIFT,  HOWLING_ABYSS) |  |
|**spectatorType** | [**SpectatorTypeEnum**](#SpectatorTypeEnum) | The spectator type              (Legal values:  NONE,  LOBBYONLY,  ALL) |  |



## Enum: PickTypeEnum

| Name | Value |
|---- | -----|
| BLIND_PICK | &quot;BLIND_PICK&quot; |
| DRAFT_MODE | &quot;DRAFT_MODE&quot; |
| ALL_RANDOM | &quot;ALL_RANDOM&quot; |
| TOURNAMENT_DRAFT | &quot;TOURNAMENT_DRAFT&quot; |



## Enum: MapTypeEnum

| Name | Value |
|---- | -----|
| SUMMONERS_RIFT | &quot;SUMMONERS_RIFT&quot; |
| HOWLING_ABYSS | &quot;HOWLING_ABYSS&quot; |



## Enum: SpectatorTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| LOBBYONLY | &quot;LOBBYONLY&quot; |
| ALL | &quot;ALL&quot; |



