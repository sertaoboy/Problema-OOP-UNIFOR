public class Main {
    public static void main(String[] args) {
        // QuartoSimples q1 = new QuartoSimples();
        // q1.setValor(150);
        // q1.calculaTaxa();
        // q1.mostraValor();
        // System.out.println("----------TESTANDO MENU--------------------");
        // Menu menu = new Menu();
        // menu.mostraMenu();






        // Cliente cliente1 = new Cliente();
        // cliente1.setNome("Joao");
        // cliente1.setCpf(777888899);
        // cliente1.setDataDeNascimento("05.05.2003");
        // cliente1.getCpf();
        // cliente1.getDataDeNascimento();


        // Reserva reserva1 = new Reserva();
        // reserva1.setCliente(cliente1);
        // reserva1.getCliente();

        // Service service1 = new Service();
        // service1.mostraServicos();
         
/////////////////////////Acima: 1os testes///////////////////////////////////////
        Hotel hotel = new Hotel();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Joao");
        cliente1.setCpf(2223232);
        cliente1.setDataDeNascimento("04.02.1999");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setCpf(123123123);
        cliente2.setDataDeNascimento("01.02.2000");

        hotel.alocarClienteParaQuarto(cliente1);
        hotel.alocarClienteParaQuarto(cliente2);

        hotel.imprimirRelatorio();


        

    }
}
