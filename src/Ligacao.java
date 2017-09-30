import java.time.LocalDateTime;

public class Ligacao {
	private int codigo;
	private String  telDestino;
	private LocalDateTime dataHoraInício;
	private LocalDateTime dataHoraFim;
	private String cidadeDestino;
	private String ufDestino;
	private Cliente cliente;
	
	
	
	//METODO CONSTRUTOR
	public Ligacao(int codigo, String telDestino, LocalDateTime dataHoraInício, LocalDateTime dataHoraFim,
			String cidadeDestino, String ufDestino, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.telDestino = telDestino;
		this.dataHoraInício = dataHoraInício;
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



	public LocalDateTime getDataHoraInício() {
		return dataHoraInício;
	}



	public void setDataHoraInício(LocalDateTime dataHoraInício) {
		this.dataHoraInício = dataHoraInício;
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
