class Empresa{
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int indice =0;

	public Empresa(int tamanhoFuncionarios){
		this.funcionarios = new Funcionario[tamanhoFuncionarios];
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getCnpj(){
		return this.cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public void instanciaFuncionarios(int tamanho){
		this.funcionarios = new Funcionario[tamanho];
	}

	public Funcionario getFuncionario(int posicao){
		return this.funcionarios[posicao];
	}
	public void setFuncionario(Funcionario funcionario){
		this.funcionarios[indice] = funcionario;
		indice = indice + 1;
	}

}

class Funcionario{
	//atributos da classe
	private String nome;
	private String departamento;
	private double salario;
	private String rg;


	public Funcionario(String nome){
		this.nome = nome;
	}

	public Funcionario(){
		
	}
	
	//metodo recebeAumento sem retorno "void"
	//recebe como parametro o percetual de aumento	
	public void recebeAumento (double percentual){
		this.salario += this.salario*percentual;

	}
	//metodo calculaGanhoAnual com retorno double
	public double getGanhoAnual(){
		double ganhoAnual = this.salario*12;
		return ganhoAnual;		
	}
	//metodo para mostrar todos os atributos
	public void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario: "+this.salario);
		System.out.println("RG: "+this.rg);
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public String getRg(){
		return this.rg;
	}

}

class TestaFuncionario{
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		joao.setSalario(1000);


		Empresa e = new Empresa(10);
		e.setFuncionario(joao);
		
		System.out.println(e.getFuncionario(0).getSalario());
	}


}