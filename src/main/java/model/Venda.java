package model;

import java.math.BigDecimal;

public class Venda {
	
	private Long operacao;
	private Long Cliente;
	private Integer quantidadeIngressos;
	private BigDecimal valorTotal;
	private String status;
	public Long getOperacao() {
		return operacao;
	}
	public void setOperacao(Long operacao) {
		this.operacao = operacao;
	}
	public Long getCliente() {
		return Cliente;
	}
	public void setCliente(Long cliente) {
		Cliente = cliente;
	}
	public Integer getQuantidadeIngressos() {
		return quantidadeIngressos;
	}
	public void setQuantidadeIngressos(Integer quantidadeIngressos) {
		this.quantidadeIngressos = quantidadeIngressos;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Venda [operacao=" + operacao + ", Cliente=" + Cliente + ", quantidadeIngressos=" + quantidadeIngressos
				+ ", valorTotal=" + valorTotal + ", status=" + status + ", getOperacao()=" + getOperacao()
				+ ", getCliente()=" + getCliente() + ", getQuantidadeIngressos()=" + getQuantidadeIngressos()
				+ ", getValorTotal()=" + getValorTotal() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";

	
	}
	


	public Venda(Long operacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal) {
		this.operacao = operacao;
		Cliente = cliente;
		this.quantidadeIngressos = quantidadeIngressos;
		this.valorTotal = valorTotal;
	}
	public Venda() {
		// TODO Auto-generated constructor stub
	}
	
}
