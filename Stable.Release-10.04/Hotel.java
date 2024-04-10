import java.util.ArrayList;
import java.util.Scanner;

public class Hotel implements Menu {
    private ArrayList<Quarto> quartos;
    private ArrayList<Hospede> clientes;

    public Hotel() {
        quartos = new ArrayList<>();
        clientes = new ArrayList<>();

        quartos.add(new Quarto("simples",1,true));
        quartos.add(new Quarto("duplo",2,true));
        quartos.add(new Quarto("casal", 3, true));
        quartos.add(new Quarto("luxo",4,true));
    }

    public void registrar() {
        System.out.println("Informe seu nome:");
        Scanner leitura = new Scanner(System.in);
        String nomeInseridoREGISTRO = leitura.nextLine();
        System.out.println("Insira seu cpf:");
        String cpfInseridoREGISTRO = leitura.nextLine();
        Hospede hospedeREGISTRO = new Hospede();
        System.out.println("Adicionando aos registros...");
        hospedeREGISTRO.setNome(nomeInseridoREGISTRO);
        hospedeREGISTRO.setCpf(cpfInseridoREGISTRO);
        clientes.add(hospedeREGISTRO);
        System.out.println("Bem-vindo(a) ao nosso hotel!");
        
    }

    public void reservar() {
        boolean reservaFeita = false;
        boolean clienteEncontrado = false;
        System.out.println("Informe seu nome:");
        Scanner leitura = new Scanner(System.in);
        String nomeInseridoRESERVA = leitura.nextLine();
        System.out.println("Informe seu cpf: ");
        String cpfInseridoRESERVA = leitura.nextLine();
        for (Hospede cliente : clientes) {
            if (cliente.getCpf().equals(cpfInseridoRESERVA) && cliente.getNome().equals(nomeInseridoRESERVA)) {
                clienteEncontrado = true;
                System.out.println("Deseja qual tipo de quarto? 1-simples, 2-duplo, 3-casal, 4-luxo.");
                System.out.println("Valor do quarto simples: R$100.00. Cobramos acrescimo de 10% para o servico.");
                System.out.println("Valor do quarto duplo: R$150.00. Cobramos acrescimo de 15% para o servico.");
                System.out.println("Valor do quarto casal: R$200.00. Cobramos acrescimo de 20% para o servico. ");
                System.out.println("Valor quarto luxo: R$300.00. Cobramos acrescimo de 25% para o servico.");
    
                int opcaoQuartoRESERVA = leitura.nextInt();
                leitura.nextLine(); // correcao do bug onde nao carregava a linha de input
                if (opcaoQuartoRESERVA == 1) {
                    for (Quarto quarto : quartos) {
                        if (quarto.getTipo().equals("simples") && quarto.getDisponivel()) {
                            quarto.setDisponivel(false);
                            quarto.setHospede(cliente);
                            cliente.adicionarConta(100+(0.1*100));
                            System.out.println("Quarto simples reservado! Aproveite a estadia, " + nomeInseridoRESERVA);
                            System.out.println("O numero do seu quarto e: "+quarto.getNumero());
                            reservaFeita = true;
                            break;
                        }
                    }
                    if (!reservaFeita) {
                        System.out.println("Tipo de quarto indisponivel.");
                    }
                } else if (opcaoQuartoRESERVA == 2) {
                    for (Quarto quarto : quartos) {
                        if (quarto.getTipo().equals("duplo") && quarto.getDisponivel()) {
                            quarto.setDisponivel(false);
                            quarto.setHospede(cliente);
                            cliente.adicionarConta(150+(0.15*150));
                            System.out.println("Quarto duplo reservado. Aproveite a estadia, " + nomeInseridoRESERVA);
                            System.out.println("O numero do seu quarto e: "+quarto.getNumero());
                            reservaFeita = true;
                            break;
                        }
                    }
                    if (!reservaFeita) {
                        System.out.println("Tipo de quarto indisponivel");
                    }
                } else if (opcaoQuartoRESERVA == 3) {
                    for (Quarto quarto : quartos) {
                        if (quarto.getTipo().equals("casal") && quarto.getDisponivel()) {
                            quarto.setDisponivel(false);
                            quarto.setHospede(cliente);
                            cliente.adicionarConta(200 + (200*0.2));
                            System.out.println("Quarto casal reservado. Aproveitem a estadia!");
                            System.out.println("O numero do seu quarto e: "+quarto.getNumero());
                            reservaFeita = true;
                            cliente.setTemFrigobar(true);
                            System.out.println("Seu quarto possui frigobar! Selecione as opcoes no menu.");
                            break;
                        }
                    }
                    if (!reservaFeita) {
                        System.out.println("Tipo de quarto indisponivel.");
                    }
                } else if (opcaoQuartoRESERVA == 4) {
                    for (Quarto quarto : quartos) {
                        if (quarto.getTipo().equals("luxo") && quarto.getDisponivel()) {
                            quarto.setDisponivel(false);
                            quarto.setHospede(cliente);
                            cliente.adicionarConta(300+(300*0.25));
                            System.out.println("Quarto de luxo reservado. Aproveite a estadia, " + nomeInseridoRESERVA);
                            System.out.println("O numero do seu quarto e: "+quarto.getNumero());
                            reservaFeita = true;
                            cliente.setTemFrigobar(true);
                            System.out.println("Seu quarto possui frigobar! Selecione as opcoes no menu.");
                            break;
                        }
                    }
                    if (!reservaFeita) {
                        System.out.println("Tipo de quarto indisponivel");
                    }
                }
                // Solicita a data de reserva e checkout após a seleção do quarto
                System.out.println("Informe a data de reserva (formato dia.mes.ano):");
                String dataReserva = leitura.nextLine();
                cliente.setDataReserva(dataReserva);
    
                System.out.println("Informe a data provavel de checkout (formato dia.mes.ano):");
                String dataCheckout = leitura.nextLine();
                cliente.setDataCheckout(dataCheckout);
            }
        } 
        if (!clienteEncontrado) {
            System.out.println("Cliente nao cadastrado!");
        }
    }

    public void checkout() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual quarto gostaria de fazer checkout? Digite o numero: ");
        int quartoInseridoCHECKOUT = leitura.nextInt();
        System.out.println("Por favor, insira seu CPF: ");
        String cpfInseridoCHECKOUT = leitura.next();
        for(Quarto quartoCHECKOUT : quartos) {
            if(quartoCHECKOUT.getNumero() == quartoInseridoCHECKOUT) {
                if(quartoCHECKOUT.getHospede() != null && quartoCHECKOUT.getHospede().getCpf().equals(cpfInseridoCHECKOUT)) {
                    quartoCHECKOUT.setDisponivel(true);
                    quartoCHECKOUT.setHospede(null);
                    System.out.println("Checkout realizado com sucesso. Obrigado por se hospedar conosco!");
                } else {
                    System.out.println("Voce nao tem reserva nesse quarto.");
                }
            }
        }
    }

    public void informacoesQuarto() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o numero do quarto que voce gostaria de obter informacoes: ");
        int numeroQuarto = leitura.nextInt();
    
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                System.out.println("Informacoes do quarto " + numeroQuarto + ":");
                System.out.println("Tipo: " + quarto.getTipo());
                if(quarto.getDisponivel()) {
                    System.out.println("Disponivel.");
                }else{
                    System.out.println("Ocupado.");
                }
                
                if (quarto.getHospede() != null) {
                    System.out.println("Hospede: " + quarto.getHospede().getNome());
                } else {
                    System.out.println("Hospede: Nenhum");
                }
    
                return;
            }
        }
    
        System.out.println("Nao foi encontrado um quarto com o numero " + numeroQuarto);
    }

    public void informacoesCliente() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o CPF do cliente que voce gostaria de obter informacoes: ");
        String cpfCliente = leitura.nextLine();
    
        for (Hospede cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                System.out.println("Informacoes do cliente " + cliente.getNome() + ":");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Data de reserva: " + cliente.getDataReserva());
                System.out.println("Data de checkout: " + cliente.getDataCheckout());
                System.out.println("Conta total: R$" + cliente.getConta());
                return;
            } //
        }
    
        System.out.println("Nao foi encontrado um cliente com o CPF " + cpfCliente);
    }

    public void adicionaFrigobar(){
        boolean clienteEncontradoFRIGOBAR = false;
        System.out.println("Porfavor, insira seu nome e o numero do seu CPF:");
        Scanner leiutra = new Scanner(System.in);
        System.out.println("Nome:");
        String nomeInseridoFRIGOBAR = leiutra.nextLine();
        System.out.println("CPF:");
        String cpfInseridoFRIGOBAR = leiutra.nextLine();
        boolean clienteOcupandoQuarto = false;
        for(Hospede cliente : clientes) {
            if(cliente.getNome().equals(nomeInseridoFRIGOBAR) && cliente.getCpf().equals(cpfInseridoFRIGOBAR)) {
                clienteEncontradoFRIGOBAR = true;
                if(!cliente.getTemFrigobar()) {
                    System.out.println("Cliente sem quarto com frigobar.");
                    return;
                }
                for(Quarto quarto : quartos) {
                    if(quarto != null && quarto.getHospede() != null && quarto.getHospede().equals(cliente)) {
                        clienteOcupandoQuarto = true;
                        System.out.println("---------Menu Frigobar--------");
                        System.out.println("1. Cerveja; R$ 7.60");
                        System.out.println("2. Chocolate; R$ 3.30");
                        System.out.println("3. Coca-cola; R$5.50");
                        System.out.println("4. Agua indaia; R$4.50 ");
                        Scanner leitura = new Scanner(System.in);
                        Integer opcaoInseridaFRIGOBAR = leitura.nextInt();
                        if(opcaoInseridaFRIGOBAR==1) {
                            cliente.setConta(cliente.getConta()+7.60);
                            System.out.println("Valor da conta atualizado: R$ "+cliente.getConta());
                        }else if (opcaoInseridaFRIGOBAR==2) {
                            cliente.setConta(cliente.getConta()+3.50);
                            System.out.println("Valor da conta atualizado: R$ "+cliente.getConta());
                        }else if (opcaoInseridaFRIGOBAR==3){
                            cliente.setConta(cliente.getConta()+5.50);
                            System.out.println("Valor da conta atualizado: R$%"+cliente.getConta());
                        }else if(opcaoInseridaFRIGOBAR==4){
                            cliente.setConta(cliente.getConta()+4.50);
                            System.out.println("Valor da conta atualizado :R$"+cliente.getConta());
                        }else{
                            System.out.println("Registro nao encontrado!");
                        }
                    }    
                }
                if(!clienteOcupandoQuarto) {
                    System.out.println("Cliente sem quarto alocado.");
                }
            }    
        }
    }


    @Override
    public void menu() {
        Scanner leitura = new Scanner(System.in);
        int opcao;
    
        do {
            System.out.println("----------------------------------Menu----------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Registrar um novo cliente");
            System.out.println("2. Reservar um quarto");
            System.out.println("3. Fazer checkout");
            System.out.println("4. Mostrar informacoes do quarto");
            System.out.println("5. Mostrar informacoes do cliente");
            System.out.println("6. Menu do frigobar.");
            System.out.println("7. Sair");
            opcao = leitura.nextInt();

            //
                //
            //

            if (opcao == 1) {
                registrar();
            }else if(opcao == 2) {
                reservar();
            }else if( opcao == 3) {
                checkout();
            }else if(opcao ==4) {
                informacoesQuarto();
            }else if(opcao == 5) {
                informacoesCliente();
            }else if (opcao ==6) {
                adicionaFrigobar();
            }
        } while (opcao !=7);
    }

}
