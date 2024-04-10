import java.util.Scanner;

public class Service {
    private double preco;

    public void setPreco(double preco){
        this.preco=preco;
    }

    public double getPreco(){
        return preco;
    }
    

    public void mostraServicos(){
        Scanner leituraServico = new Scanner(System.in);
        System.out.println("Escolha sua opcao: ");
        System.out.println("1 - Cafe da manha");
        System.out.println("2 - Almoco");
        System.out.println("3 - Janta");
        System.out.println("4 - All inclusive / dia");
        int opcaoSERVICO = leituraServico.nextInt();
        if(opcaoSERVICO==1){
            Service servicoCAFEDAMANHA = new Service();
            servicoCAFEDAMANHA.setPreco(29.90);
            System.out.println("Cafe da manha incluso: R$"+ servicoCAFEDAMANHA.getPreco());
        }else if(opcaoSERVICO==2){
            Service servicoALMOCO = new Service();
            servicoALMOCO.setPreco(35.00);
            System.out.println("Almoco Incluso: R$"+servicoALMOCO.getPreco());
        }else if(opcaoSERVICO==3){
            Service servicoJANTA = new Service();
            servicoJANTA.setPreco(25);
            System.out.println("Janta Inclusa: R$"+servicoJANTA.getPreco());
        }else if(opcaoSERVICO == 4){
            Service servicoALLINCLUSIVE = new Service();
            servicoALLINCLUSIVE.setPreco(80);
            System.out.println("All inclusive: R$"+servicoALLINCLUSIVE.getPreco());
        }else{
            System.out.println("Opcao Invalida");

        }
    }
}
