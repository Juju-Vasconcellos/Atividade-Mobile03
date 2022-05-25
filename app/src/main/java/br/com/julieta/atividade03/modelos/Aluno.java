package br.com.julieta.atividade03.modelos;

import java.io.Serializable;

public class Aluno implements Serializable  {
    private String nome;
    private Long matricula;
    private String imagemURL;

    public Aluno(String nome, Long matricula, String imagemURL) {
        this.nome = nome;
        this.matricula = matricula;
        this.imagemURL = imagemURL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getImagemURL() {
        return imagemURL;
    }

    public void setImagemURL(String imagemURI) {
        this.imagemURL = imagemURL;
    }
}
