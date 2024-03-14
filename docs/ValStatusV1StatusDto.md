

# ValStatusV1StatusDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**maintenanceStatus** | [**MaintenanceStatusEnum**](#MaintenanceStatusEnum) | (Legal values:  scheduled,  in_progress,  complete) |  |
|**incidentSeverity** | [**IncidentSeverityEnum**](#IncidentSeverityEnum) | (Legal values:  info,  warning,  critical) |  |
|**titles** | [**List&lt;ValStatusV1ContentDto&gt;**](ValStatusV1ContentDto.md) |  |  |
|**updates** | [**List&lt;ValStatusV1UpdateDto&gt;**](ValStatusV1UpdateDto.md) |  |  |
|**createdAt** | **String** |  |  |
|**archiveAt** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**platforms** | [**List&lt;PlatformsEnum&gt;**](#List&lt;PlatformsEnum&gt;) | (Legal values: windows, macos, android, ios, ps4, xbone, switch) |  |



## Enum: MaintenanceStatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;scheduled&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETE | &quot;complete&quot; |



## Enum: IncidentSeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;info&quot; |
| WARNING | &quot;warning&quot; |
| CRITICAL | &quot;critical&quot; |



## Enum: List&lt;PlatformsEnum&gt;

| Name | Value |
|---- | -----|
| WINDOWS | &quot;windows&quot; |
| MACOS | &quot;macos&quot; |
| ANDROID | &quot;android&quot; |
| IOS | &quot;ios&quot; |
| PS4 | &quot;ps4&quot; |
| XBONE | &quot;xbone&quot; |
| SWITCH | &quot;switch&quot; |



