import java.util.ArrayList;

public class Banco {
	static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static void abrirConta(Conta c) {
		contas.add(c);
	}
	
	public static void realizarSaque(Conta c, float valor){
		float v = c.getSaldo() - valor;
		c.setSaldo(v);
	}
	
	public static void realizarDeposito(Conta c, float valor) {
		float v = c.getSaldo() + valor;
		c.setSaldo(v);
	}
	
	public static void realizarTrasnferencia(Conta c1, Conta c2, float valor) {
		if(c1.getTipoConta() == c2.getTipoConta()) {
		
			float v = c1.getSaldo() - valor;
			c1.setSaldo(v);
			
			float v2 = c2.getSaldo() + valor;
			c2.setSaldo(v2);
		}else {
			System.out.println("Não é possivel realizar transferencia entre contas de tipos diferentes");
		}
	}
	
	public static Conta buscarConta(String cpf) {
		Conta busca = null;
		
		for (Conta conta : contas) {
			if(conta.getCpf() == cpf) {
				busca = conta;
			}
		}
		return busca;
		
	}
}
