

# TftMatchV1ParticipantDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**augments** | **List&lt;String&gt;** |  |  [optional] |
|**partnerGroupId** | **Integer** |  |  [optional] |
|**companion** | [**TftMatchV1CompanionDto**](TftMatchV1CompanionDto.md) |  |  |
|**goldLeft** | **Integer** | Gold left after participant was eliminated. |  |
|**lastRound** | **Integer** | The round the participant was eliminated in. Note: If the player was eliminated in stage 2-1 their last_round would be 5. |  |
|**level** | **Integer** | Participant Little Legend level. Note: This is not the number of active units. |  |
|**placement** | **Integer** | Participant placement upon elimination. |  |
|**playersEliminated** | **Integer** | Number of players the participant eliminated. |  |
|**puuid** | **String** |  |  |
|**timeEliminated** | **Float** | The number of seconds before the participant was eliminated. |  |
|**totalDamageToPlayers** | **Integer** | Damage the participant dealt to other players. |  |
|**traits** | [**List&lt;TftMatchV1TraitDto&gt;**](TftMatchV1TraitDto.md) | A complete list of traits for the participant&#39;s active units. |  |
|**units** | [**List&lt;TftMatchV1UnitDto&gt;**](TftMatchV1UnitDto.md) | A list of active units for the participant. |  |
|**missions** | [**TftMatchV1ParticipantMissionsDto**](TftMatchV1ParticipantMissionsDto.md) |  |  [optional] |



