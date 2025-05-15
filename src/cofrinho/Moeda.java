package cofrinho;

import java.util.Objects;

public abstract class Moeda {
	
	double valor;
	
	Moeda(double aValor) {
		valor = aValor;
	}
	
	// abstrata para tratar nas filhas
	abstract String info();
	
	@Override
	public String toString() {
		return "Moeda [valor=" + valor + "]";
	}

	// abstrata para tratar nas filhas
	abstract double converter();

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
}
