/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author Egelantier
 */
@Primary
@Component("The View1")
public class View1 implements View{
   @Override 
    public void show(){
        System.out.println("Hello World");
    }
    
}
