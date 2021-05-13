package Carro;

public class CarroGasolina extends Carro {

	@Override
	public String tipo() {
		//inyección de dependencia
		return "Carro de Gasolina";
	}

}
