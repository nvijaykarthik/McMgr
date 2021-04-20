package in.nvijaykarthik.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import in.nvijaykarthik.entity.McApplicationsEntity;
import in.nvijaykarthik.services.McApplicationService;

@Path("/api")
public class McAppResource {

	@Inject
	Logger log;
	
	@Inject
	McApplicationService service;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    @Path("/getAllApps")
	public List<McApplicationsEntity> getAllApps(){
		log.info("Getting All applications");
		return service.getAllMcAppications();
	}
}
