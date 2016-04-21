package api_service.models;

/**
 * Created by joseph on 20/04/16.
 */
public class City{
 
    public Map<String, String[]> mapDistricts; // = new HashMap<String, String[]>();
 
 	// TODO: TROCAR OS UNDERLINES POR ESPAÇOS
    public City(){

    	this.mapDistricts = new HashMap<String, String[]>();

        this.mapDistricts.put("alto_branco", {"alto_branco", "louzeiro", "palmeira", "monte_santo", "bairro_universitario", "bodocongo"});
        mapDistricts.put("acacio_figueiredo", {"presidente_medici", "santa_cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("araxa",{"bairro_universitario", "bodocongo"});
        mapDistricts.put("bairro_das_cidades", {"tres_irmas", "malvinas", "bodocongo"});
        mapDistricts.put("bairro_das_nacoes", {"jardim_continental",  "louzeiro", "palmeira", "jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("bairro_universitario", {"bodocongo"});
        mapDistricts.put("bela_vista", {"bairro_universitario", "bodocongo"});
        mapDistricts.put("catole", {"estacao_velha", "sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("castelo_branco", {"santo antonio", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("centenario", {"pedregal", "bodocongo"});
        mapDistricts.put("centro", {"prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("cruzeiro", {"santa_rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("cuites", {"araxa","bairro_ universitario", "bodocongo"});
        mapDistricts.put("dinamerica", {"bodocongo"});
        mapDistricts.put("distrito_industrial", {"jardim_paulistano", "cruzeiro", "santa_rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("estacao_velha", {"sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("itarare", {"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim_continental",  {"louzeiro", "palmeira", "jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("jardim_paulistano", {"cruzeiro", "santa_rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim_tavares", {"alto_branco", "louzeiro ","palmeira", "monte_santo", "bairro_universitario", "bodocongo"});
        mapDistricts.put("jeremias", {"bairro_universitario", "bodocongo"});
        mapDistricts.put("jose_pinheiro ", {"centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("liberdade", {"quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("louzeiro", {"palmeira", "jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("malvinas", {"bodocongo"});
        mapDistricts.put("mirante", {"jose_pinheiro", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("monte_castelo", {"jose_pinheiro ", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("nova_brasilia", {"monte_castelo", "jose_pinheiro", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("novo_bodocongo", {"bairro_universitario", "bodocongo"});
        mapDistricts.put("palmeira", {"jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("prata", {"bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("pedregal", {"bodocongo"});
        mapDistricts.put("presidente_medici", {"santa_cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("quarenta", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("ramadinha", {"bodocongo"});
        mapDistricts.put("sandra_cavalcante", {"catole", "estacao_velha", "sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("santa_cruz", {"dinamerica", "bodocongo"});
        mapDistricts.put("santa_rosa", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("santa_terezinha",{"mirante","jose_pinheiro", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("santo antonio", {"centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("sao_jose", {"prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("serrotao", {"ramadinha", "bodocongo"});
        mapDistricts.put("tambor", {"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("tres_irmas", {"malvinas", "bodocongo"});
        mapDistricts.put("vila_cabral", {"sandra_cavalcante", "catole", "estacao_velha", "sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("velame", {"presidente_medici", "santa_cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("araxa",{"bairro_universitario", "bodocongo"});
        mapDistricts.put("alto_branco", {"alto_branco", "louzeiro", "palmeira", "monte_santo", "bairro_universitario", "bodocongo"});
        mapDistricts.put("acacio_figueiredo", {"presidente_medici", "santa_cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("bairro_das_cidades", {"tres_irmas", "malvinas", "bodocongo"});
        mapDistricts.put("bairro_das_nacoes", {"jardim_continental",  "louzeiro", "palmeira", "jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("bairro_universitario", {"bodocongo"});
        mapDistricts.put("bela_vista", {"bairro_universitario", "bodocongo"});
        mapDistricts.put("catole", {"estacao_velha", "sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("castelo_branco", {"santo antonio", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("centenario", {"pedregal", "bodocongo"});
        mapDistricts.put("centro", {"prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("cruzeiro", {"santa_rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("cuites", {"araxa","bairro_ universitario", "bodocongo"});
        mapDistricts.put("dinamerica", {"bodocongo"});
        mapDistricts.put("distrito_industrial", {"jardim_paulistano", "cruzeiro", "santa_rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("estacao_velha", {"sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("itarare", {"tambor", "liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim_continental",  {"louzeiro", "palmeira", "jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("jardim_paulistano", {"cruzeiro", "santa_rosa", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("jardim_tavares", {"alto_branco", "louzeiro ","palmeira", "monte_santo", "bairro_universitario", "bodocongo"});
        mapDistricts.put("jeremias", {"bairro_universitario", "bodocongo"});
        mapDistricts.put("jose_pinheiro ", {"centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("liberdade", {"quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("louzeiro", {"palmeira", "jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("malvinas", {"bodocongo"});
        mapDistricts.put("mirante", {"jose_pinheiro", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("monte_castelo", {"jose_pinheiro ", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("nova_brasilia", {"monte_castelo", "jose_pinheiro", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("novo_bodocongo", {"bairro_universitario", "bodocongo"});
        mapDistricts.put("palmeira", {"jeremias", "bairro_universitario", "bodocongo"});
        mapDistricts.put("prata", {"bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("pedregal", {"bodocongo"});
        mapDistricts.put("presidente_medici", {"santa_cruz", "dinamerica", "bodocongo"});
        mapDistricts.put("quarenta", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("ramadinha", {"bodocongo"});
        mapDistricts.put("sandra_cavalcante", {"catole", "estacao_velha", "sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("santa_cruz", {"dinamerica", "bodocongo"});
        mapDistricts.put("santa_rosa", {"centenario", "pedregal", "bodocongo"});
        mapDistricts.put("santa_terezinha",{"mirante","jose_pinheiro", "centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("santo antonio", {"centro", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("sao_jose", {"prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("serrotao", {"ramadinha", "bodocongo"});
        mapDistricts.put("tambor", {"liberdade", "quarenta", "centenario", "pedregal", "bodocongo"});
        mapDistricts.put("tres_irmas", {"malvinas", "bodocongo"});
        mapDistricts.put("vila_cabral", {"sandra_cavalcante", "catole", "estacao_velha", "sao_jose", "prata", "bela_vista", "bairro_universitario", "bodocongo"});
        mapDistricts.put("velame", {"presidente_medici", "santa_cruz", "dinamerica", "bodocongo"});
	

    } 
}
