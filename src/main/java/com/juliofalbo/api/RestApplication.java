package com.juliofalbo.api;

import com.juliofalbo.api.exceptions.mappers.ResourceNotFoundMapper;
import com.juliofalbo.api.filters.CORSFilter;
import com.juliofalbo.api.filters.RequestFilter;
import com.juliofalbo.api.providers.JacksonProvider;
import com.juliofalbo.api.resources.CustomerResource;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(JacksonJsonProvider.class);
        classes.add(JacksonProvider.class);
        classes.add(CustomerResource.class);
        classes.add(ResourceNotFoundMapper.class);
        classes.add(RequestFilter.class);
        classes.add(CORSFilter.class);
        return classes;
    }
}
