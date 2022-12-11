package projeto_oo;

public class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private int numPortas;
	private double valor;

	public Veiculo(String marca, String modelo, String cor, int ano, int numPortas, double valor) {
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.numPortas = numPortas;
		this.cor = cor;
		this.valor = valor;

	}

	@Override
	public String toString() {
		return "Carro:" + modelo + "|Marca:" + marca + "|Quantidade de portas:" + numPortas + "| cor:" + cor + "|Valor:"
				+ valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}