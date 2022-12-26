package appPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Date momento;
	private StatusPedido status;
	private List<ItemPedido> carrinho = new ArrayList<>();

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public List<ItemPedido> getCarrinho() {
		return carrinho;
	}

	public void addItem(ItemPedido item) {
		carrinho.add(item);
	}

	public void removeItem(ItemPedido item) {
		carrinho.remove(item);
	}
	

	public Pedido(Date momento, StatusPedido status) {
		super();
		this.momento = momento;
		this.status = status;
	}

	public Double total() {
		Double soma = 0.0;
		for (ItemPedido x : carrinho) {
			soma += x.subTotal();
		}
		return soma;
	}
}
