class Conta{
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

	//Construtor não usa nem void nem nenhum retorno
	// (String, double, boolean)
	public Conta(int numero, double limite){
		this.numero = numero;
		this.limite = limite;
	}

	public void saca(double valor){
		if (valor>this.saldo + this.limite){
			System.out.println("Saque invalido");
		}else{
			this.saldo = this.saldo - valor;
		}
	}

	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void setLimite(double novoLimite){
		this.limite = novoLimite;
	}
}

class Cliente{
	String nome;
	String endereco;
}

class TesteModificador{
	public static void main(String args[]){
		
		Conta joao = new Conta(123, 100.0);
		//joao.numero = 123;
		//joao.setLimite(100.0);

		joao.deposita(500.0);
		
		double valorASerSacado = 600;
		joao.saca(valorASerSacado);	
		
		System.out.println(joao.getSaldo());

	}
}