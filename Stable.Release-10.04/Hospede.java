public class Hospede {
    private String nome;
    private String cpf;
    private double conta;
    private String dataReserva;
    private String dataCheckout;
    private boolean temFrigobar;


    public Hospede(String nome, String cpf, double conta,String dataReserva, String dataCheckout,boolean frigobar){
        this.nome = nome;
        this.cpf = cpf;
        this.conta=conta;
        this.dataReserva=dataReserva;
        this.dataCheckout=dataCheckout;
        this.temFrigobar = frigobar;
    }
    public Hospede(){

    }

    public void setTemFrigobar(boolean temFrigobar){
        this.temFrigobar=temFrigobar;
    }
    public boolean getTemFrigobar() {
        return temFrigobar;
    }


    public void setDataReserva(String datareserva) {
        this.dataReserva = datareserva;
    }

    public String getDataReserva(){
        return dataReserva;
    }

    public void setDataCheckout(String dataCheckout) {
        this.dataCheckout=dataCheckout;
    }
    
    public String getDataCheckout(){
        return dataCheckout;
    }

    public void setConta(double conta){
        this.conta=conta;
    }

    public double getConta(){
        return conta;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }

    public void adicionarConta(double VALORDACONTA) {
         setConta(getConta() + VALORDACONTA);
    }
}
