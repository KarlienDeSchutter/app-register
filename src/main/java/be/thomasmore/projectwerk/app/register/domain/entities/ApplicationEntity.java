/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.thomasmore.projectwerk.app.register.domain.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATIONS")
@AttributeOverride( name="id", column = @Column(name="application_id") )
/*@AssociationOverride( 
   name="propulsion", 
   joinColumns = @JoinColumn(name="fld_propulsion_fk") 
)*/
public class ApplicationEntity extends BaseTrackableEntity{

    private String name;
	private enum Environment {DEVELOPMENT,TEST,STAGING,PRODUCTIE};
	
	@OneToMany(mappedBy="applicationEntity", fetch=FetchType.LAZY)
	private List<ApplicationPropertiesEntity> applicationPropertiesEntityList=new LinkedList<>();
	
	
	
    public List<ApplicationPropertiesEntity> getApplicationPropertiesEntityList() {
		return this.applicationPropertiesEntityList;
	}
	
	public void setApplicationPropertiesEntityList(List<ApplicationPropertiesEntity> applicationPropertiesEntityList){
		this.applicationPropertiesEntityList=applicationPropertiesEntityList;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
