package catchau;

public class Cliente implements Comparable<Cliente> {

    public String cpf, nome, cnh, validade, carroAlugado;
    public int idade, renovacao;
    public float deposito;
    private double carteira;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setValidade(String validade) { // Validade da CNH
        this.validade = validade;
    }

    public String getValidade() {
        return this.validade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getRenovação() {
        return this.renovacao;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setDeposito(float deposito) {// classe para cadastrar o deposito do cliente que alugou um carro
        this.deposito += deposito;
    }

    public double getDeposito() {
        return this.deposito;
    }

    public void setCarteira(float carteira) {
        this.carteira += carteira;
    }

    public double getCarteira() {
        return this.carteira;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao += renovacao;
    }

    public void setCarroAlugado(String carro) { //armazenar o carro que o cliente alugou
        this.carroAlugado = carro;
    }

    public String getCarroAlugado() {
        return this.carroAlugado;
    }

    public String exibir() {
        return "Nome: " + this.nome + "Idade: " + this.idade + "CPF: " + this.cpf + "CNH: " + this.cnh + "Validade CNH: " + this.validade + "Carro alugado: " + this.carroAlugado + "Carteira Digital: R$ " + this.carteira + "Número de renovações:  " + this.renovacao + "Valor total gasto: " + this.deposito;
    }

    @Override
    public int compareTo(Cliente c) {
        return this.cpf.compareToIgnoreCase(c.getCpf());
    }
}
