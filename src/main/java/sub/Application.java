/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import java.io.File;
import java.util.Scanner;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Egelantier
 */
@ComponentScan
@Configuration
public class Application {/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */

    // een aanvuidig voorbeeld over constructor based injection

     @Autowired Controller controller;
    public static void main(String[] args)  {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application app = context.getBean(Application.class);
        app.start();

    }

    public void start() {
        controller.showView();

     
    }
    @Bean(name ={"The Bean","Bean class"} )
    public View getView (){
       
        try(Scanner read = new Scanner(new File("configuratie.txt"))){
            switch(read.nextInt()){
                case 1 : return new View1();
                
                case 2 : return new View2();
                
                default : return new View1();
            }
        } catch(Exception ex){
                System.out.println("Er is een probleem met file : configuratieFile");
               return new View1();            
 }
               
    }
    

}
