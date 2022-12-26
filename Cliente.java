package appPedido;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date data;
	private Pedido pedido;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Cliente(String nome, String email, Date data,Pedido pedido) {
	
		this.nome = nome;
		this.email = email;
		this.data = data;
		this.pedido=pedido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sumario do pedido: \n");
		sb.append("Hora do pedido: ");
		sb.append(pedido.getMomento()+"\n");
		sb.append("Status do pedido: ");
		sb.append(pedido.getStatus()+"\n");
		sb.append("Cliente: "+ nome + " " + data + " - " + email+"\n");
		sb.append("Itens do pedidos:\n");
		
		for(ItemPedido x: pedido.getCarrinho()) {
			sb.append(x.getProduct().getNome()+ ", $");
			sb.append(x.getProduct().getPreco()+ ", $");
			sb.append(x.subTotal()+ "\n");
		}
		sb.append("Valor total: $"+pedido.total());
		return sb.toString();

		
		
	}
}
