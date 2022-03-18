package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int contadorAsientos = 0;
		for(Asiento asiento:asientos) {
			if(asiento!=null) {
				contadorAsientos++;
			}
		}
		return contadorAsientos;
		
	}
	
	public String verificarIntegridad() {
		if(motor.registro == this.registro) {
			int registro = this.registro;
			for(Asiento asiento:asientos) {
				if(asiento.registro!=registro) {
					return "Las piezas no son originales";
				}else {
					return "Auto original";
				}
			}
		}else {
			return "Las piezas no son originales";
		}
		return "";
	}
}
