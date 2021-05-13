package Carro;

import Interfaces.IMotor;
import Interfaces.IRelacionesDiferenciales;
import Interfaces.ISuspencion;

public abstract class Carro implements IMotor, IRelacionesDiferenciales, ISuspencion {
	
	//Inmutable
	public final void tipoCarroOffRoad() {
		System.out.println(tipo());
	}

}
