import java.util.Scanner;

public class Reserva {
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente=cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public boolean fazerReserva(){
        Scanner leituraReserva = new Scanner(System.in);
        System.out.println("Deseja qual tipo de quarto?");
        System.out.println("1 - Simples");
        System.out.println("2 - Duplo");
        System.out.println("3 - Casal");
        System.out.println("4 - Luxo");
        System.out.println("0 - Sair");
        int opcaoInseridaRESERVA = leituraReserva.nextInt();
        if(opcaoInseridaRESERVA == 1) {
            QuartoSimples quartoSimplesRESERVA = new QuartoSimples();
            quartoSimplesRESERVA.setTaxa(0.05);
            quartoSimplesRESERVA.setValor(80);
            quartoSimplesRESERVA.calculaTaxa();
            quartoSimplesRESERVA.mostraValor();
        }else if(opcaoInseridaRESERVA == 2) {
            QuartoDuplo quartoDuploRESERVA = new QuartoDuplo();
            quartoDuploRESERVA.setTaxa(0.08);
            quartoDuploRESERVA.setValor(100);
            quartoDuploRESERVA.calculaTaxa();
            quartoDuploRESERVA.mostraValor();
        }else if (opcaoInseridaRESERVA == 3) {
            QuartoCasal quartoCasalRESERVA = new QuartoCasal();
            quartoCasalRESERVA.setTaxa(0.10);
            quartoCasalRESERVA.setValor(150);
            quartoCasalRESERVA.calculaTaxa();
            quartoCasalRESERVA.mostraValor();
        }else if (opcaoInseridaRESERVA == 4) {
            QuartoLuxo quartoLuxoRESERVA = new QuartoLuxo();
            quartoLuxoRESERVA.setTaxa(0.20);
            quartoLuxoRESERVA.setValor(200);
            quartoLuxoRESERVA.calculaTaxa();
            quartoLuxoRESERVA.mostraValor();
        }else if (opcaoInseridaRESERVA == 0) {
            System.out.println("Saindo...");
            return false;
        }else{
            System.out.println("Opcao invalida");
        }
        return true;
    }
    
}
