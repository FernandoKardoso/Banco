import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ag�ncia Banc�ria");
		
		System.out.print("Entre o nome do cliente: ");
		cliente.setNome(entrada.nextLine());
		
		System.out.print("Entre o cpf do cliente: ");
		cliente.setCpf(entrada.nextLong());
		entrada.nextLine();
		
		System.out.print("Entre o rg do cliente: ");
		cliente.setRg(entrada.nextLong());
		entrada.nextLine();
		
		System.out.print("Entre o endere�o do cliente: ");
		cliente.setEndereco(entrada.nextLine());
		
		System.out.print("Entre o telefone do cliente: ");
		cliente.setTelefone(entrada.nextLong());
		entrada.nextLine();
		
		System.out.print("Entre a renda mensal do cliente: ");
		cliente.setRendaMensal(entrada.nextDouble());
		entrada.nextLine();
		
		System.out.print("Entre a ag�ncia da conta banc�ria: ");
		int agencia = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Entre o n�mero da conta banc�ria: ");
		int numero = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Entre o saldo inicial: ");
		double saldo = entrada.nextDouble();
		entrada.nextLine();
		
		conta = new Conta(agencia, numero, cliente, saldo);
		
		System.out.println("Conta corrente: ");
		System.out.println(conta);
		
		entrada.close();
	}

}
