public class Data {
    //Construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        //Verifica o retorno do metodo que valida
        //a data válida
        if (! isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + dia+"/"+mes+"/"+ano + " não existe!");
        }
    }
    private boolean isDataViavel(int dia, int mes, int ano) {
        //Se o dia for menor ou igual a zero
        //já retorne falso
        if (dia <= 0 || mes <= 0) {
            return false;
        }
        //Definindo o último dia do mes
        int ultimoDiaDoMes = 31; // por padrao são 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
        //se o dia passado no construtor for maior
        //que o ultimo dia do mes retorne false
        if (dia > ultimoDiaDoMes) {
            return false
        }
        return true;
    }
}