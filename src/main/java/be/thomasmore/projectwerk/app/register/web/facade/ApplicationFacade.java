/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.thomasmore.projectwerk.app.register.web.facade;

import be.thomasmore.projectwerk.app.register.web.model.ApplicationDto;
import java.util.List;

/**
 *
 * @author lucs
 */
public interface ApplicationFacade {
    
     List<ApplicationDto> listAll();

    void create(ApplicationDto dto);
}
