import java.time.LocalDate;

public class Cliente {
private String nome;
private String cpf;
private LocalDate dataNascimento;
private String telefone;
private String cidade;
private String uf;


//metodo Contrutor 
public Cliente(String nome, String cpf, LocalDate dataNascimento, String telefone, String cidade, String uf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.dataNascimento = dataNascimento;
	this.telefone = telefone;
	this.cidade = cidade;
	this.uf = uf;
}

//gets e sets 
public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public LocalDate getDatadeNascimento() {
	return dataNascimento;
}


public void setDatadeNascimento(LocalDate datadeNascimento) {
	this.dataNascimento = datadeNascimento;
}


public String getTelefone() {
	return telefone;
}


public void setTelefone(String telefone) {
	this.telefone = telefone;
}


public String getCidade() {
	return cidade;
}


public void setCidade(String cidade) {
	this.cidade = cidade;
}


public String getUf() {
	return uf;
}


public void setUf(String uf) {
	this.uf = uf;
}
//Metodo para recuperar a Data de Nascimento como String
	public String getDataNascComoString(){
		return dataNascimento.getDayOfMonth() + "/" +
				dataNascimento.getMonthValue() + "/" +
				dataNascimento.getYear();





}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}