/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.thomasmore.projectwerk.app.register.domain.dao;

import be.thomasmore.projectwerk.app.register.domain.entities.ApplicationEntity;
import java.util.List;

/**
 *
 * @author lucs
 */
public interface ApplicationDao {

    public List<ApplicationEntity> listAll();

    public void save(ApplicationEntity ae);
    
}
