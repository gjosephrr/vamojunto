package api_service.models;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by joseph on 20/04/16.
 */
public class City{

    public Map<String, String[]> mapDistricts; // = new HashMap<String, String[]>();

    public City(){

        this.mapDistricts = new HashMap<String, String[]>();

        this.mapDistricts.put("alto branco", new String[]{"alto branco", "louzeiro", "palmeira", "monte santo", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("acacio figueiredo",new String[] {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        this.mapDistricts.put("araxa",new String[]{"bairro universitario", "bodocongo"});
        this.mapDistricts.put("bairro das cidades",new String[] {"tres irmas", "malvinas", "bodocongo"});
        this.mapDistricts.put("bairro das nacoes", new String[]{"jardim continental",  "louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("bairro universitario", new String[]{"bodocongo"});
        this.mapDistricts.put("bela vista",new String[] {"bairro universitario", "bodocongo"});
        this.mapDistricts.put("catole", new String[]{"estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("castelo branco", new String[]{"santo antonio", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("centenario",new String[] {"pedregal", "bodocongo"});
        this.mapDistricts.put("centro", new String[]{"prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("cruzeiro", new String[]{"santa rosa", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("cuites", new String[]{"araxa","bairro universitario", "bodocongo"});
        this.mapDistricts.put("dinamerica", new String[]{"bodocongo"});
        this.mapDistricts.put("distrito industrial", new String[]{"jardim paulistano", "cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("estacao velha",new String[] {"sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("itarare",new String[] {"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("jardim continental",  new String[]{"louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("jardim paulistano",new String[] {"cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("jardim tavares", new String[]{"alto branco", "louzeiro ","palmeira", "monte santo", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("jeremias",new String[] {"bairro universitario", "bodocongo"});
        this.mapDistricts.put("jose pinheiro ", new String[]{"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("liberdade", new String[]{"quarenta", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("louzeiro", new String[]{"palmeira", "jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("malvinas", new String[]{"bodocongo"});
        this.mapDistricts.put("mirante",new String[] {"jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("monte castelo", new String[]{"jose pinheiro ", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("nova brasilia", new String[]{"monte castelo", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("novo bodocongo", new String[]{"bairro universitario", "bodocongo"});
        this.mapDistricts.put("palmeira", new String[]{"jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("prata", new String[]{"bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("pedregal", new String[]{"bodocongo"});
        this.mapDistricts.put("presidente medici", new String[]{"santa cruz", "dinamerica", "bodocongo"});
        this.mapDistricts.put("quarenta", new String[]{"centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("ramadinha", new String[]{"bodocongo"});
        this.mapDistricts.put("sandra cavalcante", new String[]{"catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("santa cruz", new String[]{"dinamerica", "bodocongo"});
        this.mapDistricts.put("santa rosa", new String[]{"centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("santa terezinha",new String[]{"mirante","jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("santo antonio", new String[]{"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("sao jose", new String[]{"prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("serrotao", new String[]{"ramadinha", "bodocongo"});
        this.mapDistricts.put("tambor",new String[] {"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("tres irmas", new String[]{"malvinas", "bodocongo"});
        this.mapDistricts.put("vila cabral",new String[] {"sandra cavalcante", "catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("velame",new String[] {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        this.mapDistricts.put("araxa",new String[]{"bairro universitario", "bodocongo"});
        this.mapDistricts.put("alto branco",new String[] {"alto branco", "louzeiro", "palmeira", "monte santo", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("acacio figueiredo",new String[] {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        this.mapDistricts.put("bairro das cidades", new String[]{"tres irmas", "malvinas", "bodocongo"});
        this.mapDistricts.put("bairro das nacoes", new String[]{"jardim continental",  "louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("bairro universitario", new String[]{"bodocongo"});
        this.mapDistricts.put("bela vista", new String[]{"bairro universitario", "bodocongo"});
        this.mapDistricts.put("catole", new String[]{"estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("castelo branco", new String[]{"santo antonio", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("centenario", new String[]{"pedregal", "bodocongo"});
        this.mapDistricts.put("centro", new String[]{"prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("cruzeiro", new String[]{"santa rosa", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("cuites", new String[]{"araxa","bairro universitario", "bodocongo"});
        this.mapDistricts.put("dinamerica", new String[]{"bodocongo"});
        this.mapDistricts.put("distrito industrial", new String[]{"jardim paulistano", "cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("estacao velha", new String[]{"sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("itarare", new String[]{"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("jardim continental",  new String[]{"louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("jardim paulistano", new String[]{"cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("jardim tavares", new String[]{"alto branco", "louzeiro ","palmeira", "monte santo", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("jeremias", new String[]{"bairro universitario", "bodocongo"});
        this.mapDistricts.put("jose pinheiro ", new String[]{"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("liberdade", new String[]{"quarenta", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("louzeiro", new String[]{"palmeira", "jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("malvinas", new String[]{"bodocongo"});
        this.mapDistricts.put("mirante", new String[]{"jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("monte castelo", new String[]{"jose pinheiro ", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("nova brasilia", new String[]{"monte castelo", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("novo bodocongo",new String[] {"bairro universitario", "bodocongo"});
        this.mapDistricts.put("palmeira", new String[]{"jeremias", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("prata", new String[]{"bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("pedregal",new String[] {"bodocongo"});
        this.mapDistricts.put("presidente medici", new String[]{"santa cruz", "dinamerica", "bodocongo"});
        this.mapDistricts.put("quarenta", new String[]{"centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("ramadinha",new String[] {"bodocongo"});
        this.mapDistricts.put("sandra cavalcante", new String[]{"catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("santa cruz", new String[]{"dinamerica", "bodocongo"});
        this.mapDistricts.put("santa rosa", new String[]{"centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("santa terezinha",new String[]{"mirante","jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("santo antonio", new String[]{"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("sao jose",new String[] {"prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("serrotao",new String[] {"ramadinha", "bodocongo"});
        this.mapDistricts.put("tambor",new String[] {"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        this.mapDistricts.put("tres irmas", new String[]{"malvinas", "bodocongo"});
        this.mapDistricts.put("vila cabral",new String[] {"sandra cavalcante", "catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        this.mapDistricts.put("velame",new String[] {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});


    }
}
