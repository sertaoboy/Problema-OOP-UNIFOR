

public class Hotel {
    private Quarto[][] quartos;

    public Hotel (){
        quartos = new Quarto[8][8];
        for(int i = 0;i<8;i++){
            for(int j = 0; j < 8; j++) {
                quartos[i][j] = new Quarto();
                quartos[i][j].setId((char)('A'+j)+ Integer.toString(i + 1));
            }
        }
    }

    public boolean alocarClienteParaQuarto(Cliente cliente) {
        for(int i = 0; i < quartos.length; i++) {
            for(int j =0; j< quartos[i].length; j++) {
                if(!quartos[i][j].getReservado()) {
                    quartos[i][j].setReservado(true);
                    quartos[i][j].setCliente(cliente);
                    System.out.println("Reserva realizada! Seu quarto e:" +quartos[i][j].getId());
                    return true;
                }
            }
        }
        System.out.println("Desculpe, hotel esta cheio.");
        return false;
    }

    public void imprimirRelatorio() {
        for (int i = 0; i < quartos.length; i++) {
            for (int j = 0; j < quartos[i].length; j++) {
                System.out.println("Quarto " + quartos[i][j].getId() + ":");
                if (quartos[i][j].getReservado()) {
                    Cliente cliente = quartos[i][j].getCliente();
                    System.out.println("Reservado para: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Data de Nascimento: " + cliente.getDataDeNascimento());
                } else {
                    System.out.println("Quarto disponível");
                }
                System.out.println("--------------------");
            }
        }
    }
}