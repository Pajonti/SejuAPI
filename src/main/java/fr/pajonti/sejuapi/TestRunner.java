package fr.pajonti.sejuapi;

import com.google.gson.Gson;
import fr.pajonti.sejuapi.dto.account.AccountDTO;
import fr.pajonti.sejuapi.dto.champion.ChampionInfo;
import fr.pajonti.sejuapi.dto.clash.PlayerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRunner {
    private static final Logger logger= LoggerFactory.getLogger(TestRunner.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", TestRunner.class.getSimpleName());

        AccountDTO dto = new Gson().fromJson("{\"puuid\": \"agagou\"}", AccountDTO.class);
        System.out.println(dto);

        ChampionInfo cifo = new Gson().fromJson("{\"freeChampionIds\":[5,6,9,24,30,48,50,61,74,81,105,133,136,200,202,267,498,518,526,897],\"freeChampionIdsForNewPlayers\":[222,254,33,82,131,350,54,17,18,37,51,145,134,89,875,80,115,91,113,112],\"maxNewPlayerLevel\":10}", ChampionInfo.class);
        System.out.println(cifo);

        PlayerDTO pdto = new Gson().fromJson("{\"position\": 'JUNGLE'}", PlayerDTO.class);
        System.out.println(pdto);
    }
}
