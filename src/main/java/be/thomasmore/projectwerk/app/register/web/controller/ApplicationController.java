/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.thomasmore.projectwerk.app.register.web.controller;

import be.thomasmore.projectwerk.app.register.web.model.ApplicationDto;
import be.thomasmore.projectwerk.app.register.web.facade.ApplicationFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lucs
 */
@Path("applications")
public class ApplicationController {

    @EJB
    private ApplicationFacade facade;

    @GET
    @Produces({"application/json"})
    public List<ApplicationDto> listAll() {
        return facade.listAll();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(ApplicationDto dto) {
        facade.create(dto);
    }
}
