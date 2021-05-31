package ru.trytouse.web.api;

import ru.trytouse.quarkus.common.HiFacade;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class HiWebApi {

    @Inject
    HiFacade hiFacade;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return hiFacade.getHiWord();
    }

}