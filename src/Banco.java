import java.util.ArrayList;

public class Banco {
	static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static void abrirConta(Conta c) {
		int numero = contas.size()+1;
		c.setNúmeroConta(numero);
		contas.add(c);
	}
	
	public static void realizarSaque(Conta c, float valor){
		if(valor > c.getLimite()) {
			System.out.println("Valor maior que o limite");
		}else {
			float v = c.getSaldo() - valor;
			c.setSaldo(v);
		}
	}
	
	public static void realizarDeposito(Conta c, float valor) {
		float v = c.getSaldo() + valor;
		c.setSaldo(v);
	}
	
	public static void realizarTrasnferencia(Conta c1, Conta c2, float valor) {
		//if(c1.getTipoConta() == c2.getTipoConta()) {
			realizarSaque(c1, valor);		
			
			realizarDeposito(c2, valor);

//		}else {
//			System.out.println("Não é possivel realizar transferencia entre contas de tipos diferentes");
//		}
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
	
	public void atualizarLimite(Conta c) {
		if(c.getSaldo()>500) {
			c.setLimite(300);
		}else if(c.getSaldo()<=300) {
			c.setLimite(100);
		}
	}
	
	public static void imprimir(Conta c) {
		c.toString();
	}
}
