package in.nvijaykarthik.repository;

import javax.enterprise.context.ApplicationScoped;

import in.nvijaykarthik.entity.McApplicationsEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class McApplicationRepository implements PanacheRepository<McApplicationsEntity>{
	
}
