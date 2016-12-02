package paquete;

public class Cliente {

	private String id, nombre, apellido; private double saldo;
	
	public Cliente(String id,String nombre,String apellidos,double saldo){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellidos; this.saldo = saldo;
	}
	
	public String getId(){ return id;
	}
	public String getNombre() { return(nombre);
	}
	public String getApellido() { return(apellido);
	}
	public double getSaldo() { return(saldo);
	}
	public double getSaldoSinSigno() { return(Math.abs(saldo));
	}
}

