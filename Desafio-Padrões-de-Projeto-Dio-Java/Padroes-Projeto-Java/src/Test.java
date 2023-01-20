import facade.Facade;
import singleton.SingletonAnsioso;
import singleton.SingletonHolder;
import singleton.SingletonPreguicoso;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoHumano;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {
		
		// Singleton
		
		SingletonPreguicoso lazy = SingletonPreguicoso.getIntsancia();
		System.out.println(lazy);
		lazy = SingletonPreguicoso.getIntsancia();
		System.out.println(lazy);
		
		SingletonAnsioso eager = SingletonAnsioso.getInstancia();
		System.out.println(eager);
		eager = SingletonAnsioso.getInstancia();
		System.out.println(eager);
		
		SingletonHolder lazyHolder = SingletonHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento humano = new ComportamentoHumano();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
        robo.setComportamento(humano);
        robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migraCliente("Guilherme", "14801788");
	}
}
