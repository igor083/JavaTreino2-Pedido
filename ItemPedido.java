package appPedido;

public class ItemPedido {
	private Integer quantidade;
	private Double precoPredido;
	private Produto product;

	public Integer getQuantidade() {
		return quantidade;
	}

	public Produto getProduct() {
		return product;
	}

	public ItemPedido(Integer quantidade, Produto product) {

		this.quantidade = quantidade;
		this.product = product;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoPredido() {
		return precoPredido;
	}

	public void setPrecoPredido(Double precoPredido) {
		this.precoPredido = precoPredido;
	}

	public Double subTotal() {

		return product.getPreco() * quantidade;
	}
}
