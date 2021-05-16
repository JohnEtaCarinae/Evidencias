/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Asus
 */
@ManagedBean
@SessionScoped
public class inicioBean {
    public String ingresar(){
        return "segundaPantalla";
    }
}
