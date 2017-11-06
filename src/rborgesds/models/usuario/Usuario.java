package rborgesds.models.usuario;

public class Usuario {
    private long id;
    private String nome;
    private String sobrenome;
    private String email;
    private Byte impressaoDigital;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getImpressaoDigital() {
        return impressaoDigital;
    }

    public void setImpressaoDigital(Byte impressaoDigital) {
        this.impressaoDigital = impressaoDigital;
    }
}
