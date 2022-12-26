package appPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class PedidoMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar cal = Calendar.getInstance();
		
		

		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("email: ");
		String email = sc.nextLine();

		System.out.print("Data de nascimento: (DD/MM/AAAA)");
		String data = sc.nextLine();


		System.out.println("Dados do pedido: ");
		System.out.println("Status: ");
		String status = sc.nextLine();
		StatusPedido stat = StatusPedido.valueOf(status.toUpperCase());
		Pedido pedido = new Pedido(cal.getTime(),stat);
		Cliente cliente = new Cliente(nome, email, sdf.parse(data),pedido);
		
		
		System.out.print("Quantos produtos para esse pedido? ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			sc.nextLine();
			System.out.println("Digite os dados do " + (i + 1) + " produto: ");
			System.out.print("Nome: ");
			String nomeP = sc.nextLine();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			Produto product = new Produto(nomeP, preco);
			pedido.addItem(new ItemPedido(quantidade, product));
		}
		
		System.out.print(cliente);
		
		
		
		sc.close();
	}

}
