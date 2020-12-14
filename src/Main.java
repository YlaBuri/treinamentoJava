import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int op = 0;
		
		do {
			System.out.println("1-abrir conta");
			System.out.println("2-saque");
			System.out.println("3-deposito");
			System.out.println("4-transferencia");
			System.out.println("5-exibir dados");
			System.out.println("6-verificar rendimento");
			System.out.println("0-sair");
			op = sc.nextInt();

			switch (op) {
			case 1:
				novaConta();	
				break;
			case 2:
				realizarSaque();
				break;
			case 3:
				realizarDeposito();
				break;
			case 4:
				realizarTransferencia();
				break;
			case 5:
				break;
			default:
				break;
			}
		}while(op!=0);

	}

	public static void novaConta(){
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("CPF:");
		String cpf = sc.nextLine();
		System.out.println("Tipo de conta:\n1-conta poupança\n2-conta corrente");
		int conta= sc.nextInt();

		

		System.out.println("Deseja fazer um deposito inicial?\n1-sim\n2-não");
		int resp = sc.nextInt();
		float despositoInicial = 0;
		if(resp==1) {
			despositoInicial = sc.nextFloat();
		}
		Conta novaConta = null;
		if(conta==1) {
			novaConta = new ContaPoupanca(nome, cpf, 1, despositoInicial, 0);
		}else{
			novaConta = new ContaCorrente(nome, cpf, 1, despositoInicial, 0);
		}
		Banco.abrirConta(novaConta);
	}

	public static void realizarSaque() {
		System.out.println("cpf:");
		String cpf = sc.nextLine();
		System.out.println("Valor:");
		float valor = sc.nextFloat();
		Conta contaSaque = Banco.buscarConta(cpf);
		Banco.realizarSaque(contaSaque, valor);
	}

	public static void realizarDeposito() {
		System.out.println("cpf:");
		String cpf = sc.nextLine();
		System.out.println("Valor:");
		float valor = sc.nextFloat();
		Conta contaDeposito = Banco.buscarConta(cpf);
		Banco.realizarSaque(contaDeposito, valor);
	}

	public static void realizarTransferencia() {
		System.out.println("cpf:");
		String cpf1 = sc.nextLine();
		System.out.println("cpf do destinatario:");
		String cpf2 = sc.nextLine();
		Conta c1 = Banco.buscarConta(cpf1);
		Conta c2 = Banco.buscarConta(cpf2);

		System.out.println("Valor:");
		float valor = sc.nextFloat();

		Banco.realizarTrasnferencia(c1, c2, valor);

	}
	
	public void imprimir() {
		System.out.println("cpf:");
		String cpf = sc.nextLine();
		Conta conta = Banco.buscarConta(cpf);
		Banco.imprimir(conta);
	}
}
