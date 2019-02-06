package com.juliofalbo.api.filters;

import lombok.extern.java.Log;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@Log
public class RequestFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        log.info("Receiving request for:"
                + containerRequestContext.getUriInfo().getAbsolutePath().toString());
    }
}
