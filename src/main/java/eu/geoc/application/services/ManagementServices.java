package eu.geoc.application.services;

import eu.geoc.application.persistence.PersistenceBuilder;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Consumes({APPLICATION_JSON})
@Produces({APPLICATION_JSON})
@Path("home")
public class ManagementServices extends BaseManagementServices {

	public ManagementServices() {
		super();
		PersistenceBuilder.getInstance().mainInit();
		this.slotDB = PersistenceBuilder.getInstance().getMongoDatabaseManager();
	}
}

