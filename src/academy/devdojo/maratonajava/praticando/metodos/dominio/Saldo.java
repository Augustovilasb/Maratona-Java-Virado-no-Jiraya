package academy.devdojo.maratonajava.praticando.metodos.dominio;

/*Crie uma classe ContaBancaria com:

Atributos:
nomeTitular (String)
saldo (double)

Métodos:
depositar(double valor) — adiciona valor ao saldo
sacar(double valor) — remove valor do saldo, mas se não tiver saldo suficiente imprime "Saldo insuficiente!"
imprimirExtrato() — imprime o nome do titular e o saldo atual

Exemplo de saída:
Titular: João Silva
Saldo: R$ 1500.00

Saque de R$ 2000.00 negado — Saldo insuficiente!

Titular: João Silva
Saldo: R$ 1000.00*/

public class Saldo {

    public String tipo;
    public double valor;

    public Saldo(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}



