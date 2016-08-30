/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.thomasmore.projectwerk.app.register.domain.entities;

import java.util.Properties;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATIONPROPERTIES")
public class ApplicationPropertiesEntity extends BaseTrackableEntity{

    
	
	private Properties propertiesList = new Properties();
    
	@ManyToOne(cascade = CascadeType.ALL,targetEntity=ApplicationEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name="application_fk")
	private ApplicationEntity applicationEntity;
	
	
	public ApplicationEntity getApplicationEntity(){
		return this.applicationEntity;
	}
	
	public void setProperties(Properties propertiesList){
		this.propertiesList=propertiesList;
	}
	
	public Properties getProperties(){
		return this.propertiesList;
	}	
}
