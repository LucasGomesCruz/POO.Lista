package Lista5.Aula6;

public class Cliente {
    public int id;
    public String nome;
    public int idade;
    public String email;
    public ContaBancaria conta;

    public Cliente()
    {
    }

    public Cliente(int id, String nome, int idade, String email, ContaBancaria conta)
    {
        this.id = id;
        this.nome  = nome;
        this.idade  = idade;
        this.email  = email;
        this.conta  = conta;
    }

    public void atualizarEmail(String novoEmail)
    {
        this.email = novoEmail;
    }

    public String exibirNomeIdade()
    {
        return "Nome: " + nome +
                "\nIdade: " + idade;
    }

    public String exibirDadosConta()
    {
        if(conta.agencia == null)
            return "";
        else
            return "Agencia: " + conta.agencia +
                    "\nNumero: " + conta.numero;
    }
}
