/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Municipio implements Serializable{

    private String descricao;
    private String provincia;
    int numRecenseados;
    
    ArrayList<Candidatos> candidatos = new ArrayList<>();

    public Municipio() {
    }

    public Municipio(String descricao, String provincia, int numRecenseados) {
        this.descricao = descricao;
        this.provincia = provincia;
        this.numRecenseados = numRecenseados;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumRecenseados() {
        return numRecenseados;
    }

    public void setNumRecenseados(int numRecenseados) {
        this.numRecenseados = numRecenseados;
    }

}

