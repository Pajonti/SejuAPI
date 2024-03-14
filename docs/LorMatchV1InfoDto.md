

# LorMatchV1InfoDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gameMode** | [**GameModeEnum**](#GameModeEnum) | (Legal values:  Constructed,  Expeditions,  Tutorial) |  |
|**gameType** | [**GameTypeEnum**](#GameTypeEnum) | (Legal values:  Ranked,  Normal,  AI,  Tutorial,  VanillaTrial,  Singleton,  StandardGauntlet) |  |
|**gameStartTimeUtc** | **String** |  |  |
|**gameVersion** | **String** |  |  |
|**gameFormat** | [**GameFormatEnum**](#GameFormatEnum) | (Legal values:  standard,  eternal) |  |
|**players** | [**List&lt;LorMatchV1PlayerDto&gt;**](LorMatchV1PlayerDto.md) |  |  |
|**totalTurnCount** | **Integer** | Total turns taken by both players. |  |



## Enum: GameModeEnum

| Name | Value |
|---- | -----|
| CONSTRUCTED | &quot;Constructed&quot; |
| EXPEDITIONS | &quot;Expeditions&quot; |
| TUTORIAL | &quot;Tutorial&quot; |



## Enum: GameTypeEnum

| Name | Value |
|---- | -----|
| RANKED | &quot;Ranked&quot; |
| NORMAL | &quot;Normal&quot; |
| AI | &quot;AI&quot; |
| TUTORIAL | &quot;Tutorial&quot; |
| VANILLATRIAL | &quot;VanillaTrial&quot; |
| SINGLETON | &quot;Singleton&quot; |
| STANDARDGAUNTLET | &quot;StandardGauntlet&quot; |



## Enum: GameFormatEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| ETERNAL | &quot;eternal&quot; |



