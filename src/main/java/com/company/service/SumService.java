package com.company.service;

import com.company.dao.SumDao;
import com.company.model.Sum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/sum")
public class SumService {
    private SumDao sumDao = new SumDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Sum> getSum(){
        return sumDao.getSum();
    }
}


