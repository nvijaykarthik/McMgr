package in.nvijaykarthik.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nvijaykarthik.entity.McApplicationsEntity;
import in.nvijaykarthik.repository.McApplicationRepository;

@ApplicationScoped
public class McApplicationService {

	@Inject
	McApplicationRepository mcAppRepo;
	
	@GET
	@Path("/getAllMcApps")
	@Produces(value = {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<McApplicationsEntity> getAllMcAppications(){
		return mcAppRepo.listAll();
	}
}
