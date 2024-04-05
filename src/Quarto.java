public  class Quarto {

    private double valor;
    private double taxa;
    private String tipo; // AUXILIO --> COPILOT
    private boolean reservado; // AUXILIO --> COPILOT

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }
    public void setReservado(boolean reservado){
        this.reservado=reservado;
    }
    public String getTipo(){
        return tipo;
    }
    public boolean getReservado(){
        return reservado;
    }

    public void setTaxa(double taxa){
        this.taxa=taxa;
    }
    public double getTaxa(){
        return taxa;
    }



    public void setValor(double valor){
        this.valor=valor;
    }

  
    public double getValor(){
        return valor;
    }


    public void calculaTaxa(){
        
        System.out.println("Taxa acrescida: R$"+getValor() * getTaxa());
        
    }

    public void mostraValor(){
        double valorAtual = getValor() + (getValor() * taxa);
        System.out.println("Valor do aluguel do quarto: ");
        System.out.printf("R$%8.2f", valorAtual);
        System.out.println();
    }


}