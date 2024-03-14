

# MatchV5MatchTimelineInfoFrameEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**realTimestamp** | **Long** |  |  [optional] |
|**timestamp** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | Timeline event type. (Known legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT, CHAMPION_KILL, CHAMPION_SPECIAL_KILL, CHAMPION_TRANSFORM, DRAGON_SOUL_GIVEN, ELITE_MONSTER_KILL, GAME_END, ITEM_DESTROYED, ITEM_PURCHASED, ITEM_SOLD, ITEM_UNDO, LEVEL_UP, PAUSE_END, PAUSE_START, SKILL_LEVEL_UP, TURRET_PLATE_DESTROYED, WARD_KILL, WARD_PLACED) |  |
|**itemId** | **Integer** |  |  [optional] |
|**participantId** | **Integer** |  |  [optional] |
|**levelUpType** | **String** |  |  [optional] |
|**skillSlot** | **Integer** |  |  [optional] |
|**creatorId** | **Integer** |  |  [optional] |
|**wardType** | **String** |  |  [optional] |
|**level** | **Integer** |  |  [optional] |
|**assistingParticipantIds** | **List&lt;Integer&gt;** |  |  [optional] |
|**bounty** | **Integer** |  |  [optional] |
|**killStreakLength** | **Integer** |  |  [optional] |
|**killerId** | **Integer** |  |  [optional] |
|**position** | [**MatchV5MatchTimelinePosition**](MatchV5MatchTimelinePosition.md) |  |  [optional] |
|**victimDamageDealt** | [**List&lt;MatchV5MatchTimelineInfoFrameEventVictimDamageDealt&gt;**](MatchV5MatchTimelineInfoFrameEventVictimDamageDealt.md) |  |  [optional] |
|**victimDamageReceived** | [**List&lt;MatchV5MatchTimelineInfoFrameEventVictimDamageDealt&gt;**](MatchV5MatchTimelineInfoFrameEventVictimDamageDealt.md) |  |  [optional] |
|**victimId** | **Integer** |  |  [optional] |
|**killType** | **String** |  |  [optional] |
|**laneType** | **String** |  |  [optional] |
|**teamId** | **Integer** |  |  [optional] |
|**multiKillLength** | **Integer** |  |  [optional] |
|**killerTeamId** | **Integer** |  |  [optional] |
|**monsterType** | **String** |  |  [optional] |
|**monsterSubType** | **String** |  |  [optional] |
|**buildingType** | **String** |  |  [optional] |
|**towerType** | **String** |  |  [optional] |
|**afterId** | **Integer** |  |  [optional] |
|**beforeId** | **Integer** |  |  [optional] |
|**goldGain** | **Integer** |  |  [optional] |
|**gameId** | **Long** |  |  [optional] |
|**winningTeam** | **Integer** |  |  [optional] |
|**transformType** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**shutdownBounty** | **Integer** |  |  [optional] |
|**actualStartTime** | **Long** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ASCENDED_EVENT | &quot;ASCENDED_EVENT&quot; |
| BUILDING_KILL | &quot;BUILDING_KILL&quot; |
| CAPTURE_POINT | &quot;CAPTURE_POINT&quot; |
| CHAMPION_KILL | &quot;CHAMPION_KILL&quot; |
| CHAMPION_SPECIAL_KILL | &quot;CHAMPION_SPECIAL_KILL&quot; |
| CHAMPION_TRANSFORM | &quot;CHAMPION_TRANSFORM&quot; |
| DRAGON_SOUL_GIVEN | &quot;DRAGON_SOUL_GIVEN&quot; |
| ELITE_MONSTER_KILL | &quot;ELITE_MONSTER_KILL&quot; |
| GAME_END | &quot;GAME_END&quot; |
| ITEM_DESTROYED | &quot;ITEM_DESTROYED&quot; |
| ITEM_PURCHASED | &quot;ITEM_PURCHASED&quot; |
| ITEM_SOLD | &quot;ITEM_SOLD&quot; |
| ITEM_UNDO | &quot;ITEM_UNDO&quot; |
| LEVEL_UP | &quot;LEVEL_UP&quot; |
| PAUSE_END | &quot;PAUSE_END&quot; |
| PAUSE_START | &quot;PAUSE_START&quot; |
| SKILL_LEVEL_UP | &quot;SKILL_LEVEL_UP&quot; |
| TURRET_PLATE_DESTROYED | &quot;TURRET_PLATE_DESTROYED&quot; |
| WARD_KILL | &quot;WARD_KILL&quot; |
| WARD_PLACED | &quot;WARD_PLACED&quot; |



