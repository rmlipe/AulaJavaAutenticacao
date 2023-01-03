/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author Felipe
 */
@ManagedBean
public class Aluno {
    String nome;
    String senha;
    
    public Aluno(){
    }
    
    public String validar(){
        if (nome.equals("Felipe") && senha.equals("123")){
            return "principal";
        }
        else {
            FacesMessage fm = new FacesMessage("Login ou Senha Inválido!");
            FacesContext.getCurrentInstance().addMessage("msg", fm);
            return null;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
