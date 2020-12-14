
public abstract class Conta {
	private String nomeCliente;
	private String cpf; 
	private int númeroConta;
	private float saldo;
	private float limite;
	private float rendimento;
	//private TipoContaEnum tipoConta;
	
	public Conta(String nomeCliente, String cpf, int númeroConta, float saldo, float limite) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.númeroConta = númeroConta;
		this.saldo = saldo;
		this.limite = limite;
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNúmeroConta() {
		return númeroConta;
	}

	public void setNúmeroConta(int númeroConta) {
		this.númeroConta = númeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	public abstract float calcularRendimento(float saldo);

	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", númeroConta=" + númeroConta + ", saldo="
				+ saldo + ", limite=" + limite + "]";
	}
	
	
	
}
