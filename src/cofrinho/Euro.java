package cofrinho;

public class Euro extends Moeda {
	
	Euro(double aValor) {
		super(aValor);
	}

	@Override
	String info() {
		return ("| Euro:  €$  "+valor+" |");
	}

	// Caso chamar o objeto direto segue as mesmas informações do método info
	@Override
	public String toString() {
		return info();
	}

	@Override
	double converter() {
		double TotalReal = valor*6.36; // Cotação do dia 05/12/2024
		return TotalReal;
	}

}
