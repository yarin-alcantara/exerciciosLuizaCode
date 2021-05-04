package bancoLuizaCode;

import java.math.BigDecimal;

public class Conta {

	private Cliente titular;
	private int agencia;
	private int numConta;
	private BigDecimal saldoConta = new BigDecimal("00.00");
	
	public Conta(Cliente titular, int numConta, int agencia) {
		this.titular = titular;
		this.numConta = numConta;
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public BigDecimal getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(BigDecimal saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public void sacar(BigDecimal valor) throws Exception{
		if (valor.compareTo(saldoConta)>0) {
			throw new Exception ("Você não possui saldo suficiente!!");
		}else 
			saldoConta = saldoConta.subtract(valor);
	}
	public void depositar(BigDecimal valor) {
		saldoConta = saldoConta.add(valor);
	}
	
	
}
