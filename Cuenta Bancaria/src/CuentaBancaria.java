public class CuentaBancaria {

	public static void main(String[] args) {

		double saldo = 1000.75;
		double cantidadARetirar = 250;
		double saldoActualizado = saldo - cantidadARetirar;
		double cantidadParaCadaAmigo = saldoActualizado / 3;
		boolean puedeComprarTicket = cantidadParaCadaAmigo >= 250;

		System.out.println("Saldo actualizado: " + saldoActualizado);
		System.out.println("Puede comprar ticket: " + puedeComprarTicket);
		System.out.println("Le di a cada amigo: " + cantidadParaCadaAmigo);
	}

}