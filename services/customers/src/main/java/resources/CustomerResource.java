package resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.Customer;

@Path("/api/v1/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

	@GET
	@Path("/{id}")
	public Customer getCustomer(@PathParam("id") int id) {

		// TODO

		return null;
	}

	@POST
	public String postCustomer() {

		// TODO
		return "";
	}

	@PUT
	public String putCustomer() {

		// TODO
		return "";
	}

	@DELETE
	@Path("/{id}")
	public String deleteCustomer(@PathParam("id") int id) {

		// TODO
		return "";
	}

}
