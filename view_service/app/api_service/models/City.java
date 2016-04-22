package api_service.models;

/**
 * Created by joseph on 20/04/16.
 */
public class City{
 
    public Map<String, String[]> mapDistricts; // = new HashMap<String, String[]>();

    public City(){

    	this.mapDistricts = new HashMap<String, String[]>();

        this.mapDistricts.put("alto branco", {"alto branco", "louzeiro", "palmeira", "monte santo", "bairro universitario", "bodocongo"});
        mapDistricts.put("acacio figueiredo", {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("araxa",{"bairro universitario", "bodocongo"});
        mapDistricts.put("bairro das cidades", {"tres irmas", "malvinas", "bodocongo"});
        mapDistricts.put("bairro das nacoes", {"jardim continental",  "louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("bairro universitario", {"bodocongo"});
        mapDistricts.put("bela vista", {"bairro universitario", "bodocongo"});
        mapDistricts.put("catole", {"estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("castelo branco", {"santo antonio", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("centenario", {"pedregal", "bodocongo"});
        mapDistricts.put("centro", {"prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("cruzeiro", {"santa rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("cuites", {"araxa","bairro universitario", "bodocongo"});
        mapDistricts.put("dinamerica", {"bodocongo"});
        mapDistricts.put("distrito industrial", {"jardim paulistano", "cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("estacao velha", {"sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("itarare", {"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim continental",  {"louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("jardim paulistano", {"cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim tavares", {"alto branco", "louzeiro ","palmeira", "monte santo", "bairro universitario", "bodocongo"});
        mapDistricts.put("jeremias", {"bairro universitario", "bodocongo"});
        mapDistricts.put("jose pinheiro ", {"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("liberdade", {"quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("louzeiro", {"palmeira", "jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("malvinas", {"bodocongo"});
        mapDistricts.put("mirante", {"jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("monte castelo", {"jose pinheiro ", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("nova brasilia", {"monte castelo", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("novo bodocongo", {"bairro universitario", "bodocongo"});
        mapDistricts.put("palmeira", {"jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("prata", {"bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("pedregal", {"bodocongo"});
        mapDistricts.put("presidente medici", {"santa cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("quarenta", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("ramadinha", {"bodocongo"});
        mapDistricts.put("sandra cavalcante", {"catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("santa cruz", {"dinamerica", "bodocongo"});
        mapDistricts.put("santa rosa", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("santa terezinha",{"mirante","jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("santo antonio", {"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("sao jose", {"prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("serrotao", {"ramadinha", "bodocongo"});
        mapDistricts.put("tambor", {"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("tres irmas", {"malvinas", "bodocongo"});
        mapDistricts.put("vila cabral", {"sandra cavalcante", "catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("velame", {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("araxa",{"bairro universitario", "bodocongo"});
        mapDistricts.put("alto branco", {"alto branco", "louzeiro", "palmeira", "monte santo", "bairro universitario", "bodocongo"});
        mapDistricts.put("acacio figueiredo", {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("bairro das cidades", {"tres irmas", "malvinas", "bodocongo"});
        mapDistricts.put("bairro das nacoes", {"jardim continental",  "louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("bairro universitario", {"bodocongo"});
        mapDistricts.put("bela vista", {"bairro universitario", "bodocongo"});
        mapDistricts.put("catole", {"estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("castelo branco", {"santo antonio", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("centenario", {"pedregal", "bodocongo"});
        mapDistricts.put("centro", {"prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("cruzeiro", {"santa rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("cuites", {"araxa","bairro universitario", "bodocongo"});
        mapDistricts.put("dinamerica", {"bodocongo"});
        mapDistricts.put("distrito industrial", {"jardim paulistano", "cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("estacao velha", {"sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("itarare", {"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim continental",  {"louzeiro", "palmeira", "jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("jardim paulistano", {"cruzeiro", "santa rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim tavares", {"alto branco", "louzeiro ","palmeira", "monte santo", "bairro universitario", "bodocongo"});
        mapDistricts.put("jeremias", {"bairro universitario", "bodocongo"});
        mapDistricts.put("jose pinheiro ", {"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("liberdade", {"quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("louzeiro", {"palmeira", "jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("malvinas", {"bodocongo"});
        mapDistricts.put("mirante", {"jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("monte castelo", {"jose pinheiro ", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("nova brasilia", {"monte castelo", "jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("novo bodocongo", {"bairro universitario", "bodocongo"});
        mapDistricts.put("palmeira", {"jeremias", "bairro universitario", "bodocongo"});
        mapDistricts.put("prata", {"bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("pedregal", {"bodocongo"});
        mapDistricts.put("presidente medici", {"santa cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("quarenta", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("ramadinha", {"bodocongo"});
        mapDistricts.put("sandra cavalcante", {"catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("santa cruz", {"dinamerica", "bodocongo"});
        mapDistricts.put("santa rosa", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("santa terezinha",{"mirante","jose pinheiro", "centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("santo antonio", {"centro", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("sao jose", {"prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("serrotao", {"ramadinha", "bodocongo"});
        mapDistricts.put("tambor", {"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("tres irmas", {"malvinas", "bodocongo"});
        mapDistricts.put("vila cabral", {"sandra cavalcante", "catole", "estacao velha", "sao jose", "prata", "bela vista", "bairro universitario", "bodocongo"});
        mapDistricts.put("velame", {"presidente medici", "santa cruz", "dinamerica", "bodocongo"});
	

    } 
}
