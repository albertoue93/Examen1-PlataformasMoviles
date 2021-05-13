package Carro;

import Interfaces.IMotor;

public class EnsamblarCarros {
	
	private final IMotor motor;
	
	public EnsamblarCarros(IMotor motor) {
		this.motor = motor;
	}
	
	public void runEnsamble() {
		System.out.print("Combinaciones Motor tipo: "+ motor.tipo());
	}

}
