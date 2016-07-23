package be.thomasmore.projectwerk.app.register.web.facade;

import be.thomasmore.projectwerk.app.register.domain.entities.ApplicationEntity;
import be.thomasmore.projectwerk.app.register.domain.service.ApplicationService;
import be.thomasmore.projectwerk.app.register.web.model.ApplicationDto;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ApplicationFacadeImpl implements ApplicationFacade{

    @EJB
    private ApplicationService applicationService;
    
    @Override
    public List<ApplicationDto> listAll() {
        List<ApplicationDto> dtos = new LinkedList<>();
        List<ApplicationEntity> entities = applicationService.list();
        
        for (ApplicationEntity entity : entities) {
            ApplicationDto dto = new ApplicationDto();
            dto.setName(entity.getName());
            dto.setVersion(entity.getAppVersion());
            dtos.add(dto);
        }
        
        return dtos;
    }
    
    @Override
    public void create(ApplicationDto dto) {
        ApplicationEntity ae = new ApplicationEntity();
        ae.setAppVersion(dto.getVersion());
        ae.setName(dto.getName());
        applicationService.save(ae);
    }
    
    
}
