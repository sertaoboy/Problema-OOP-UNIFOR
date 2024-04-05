# Explicação do Código

## Classe Quarto

A classe `Quarto` representa um quarto individual em um hotel. Cada quarto tem um valor (preço), uma taxa, um tipo e um status de reserva.

\```java
public class Quarto {

    private double valor;
    private double taxa;
    private String tipo;
    private boolean reservado;
\```

Os métodos `get` e `set` são usados para acessar e modificar essas propriedades. Por exemplo, `setReservado(true)` seria usado para marcar um quarto como reservado.

\```java
    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
\```

## Classe Hotel

A classe `Hotel` representa o hotel como um todo. O hotel é composto por uma matriz de quartos, que são inicializados no construtor da classe.

\```java
public class Hotel {

    private Quarto[][] quartos;

    public Hotel() {
        quartos = new Quarto[8][8];
        // Inicializa cada quarto na matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                quartos[i][j] = new Quarto();
                // Define o tipo do quarto com base em i e j
                quartos[i][j].setTipo("Tipo do quarto");
            }
        }
    }
\```

O método `reservarQuarto` percorre a matriz de quartos e procura um quarto que corresponda ao tipo especificado pelo usuário e que ainda não esteja reservado. Quando encontra um quarto correspondente, ele reserva o quarto e sai do loop.

\```java
    public void reservarQuarto(String tipoQuartoUsuario) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (quartos[i][j].getTipo().equals(tipoQuartoUsuario) && !quartos[i][j].isReservado()) {
                    // Reserva o quarto
                    quartos[i][j].setReservado(true);
                    // Pode querer sair do loop depois de encontrar um quarto correspondente
                    return;
                }
            }
        }
    }
\```

Essa é uma visão geral básica do código. Cada método e classe pode ter funcionalidades adicionais dependendo dos requisitos específicos do seu projeto.