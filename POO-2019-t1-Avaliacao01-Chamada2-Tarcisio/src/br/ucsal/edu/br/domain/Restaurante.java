package br.ucsal.edu.br.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurante extends PontoTuristico {

	private List<String> tiposComidas = new ArrayList<>();
	private ChefeCozinha masterchef;

	public Restaurante(String logradouro, String bairro, String nome, List<String> tiposComidas,
			ChefeCozinha masterchef) {
		super(logradouro, bairro, nome);
		this.tiposComidas = tiposComidas;
		this.masterchef = masterchef;
	}

	public List<String> getTiposComidas() {
		return tiposComidas;
	}

	public void setTiposComidas(List<String> tiposComidas) {
		this.tiposComidas = tiposComidas;
	}

	public ChefeCozinha getMasterchef() {
		return masterchef;
	}

	public void setMasterchef(ChefeCozinha masterchef) {
		this.masterchef = masterchef;
	}

	@Override
	public String toString() {
		return "Restaurante [tiposComidas=" + tiposComidas + ", masterchef=" + masterchef + "]";
	}
	
}
