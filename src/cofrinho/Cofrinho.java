package cofrinho;

import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); 
	private double valTotal;
	
	public void adicionar(Moeda aMoeda) {
		listaMoedas.add(aMoeda);
	}
	
	public void remover(Moeda aMoeda) {
		listaMoedas.remove(aMoeda);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(listaMoedas, valTotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cofrinho other = (Cofrinho) obj;
		return Objects.equals(listaMoedas, other.listaMoedas)
				&& Double.doubleToLongBits(valTotal) == Double.doubleToLongBits(other.valTotal);
	}

	public void listagemMoedas() {		
		
		for (Moeda aMoeda : listaMoedas) {
			System.out.println(aMoeda.info());
		}
	}
	
	public void totalConvertido() {
		valTotal = 0;
		
		for (Moeda aMoeda : listaMoedas) {			
			valTotal += aMoeda.converter();
		}
		System.out.println("| Valor total em Real:  R$ "+valTotal+" |");		
	}

	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}
}
