package exemplos;

public class Funcionario {
	private String nomeFuncionario;
	private int horasMensais;
	private double valorHora;
	
	
	//Contrutores
	
	public Funcionario()
	{
		super();
	}
	public Funcionario(String nomeFuncionario)
	{
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	public Funcionario(String nomeFuncionario, int horasMensais)
	{
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.horasMensais = horasMensais;
	}
	public Funcionario(String nomeFuncionario, int horasMensais, double valorHora)
	{
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	
	
	//Getters and Setters
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getHorasMensais() {
		return horasMensais;
	}
	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//Método
	public double setPagamentoSalario()
	{
		return (this.horasMensais * this.valorHora);		
	}
	
	
}

