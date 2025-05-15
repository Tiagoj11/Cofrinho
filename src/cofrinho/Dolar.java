package cofrinho;

public class Dolar extends Moeda {

	Dolar(double aValor) {
		super(aValor);
	}

	@Override
	String info() {
		return ("| Dolar: US$ "+valor+" |");
	}

	// Caso chamar o objeto direto segue as mesmas informações do métod info	
	@Override
	public String toString() {
		return info();
	}

	@Override
	double converter() {
		double TotalReal = valor*6.01; // Cotação do dia 05/12/2024
		return TotalReal;
	}

}
