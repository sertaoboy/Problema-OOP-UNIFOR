public class Quarto {
    private String tipo;
    private int numero;
    private boolean disponivel;
    private Hospede hospede;
    private int totalProdutosFrigobar;
    

    public Quarto(String tipo, int numero, boolean disponivel){
        this.tipo=tipo;
        this.numero=numero;
        this.disponivel=disponivel;
    }

    public void setTotalProdutosFrigobar(int totalprodutosfrigobar) {
        this.totalProdutosFrigobar=totalprodutosfrigobar;
    }
    public int getTotalProdutosFrigobar() {
        return totalProdutosFrigobar;
    }

    public void setHospede(Hospede hospede){
        this.hospede=hospede;
    }
    public Hospede getHospede(){
        return hospede;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel=disponivel;
    }
    public boolean getDisponivel(){
        return disponivel;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return numero;
    }
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }
    public String getTipo(){
        return tipo;
    }

}
