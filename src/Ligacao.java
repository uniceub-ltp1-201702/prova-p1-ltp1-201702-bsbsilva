import java.time.LocalDateTime;

public class Ligacao {
	private int codigo;
	private String  telDestino;
	private LocalDateTime dataHoraIn�cio;
	private LocalDateTime dataHoraFim;
	private String cidadeDestino;
	private String ufDestino;
	private Cliente cliente;
	
	
	
	//METODO CONSTRUTOR
	public Ligacao(int codigo, String telDestino, LocalDateTime dataHoraIn�cio, LocalDateTime dataHoraFim,
			String cidadeDestino, String ufDestino, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.telDestino = telDestino;
		this.dataHoraIn�cio = dataHoraIn�cio;
		this.dataHoraFim = dataHoraFim;
		this.cidadeDestino = cidadeDestino;
		this.ufDestino = ufDestino;
		this.cliente = cliente;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTelDestino() {
		return telDestino;
	}



	public void setTelDestino(String telDestino) {
		this.telDestino = telDestino;
	}



	public LocalDateTime getDataHoraIn�cio() {
		return dataHoraIn�cio;
	}



	public void setDataHoraIn�cio(LocalDateTime dataHoraIn�cio) {
		this.dataHoraIn�cio = dataHoraIn�cio;
	}



	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}



	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}



	public String getCidadeDestino() {
		return cidadeDestino;
	}



	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}



	public String getUfDestino() {
		return ufDestino;
	}



	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	

}
