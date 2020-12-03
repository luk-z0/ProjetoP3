package catchau;

public class Cliente implements Comparable<Cliente> {

    public String cpf, nome, cnh, validade, carroAlugado;
    public int idade, renovacao;
    public float deposito;
    private double carteira;

    private Cliente(String nome, int idade, String cpf, String cnh, String validade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cnh = cnh;
        this.validade = validade;
    }

    public static class ClienteBuilder {

        public String cpf, nome, cnh, validade, carroAlugado;
        public int idade, renovacao;
        public float deposito;
        private double carteira;

        public ClienteBuilder setCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public ClienteBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder setCnh(String cnh) {
            this.cnh = cnh;
            return this;
        }

        public ClienteBuilder setValidade(String validade) {
            this.validade = validade;
            return this;
        }

        public ClienteBuilder setCarroAlugado(String carroAlugado) {
            this.carroAlugado = carroAlugado;
            return this;
        }

        public ClienteBuilder setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public ClienteBuilder setRenovacao(int renovacao) {
            this.renovacao = renovacao;
            return this;
        }

        public ClienteBuilder setDeposito(float deposito) {
            this.deposito = deposito;
            return this;
        }

        public ClienteBuilder setCarteira(double carteira) {
            this.carteira = carteira;
            return this;
        }

        public Cliente criarCliente() {
            return new Cliente(nome, idade, cpf, cnh, validade);
        }
        //ele retorna pra ele mesmo,dessa forma podemos fazer uma chamada concatenada de metodos
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
        if (this.carroAlugado == null) {
            return "Nenhum carro alugado";
        } else {
            return this.carroAlugado;
        }
    }

    public String exibir() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nCNH: " + this.cnh + "\nValidade CNH: " + this.validade + "\nCarro alugado: " + this.carroAlugado + "\nCarteira Digital: R$ " + this.carteira + "\nNúmero de renovações:  " + this.renovacao + "\nValor total gasto: " + this.deposito;
    }

    @Override
    public int compareTo(Cliente c) {
        return this.cpf.compareToIgnoreCase(c.getCpf());
    }
}
