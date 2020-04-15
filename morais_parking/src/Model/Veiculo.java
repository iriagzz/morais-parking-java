package Model;

public class Veiculo {

	// Atributes
	private String proprietario; // criar uma classe proprietario
	private String placa;
	private String modelo;
	private CatVeiculos categoria;

	/*
	 * a prefer�ncia muda quando o gestor d� um set na categoria do ve�culo.
	 * 
	 */

	// Constructor
	
	public Veiculo(String proprietario, String placa, String modelo, CatVeiculos categoria) {
		this.proprietario = proprietario;
		this.placa = placa;
		this.modelo = modelo;
		this.categoria = categoria;
	}

	// Getters and Setters
	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public CatVeiculos getCategoria() {
		return categoria;
	}

	public void setCategoria(CatVeiculos categoria) {
		this.categoria = categoria;
	}

	// Methods
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Placa: " + placa + "\n");
		sb.append("Propriet�rio: " + proprietario + "\n");
		sb.append("Categoria: " + categoria + "\n");
		sb.append("Modelo: " + modelo + "\n");
		return sb.toString();
	}

}