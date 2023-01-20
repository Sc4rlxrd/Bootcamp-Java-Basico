package facade;
import subsistema1.crm.Crmservice;
import subsistema2.cep.CepApi;

public class Facade {
    public void migraCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        Crmservice.gravarCliente(nome, cep, cidade, estado);

    }

   
}
