public class Cliente {
    private String nome;
    private long cpf;
    private String dataDeNascimento;

    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento=dataDeNascimento;
    }
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }

    public void setCpf(long cpf){
        this.cpf=cpf;
    }
    public long getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
}
