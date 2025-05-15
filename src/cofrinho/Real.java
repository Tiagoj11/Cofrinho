package cofrinho;

public class Real extends Moeda {

	Real(double aValor) {
		super(aValor);
	}

	@Override
	String info() {
		return ("| Real:  R$  "+valor+" |");
	}
	
	@Override
	double converter() {
		double TotalReal = valor*1;
		return TotalReal;
	}

	// Caso chamar o objeto direto segue as mesmas informações do método info	
	@Override
	public String toString() {
		return info();
	}

}
