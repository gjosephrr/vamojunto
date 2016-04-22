package api_service.models;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by joseph on 20/04/16.
 */
public class City{

    private static Map<String, String[]> mapDistricts;

    static{
    	Map<String, String[]> tempMap = new HashMap<String, String[]>();

        tempMap.put("acacio figueiredo", new String[]{"acacio figueiredo", "presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        tempMap.put("alto branco", new String[]{"alto branco", "louzeiro", "palmeira", "monte santo", "bairro universitario", "bodocongo"});
        tempMap.put("araxa", new String[]{"araxa", "bairro universitario", "bodocongo"});
        tempMap.put("bairro das cidades", new String[]{"bairro das cidades", "tres irmas", "malvinas", "bodocongo"});
        tempMap.put("bairro das nacoes", new String[]{"bairro das nacoes", "jardim continental", "louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        tempMap.put("bairro universitario", new String[]{"bairro universitario", "bodocongo"});
        tempMap.put("bela vista", new String[]{"bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("castelo branco", new String[]{"castelo branco", "santo antonio", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("catole", new String[]{"catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("centenario", new String[]{"centenario", "pedregal", "bodocongo"});
        tempMap.put("centro", new String[]{"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("cruzeiro", new String[]{"cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        tempMap.put("cuites", new String[]{"cuites", "araxa", "bairro universitario", "bodocongo"});
        tempMap.put("dinamerica", new String[]{"dinamerica", "bodocongo"});
        tempMap.put("distrito industrial", new String[]{"distrito industrial", "jardim paulistano", "cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        tempMap.put("estacao velha", new String[]{"estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("itarare", new String[]{"itarare", "tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        tempMap.put("jardim continental", new String[]{"jardim continental", "louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        tempMap.put("jardim paulistano", new String[]{"jardim paulistano", "cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        tempMap.put("jardim tavares", new String[]{"jardim tavares", "alto branco", "louzeiro ", "palmeira", "monte santo", "bairro universitario", "bodocongo"});
        tempMap.put("jeremias", new String[]{"jeremias", "bairro universitario", "bodocongo"});
        tempMap.put("jose pinheiro", new String[]{"jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("liberdade", new String[]{"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        tempMap.put("louzeiro", new String[]{"louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        tempMap.put("malvinas", new String[]{"malvinas", "bodocongo"});
        tempMap.put("mirante", new String[]{"mirante", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("monte castelo", new String[]{"monte castelo", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("nova brasilia", new String[]{"nova brasilia", "monte castelo", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("novo bodocongo", new String[]{"novo bodocongo", "bairro universitario", "bodocongo"});
        tempMap.put("palmeira", new String[]{"palmeira", "jeremias", "bairro universitario", "bodocongo"});
        tempMap.put("pedregal", new String[]{"pedregal", "bodocongo"});
        tempMap.put("prata", new String[]{"prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("presidente medici", new String[]{"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        tempMap.put("quarenta", new String[]{"quarenta", "centenario", "pedregal", "bodocongo"});
        tempMap.put("ramadinha", new String[]{"ramadinha", "bodocongo"});
        tempMap.put("sandra cavalcante", new String[]{"sandra cavalcante", "catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("santa cruz", new String[]{"santa cruz", "dinamerica", "bodocongo"});
        tempMap.put("santa rosa", new String[]{"santa rosa", "centenario", "pedregal", "bodocongo"});
        tempMap.put("santa terezinha", new String[]{"santa terezinha", "mirante", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("santo antonio", new String[]{"santo antonio", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("sao jose", new String[]{"sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        tempMap.put("serrotao", new String[]{"serrotao", "ramadinha", "bodocongo"});
        tempMap.put("tambor", new String[]{"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        tempMap.put("tres irmas", new String[]{"tres irmas", "malvinas", "bodocongo"});
        tempMap.put("velame", new String[]{"velame", "presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        tempMap.put("vila cabral", new String[]{"vila cabral", "sandra cavalcante", "catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});

        mapDistricts = Collections.unmodifiableMap(tempMap);
    }

    public static String[] getTrajectory(String origin){
    	return mapDistricts.get(origin);
    }
}
