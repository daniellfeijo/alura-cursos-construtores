class Conta{
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

	//Posso invocar um construtor dentro do
	//outro da seguite forma:
	public Conta(int numero, double limite){
		this(numero, limite, 0);
	}
	
	public Conta(int numero, double limite, double saldoInicial){
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;
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
		
		//Estou usando o segundo construtor que tem
		//três argumentos.
		//A java diferencia os construtores pela quantidade
		//de variáveis e os tipos.
		//não posso ter dois contrutores com a mesma
		//quantidade de variaveis e os mesmos tipos
		//o Java não vai ter como diferenciar
		Conta joao = new Conta(123, 100.0, 200.00);
		//joao.numero = 123;
		//joao.setLimite(100.0);

		joao.deposita(500.0);
		
		double valorASerSacado = 600;
		joao.saca(valorASerSacado);	
		
		System.out.println(joao.getSaldo());

	}
}