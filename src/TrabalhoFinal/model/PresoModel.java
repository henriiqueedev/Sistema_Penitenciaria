/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.model;

/**
 *
 * @author andre
 */
public class PresoModel {
    
    int idPreso,idCela;
    String nome,dataNascimento,cpf,dataEntrada,pena,filiacao,naturalidade,cor;
    
    public PresoModel (){}
    
    public PresoModel (int idPreso, int idCela, String nome, String dataNascimento, String cpf, String dataEntrada, String pena,String filiacao, String naturalidade, String cor) {
    
    this.idPreso = idPreso;
    this.idCela = idCela;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.dataEntrada = dataEntrada;
    this.pena = pena;
    this.filiacao = filiacao;
    this.naturalidade = naturalidade;
    this.cor = cor;
}

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getIdPreso(){
        return idPreso;
    }
    public void setIdPreso(int idPreso){
        this.idPreso = idPreso;
    }

    public int getIdCela() {
        return idCela;
    }

    public void setIdCela(int idCela) {
        this.idCela = idCela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getPena() {
        return pena;
    }

    public void setPena(String pena) {
        this.pena = pena;
    }



}
