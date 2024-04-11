public class Funcionario {
    private String cpf;
    private String nome;
    private int matricula;

    public Funcionario(String cpf, String nome, int matricula) {
        this.cpf=cpf;
        this.nome=nome;
        this.matricula = matricula;
    }

    public void setCpf(String cpf) {
        this.cpf=cpf;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public void setInt(int matricua ) {
        this.matricula=matricua;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }

}
