/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Egelantier
 */
@Component("Controller class")
public class Controller {
   @Autowired @Qualifier("The View2")View view;

    public Controller(View view) {
        this.view = view;
    }
    
    public void showView(){
        view.show();
    }
   
    
}
