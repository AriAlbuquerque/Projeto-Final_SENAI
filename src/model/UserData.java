package model;

public class UserData {

    String nome;
    protected String endereco;
    protected String telefone;
    protected String cpf;
    protected String email;

    protected UserData(String nome, String endereco, String telefone, String cpf, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    public UserData() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Visualizar() {
        System.out.println(nome + "\n" + endereco + "\n" + telefone + "\n" + cpf + "\n" + email);

    }
    public void VisualizarNome() {
        System.out.println("Olá, " + nome);

    }


}