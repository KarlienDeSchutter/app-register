/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.thomasmore.projectwerk.app.register.web.view;

import be.thomasmore.projectwerk.app.register.web.facade.ApplicationFacade;
import be.thomasmore.projectwerk.app.register.web.model.ApplicationDto;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author lucs
 */
@RequestScoped
@Named("applicationOverview")
public class ApplicationsOverviewView {
    
    private List<ApplicationDto> applications = new LinkedList<>();

     @EJB
    private ApplicationFacade facade;

    @PostConstruct
    public void init() {
        applications = facade.listAll();
    }

    public List<ApplicationDto> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationDto> applications) {
        this.applications = applications;
    }
    
}
