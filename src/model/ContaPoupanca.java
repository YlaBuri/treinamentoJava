package model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String nomeCliente, String cpf, int n�meroConta, float saldo, float limite) {
		super(nomeCliente, cpf, n�meroConta, saldo, limite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularRendimento(float saldo) {
		float r = (float) (saldo * 0.15); 
		return r;
	}
}
