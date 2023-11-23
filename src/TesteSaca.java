
public class TesteSaca {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente(1123, 1337);

		contaCorrente.deposita(200.0);
		contaCorrente.saca(210.0);

		System.out.println("Conta Corrente - Saldo: " + contaCorrente.getSaldo());

	}

}
