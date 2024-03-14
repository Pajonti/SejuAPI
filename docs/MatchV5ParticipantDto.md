

# MatchV5ParticipantDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assists** | **Integer** |  |  |
|**baronKills** | **Integer** |  |  |
|**bountyLevel** | **Integer** |  |  |
|**champExperience** | **Integer** |  |  |
|**champLevel** | **Integer** |  |  |
|**championId** | **Integer** | Prior to patch 11.4, on Feb 18th, 2021, this field returned invalid championIds. We recommend determining the champion based on the championName field for matches played prior to patch 11.4. |  |
|**championName** | **String** |  |  |
|**championTransform** | **Integer** | This field is currently only utilized for Kayn&#39;s transformations. (Legal values: 0 - None, 1 - Slayer, 2 - Assassin) |  |
|**consumablesPurchased** | **Integer** |  |  |
|**damageDealtToBuildings** | **Integer** |  |  [optional] |
|**damageDealtToObjectives** | **Integer** |  |  |
|**damageDealtToTurrets** | **Integer** |  |  |
|**damageSelfMitigated** | **Integer** |  |  |
|**deaths** | **Integer** |  |  |
|**detectorWardsPlaced** | **Integer** |  |  |
|**doubleKills** | **Integer** |  |  |
|**dragonKills** | **Integer** |  |  |
|**firstBloodAssist** | **Boolean** |  |  |
|**firstBloodKill** | **Boolean** |  |  |
|**firstTowerAssist** | **Boolean** |  |  |
|**firstTowerKill** | **Boolean** |  |  |
|**gameEndedInEarlySurrender** | **Boolean** |  |  |
|**gameEndedInSurrender** | **Boolean** |  |  |
|**goldEarned** | **Integer** |  |  |
|**goldSpent** | **Integer** |  |  |
|**individualPosition** | **String** | Both individualPosition and teamPosition are computed by the game server and are different versions of the most likely position played by a player. The individualPosition is the best guess for which position the player actually played in isolation of anything else. The teamPosition is the best guess for which position the player actually played if we add the constraint that each team must have one top player, one jungle, one middle, etc. Generally the recommendation is to use the teamPosition field over the individualPosition field. |  |
|**inhibitorKills** | **Integer** |  |  |
|**inhibitorTakedowns** | **Integer** |  |  [optional] |
|**inhibitorsLost** | **Integer** |  |  [optional] |
|**item0** | **Integer** |  |  |
|**item1** | **Integer** |  |  |
|**item2** | **Integer** |  |  |
|**item3** | **Integer** |  |  |
|**item4** | **Integer** |  |  |
|**item5** | **Integer** |  |  |
|**item6** | **Integer** |  |  |
|**itemsPurchased** | **Integer** |  |  |
|**killingSprees** | **Integer** |  |  |
|**kills** | **Integer** |  |  |
|**lane** | **String** |  |  |
|**largestCriticalStrike** | **Integer** |  |  |
|**largestKillingSpree** | **Integer** |  |  |
|**largestMultiKill** | **Integer** |  |  |
|**longestTimeSpentLiving** | **Integer** |  |  |
|**magicDamageDealt** | **Integer** |  |  |
|**magicDamageDealtToChampions** | **Integer** |  |  |
|**magicDamageTaken** | **Integer** |  |  |
|**neutralMinionsKilled** | **Integer** |  |  |
|**nexusKills** | **Integer** |  |  |
|**nexusTakedowns** | **Integer** |  |  [optional] |
|**nexusLost** | **Integer** |  |  [optional] |
|**objectivesStolen** | **Integer** |  |  |
|**objectivesStolenAssists** | **Integer** |  |  |
|**participantId** | **Integer** |  |  |
|**pentaKills** | **Integer** |  |  |
|**perks** | [**MatchV5PerksDto**](MatchV5PerksDto.md) |  |  |
|**physicalDamageDealt** | **Integer** |  |  |
|**physicalDamageDealtToChampions** | **Integer** |  |  |
|**physicalDamageTaken** | **Integer** |  |  |
|**profileIcon** | **Integer** |  |  |
|**puuid** | **String** |  |  |
|**quadraKills** | **Integer** |  |  |
|**riotIdName** | **String** |  |  [optional] |
|**riotIdGameName** | **String** |  |  [optional] |
|**riotIdTagline** | **String** |  |  |
|**role** | **String** |  |  |
|**sightWardsBoughtInGame** | **Integer** |  |  |
|**spell1Casts** | **Integer** |  |  |
|**spell2Casts** | **Integer** |  |  |
|**spell3Casts** | **Integer** |  |  |
|**spell4Casts** | **Integer** |  |  |
|**summoner1Casts** | **Integer** |  |  |
|**summoner1Id** | **Integer** |  |  |
|**summoner2Casts** | **Integer** |  |  |
|**summoner2Id** | **Integer** |  |  |
|**summonerId** | **String** |  |  |
|**summonerLevel** | **Integer** |  |  |
|**summonerName** | **String** |  |  |
|**teamEarlySurrendered** | **Boolean** |  |  |
|**teamId** | **Integer** |  |  |
|**teamPosition** | **String** | Both individualPosition and teamPosition are computed by the game server and are different versions of the most likely position played by a player. The individualPosition is the best guess for which position the player actually played in isolation of anything else. The teamPosition is the best guess for which position the player actually played if we add the constraint that each team must have one top player, one jungle, one middle, etc. Generally the recommendation is to use the teamPosition field over the individualPosition field. |  |
|**timeCCingOthers** | **Integer** |  |  |
|**timePlayed** | **Integer** |  |  |
|**totalDamageDealt** | **Integer** |  |  |
|**totalDamageDealtToChampions** | **Integer** |  |  |
|**totalDamageShieldedOnTeammates** | **Integer** |  |  |
|**totalDamageTaken** | **Integer** |  |  |
|**totalHeal** | **Integer** |  |  |
|**totalHealsOnTeammates** | **Integer** |  |  |
|**totalMinionsKilled** | **Integer** |  |  |
|**totalTimeCCDealt** | **Integer** |  |  |
|**totalTimeSpentDead** | **Integer** |  |  |
|**totalUnitsHealed** | **Integer** |  |  |
|**tripleKills** | **Integer** |  |  |
|**trueDamageDealt** | **Integer** |  |  |
|**trueDamageDealtToChampions** | **Integer** |  |  |
|**trueDamageTaken** | **Integer** |  |  |
|**turretKills** | **Integer** |  |  |
|**turretTakedowns** | **Integer** |  |  [optional] |
|**turretsLost** | **Integer** |  |  [optional] |
|**unrealKills** | **Integer** |  |  |
|**visionScore** | **Integer** |  |  |
|**visionWardsBoughtInGame** | **Integer** |  |  |
|**wardsKilled** | **Integer** |  |  |
|**wardsPlaced** | **Integer** |  |  |
|**win** | **Boolean** |  |  |
|**allInPings** | **Integer** |  |  [optional] |
|**assistMePings** | **Integer** |  |  [optional] |
|**baitPings** | **Integer** |  |  [optional] |
|**basicPings** | **Integer** |  |  [optional] |
|**commandPings** | **Integer** |  |  [optional] |
|**dangerPings** | **Integer** |  |  [optional] |
|**enemyMissingPings** | **Integer** |  |  [optional] |
|**enemyVisionPings** | **Integer** |  |  [optional] |
|**getBackPings** | **Integer** |  |  [optional] |
|**holdPings** | **Integer** |  |  [optional] |
|**needVisionPings** | **Integer** |  |  [optional] |
|**onMyWayPings** | **Integer** |  |  [optional] |
|**pushPings** | **Integer** |  |  [optional] |
|**visionClearedPings** | **Integer** |  |  [optional] |
|**eligibleForProgression** | **Boolean** |  |  [optional] |
|**challenges** | [**MatchV5ParticipantChallenges**](MatchV5ParticipantChallenges.md) |  |  [optional] |
|**totalAllyJungleMinionsKilled** | **Integer** |  |  [optional] |
|**totalEnemyJungleMinionsKilled** | **Integer** |  |  [optional] |
|**playerAugment1** | **Integer** |  |  [optional] |
|**playerAugment2** | **Integer** |  |  [optional] |
|**playerAugment3** | **Integer** |  |  [optional] |
|**playerAugment4** | **Integer** |  |  [optional] |
|**playerSubteamId** | **Integer** |  |  [optional] |
|**subteamPlacement** | **Integer** |  |  [optional] |
|**placement** | **Integer** |  |  [optional] |
|**missions** | [**MatchV5ParticipantMissions**](MatchV5ParticipantMissions.md) |  |  [optional] |
|**playerScore0** | **Integer** |  |  [optional] |
|**playerScore1** | **Integer** |  |  [optional] |
|**playerScore10** | **Integer** |  |  [optional] |
|**playerScore11** | **Integer** |  |  [optional] |
|**playerScore2** | **Integer** |  |  [optional] |
|**playerScore3** | **Integer** |  |  [optional] |
|**playerScore4** | **Integer** |  |  [optional] |
|**playerScore5** | **Integer** |  |  [optional] |
|**playerScore6** | **Integer** |  |  [optional] |
|**playerScore7** | **Integer** |  |  [optional] |
|**playerScore8** | **Integer** |  |  [optional] |
|**playerScore9** | **Integer** |  |  [optional] |



