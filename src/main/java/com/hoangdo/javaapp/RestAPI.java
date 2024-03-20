package com.hoangdo.javaapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/person")
public class RestAPI {
    private Set<Person> person2 = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public RestAPI() {
        person2.add(new Person("DHV", "12", "Noop"));
        person2.add(new Person("VHD", "23", "HIHI"));
    }

    @GET
    public Set<Person> list() {
        return person2;
    }

    @POST
    public Set<Person> add(Person pers) {
        person2.add(pers);
        return person2;
    }

    @DELETE
    public Set<Person> delete(Person pers) {
        person2.removeIf(existingPerson -> existingPerson.name.contentEquals(pers.name));
        return person2;
    }
}

