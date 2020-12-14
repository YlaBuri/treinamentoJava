
public class ContaCorrente extends Conta{

	public ContaCorrente(String nomeCliente, String cpf, int númeroConta, float saldo, float limite) {
		super(nomeCliente, cpf, númeroConta, saldo, limite);
	}

	
	@Override
	public float calcularRendimento(float saldo) {
		float r = (float) (saldo * 0.2); 
		return r;
	}
}
