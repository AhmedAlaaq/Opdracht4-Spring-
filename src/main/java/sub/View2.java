/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import org.springframework.stereotype.Component;

/**
 *
 * @author Egelantier
 */
@Component("The View2")
public class View2 implements View{
    @Override 
    public void show(){
        System.out.println("Goodbye World");
    }
    
}
