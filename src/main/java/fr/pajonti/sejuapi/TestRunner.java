package fr.pajonti.sejuapi;

import com.google.gson.Gson;
import fr.pajonti.sejuapi.dto.account.AccountDTO;
import fr.pajonti.sejuapi.dto.champion.ChampionInfo;
import fr.pajonti.sejuapi.dto.clash.PlayerDTO;
import fr.pajonti.sejuapi.dto.lolchallenges.ChallengeConfigInfoDTO;
import fr.pajonti.sejuapi.dto.match.MatchDTO;
import fr.pajonti.sejuapi.enums.league.QueueID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestRunner {
    private static final Logger logger= LoggerFactory.getLogger(TestRunner.class);

    public static void main(String[] args) throws IOException {
        logger.info("Example log from {}", TestRunner.class.getSimpleName());

        AccountDTO dto = new Gson().fromJson("{\"puuid\": \"agagou\"}", AccountDTO.class);
        System.out.println(dto);

        ChampionInfo cifo = new Gson().fromJson("{\"freeChampionIds\":[5,6,9,24,30,48,50,61,74,81,105,133,136,200,202,267,498,518,526,897],\"freeChampionIdsForNewPlayers\":[222,254,33,82,131,350,54,17,18,37,51,145,134,89,875,80,115,91,113,112],\"maxNewPlayerLevel\":10}", ChampionInfo.class);
        System.out.println(cifo);

        PlayerDTO pdto = new Gson().fromJson("{\"position\": 'JUNGLE'}", PlayerDTO.class);
        System.out.println(pdto);

        URL url = new URL("https://europe.api.riotgames.com/lol/match/v5/matches/EUW1_6856268103?api_key=RGAPI-04f1a4c5-3c70-4745-b15f-7b5ef978ac12");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        con.setRequestProperty("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
        int status = con.getResponseCode();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();

        MatchDTO match = new Gson().fromJson(content.toString(), MatchDTO.class);
        System.out.println(content.toString());
    }
}
