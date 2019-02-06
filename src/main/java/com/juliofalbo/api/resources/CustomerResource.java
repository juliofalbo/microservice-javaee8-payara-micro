package com.juliofalbo.api.resources;

import com.juliofalbo.api.entities.Customer;
import com.juliofalbo.api.enums.CustomerStatus;
import com.juliofalbo.api.exceptions.ResourceNotFoundException;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.util.UUID;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class CustomerResource {

    @Resource(lookup = "java:global/CustomerDS")
    private DataSource dataSource;

    @GET
    public Response getConsumers(@QueryParam("limitPerPage") Integer limitPerPage,
                                 @QueryParam("currentPage") Integer currentPage) {
        return Response.ok("Hello").build();
    }

//    @POST
//    public Response createCostumer(Customer newCustomer){
//
//    }

    @GET
    @Path("{id}")
    public Response getConsumer(@PathParam("id") String id) {
        if (id.equals("1")) {
            throw new ResourceNotFoundException("Any resource with id 1 was found");
        }

        return Response.ok(new Customer(UUID.randomUUID().toString(),
                "Julio",
                "Falbo",
                CustomerStatus.ENABLE,
                "julio.falbo.rj@gmail.com",
                LocalDateTime.now())).build();
    }

}
