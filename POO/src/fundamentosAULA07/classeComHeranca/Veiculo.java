package fundamentosAULA07.classeComHeranca;

public class Veiculo {
// classe Pai
	String modelo;
	String placa;
	Integer anoFabricacao;
	// Uma pessoa proprietario relacao de heranca sem ligacao.
	Pessoa proprietario;
	//Gera a impressao do valor sem ele eé escrito a area de memoria.
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", anoFabricacao=" + anoFabricacao + ", proprietario="
				+ proprietario + "]";
	}
	
}
