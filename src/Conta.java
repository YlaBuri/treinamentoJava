
public class Conta {
	private String nomeCliente;
	private String cpf; 
	private int númeroConta;
	private float saldo;
	private float limite;
	private TipoContaEnum tipoConta;
	
	public Conta(String nomeCliente, String cpf, int númeroConta, float saldo, float limite, TipoContaEnum tipoConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.númeroConta = númeroConta;
		this.saldo = saldo;
		this.limite = limite;
		this.tipoConta = tipoConta;
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

	public TipoContaEnum getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoContaEnum tipoConta) {
		this.tipoConta = tipoConta;
	}

	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", númeroConta=" + númeroConta + ", saldo="
				+ saldo + ", limite=" + limite + ", tipoConta=" + tipoConta + "]";
	}
	
	
	
}
