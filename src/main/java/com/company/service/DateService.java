package com.company.service;

import com.company.dao.DateDao;
import com.company.model.CurrentTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.List;

@Path("/date")
public class DateService {
    private DateDao dateDao = new DateDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<CurrentTime> getTime(){
        return dateDao.getTime();
    }
//    @GET
//    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//    public Date getDate(){
//        return new Date();
//    }
}
