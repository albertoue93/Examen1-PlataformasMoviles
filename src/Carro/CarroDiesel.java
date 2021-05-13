package Carro;

public class CarroDiesel extends Carro {

	@Override
	public String tipo() {
		//inyección de dependencia
		return "Carro de Diesel";
	}

}
