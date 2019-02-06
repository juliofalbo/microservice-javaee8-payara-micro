package com.juliofalbo.api.exceptions.mappers;

import com.juliofalbo.api.exceptions.ResourceNotFoundException;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ResourceNotFoundMapper implements ExceptionMapper<ResourceNotFoundException> {
    @Override
    public Response toResponse(ResourceNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND)
                .header("X-Validation-Error", e.getMessage())
                .entity(e.getMessage()).build();
    }
}
