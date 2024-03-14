

# LolChallengesV1ChallengeConfigInfoDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  |
|**localizedNames** | **Map&lt;String, Map&lt;String, String&gt;&gt;** |  |  |
|**state** | [**StateEnum**](#StateEnum) | DISABLED - not visible and not calculated, HIDDEN - not visible, but calculated, ENABLED - visible and calculated, ARCHIVED - visible, but not calculated |  |
|**tracking** | [**TrackingEnum**](#TrackingEnum) | LIFETIME - stats are incremented without reset, SEASON - stats are accumulated by season and reset at the beginning of new season |  [optional] |
|**startTimestamp** | **Long** |  |  [optional] |
|**endTimestamp** | **Long** |  |  [optional] |
|**leaderboard** | **Boolean** |  |  |
|**thresholds** | **Map&lt;String, Double&gt;** |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| HIDDEN | &quot;HIDDEN&quot; |
| ENABLED | &quot;ENABLED&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



## Enum: TrackingEnum

| Name | Value |
|---- | -----|
| LIFETIME | &quot;LIFETIME&quot; |
| SEASON | &quot;SEASON&quot; |



