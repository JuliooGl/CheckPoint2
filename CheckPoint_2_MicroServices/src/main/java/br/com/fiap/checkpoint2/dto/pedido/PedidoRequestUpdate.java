package br.com.fiap.checkpoint2.dto.pedido;

import java.time.LocalDate;

public class PedidoRequestUpdate {

	private Long numero_pedido;
	
	private Long codigo_cliente;
	private LocalDate data_pedido;
	
	public Long getnumero_pedido() {
		return numero_pedido;
	}
	public void setnumero_pedido(Long numero_pedido) {
		this.numero_pedido = numero_pedido;
	}
	public Long getcodigo_cliente() {
		return codigo_cliente;
	}
	public void setcodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	public LocalDate getdata_pedido() {
		return data_pedido;
	}
	public void setdata_pedido(LocalDate data_pedido) {
		this.data_pedido = data_pedido;
	}
	
	
}
