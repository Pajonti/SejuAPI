

# ValStatusV1UpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**author** | **String** |  |  |
|**publish** | **Boolean** |  |  |
|**publishLocations** | [**List&lt;PublishLocationsEnum&gt;**](#List&lt;PublishLocationsEnum&gt;) | (Legal values: riotclient, riotstatus, game) |  |
|**translations** | [**List&lt;ValStatusV1ContentDto&gt;**](ValStatusV1ContentDto.md) |  |  |
|**createdAt** | **String** |  |  |
|**updatedAt** | **String** |  |  |



## Enum: List&lt;PublishLocationsEnum&gt;

| Name | Value |
|---- | -----|
| RIOTCLIENT | &quot;riotclient&quot; |
| RIOTSTATUS | &quot;riotstatus&quot; |
| GAME | &quot;game&quot; |



