package co.entrevista.bancobta.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped 
public class LoginCtrl{
    
    public LoginCtrl() {
    }
    
    public String Acceso(){        
        return "principal";
    }
}