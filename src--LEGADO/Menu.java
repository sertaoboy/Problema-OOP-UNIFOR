import java.util.Scanner;

public class Menu implements Registrar {
    private int opcao;
    private Hotel hotel;

    public Menu(Hotel hotel){
        this.hotel=hotel;
    }


    public void setOpcao (int opcao) {
        this.opcao=opcao;
    }
    public int getOpcao(){
        return opcao;
    }



    @Override
    public void sign() {
        Scanner leituraDoRegistro = new Scanner(System.in);
        Cliente clienteREGISTRO = new Cliente();
        do {
            
            System.out.println("1 - Cadastro");
            System.out.println("2 - Sair");
            int opcaoInserida = leituraDoRegistro.nextInt();
            if(opcaoInserida==1){
                System.out.println("Insira seu nome completo: ");
                String nomeInserido = leituraDoRegistro.nextLine();
                clienteREGISTRO.setNome(nomeInserido);
                leituraDoRegistro.nextLine();
                System.out.println("Insira seu cpf: ");
                long cpfInserido = leituraDoRegistro.nextLong();
                leituraDoRegistro.nextLine(); // Consumir o '\n' que não foi lido por nextLong()
                clienteREGISTRO.setCpf(cpfInserido);
                System.out.println("Insira sua data de nascimento (separe por '.'): ");
                String dataInserida = leituraDoRegistro.nextLine();
                clienteREGISTRO.setDataDeNascimento(dataInserida);
                System.out.println("Registro completo! Bem vindo!");
                break;
            }else if (opcaoInserida ==2){
                System.out.println("Saindo...");
                break;
            }else{
                System.out.println("Opcao invalida!");
            }
        }while(true);

    }



    public void mostraMenu(){
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("-----Menu-----");
            System.out.println("Opcoes: ");
            System.out.println("1 - Reserva");
            System.out.println("2 - Solicitar servico");
            System.out.println("3 - Novo por aqui ou alterou seus dados? Registre-se!");
            
            int opcaoInserida = leitura.nextInt();
            if(opcaoInserida==1){
                Reserva reservaMENU = new Reserva();
                boolean reservaConcluida = reservaMENU.fazerReserva();
                if(reservaConcluida) {
                    System.out.println("Reserva concluida! Aproveite!");
                }
            }else if(opcaoInserida==2){
                Service servicoMENU = new Service();
                servicoMENU.mostraServicos();

            }else if(opcaoInserida==3){
                sign();
            }else{
                System.out.println("Opcao invalida!");
            }

        }while(true);
    }
}
