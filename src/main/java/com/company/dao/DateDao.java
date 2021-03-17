package com.company.dao;

import com.company.model.CurrentTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class DateDao {

    private static HashMap<Long, CurrentTime> dates = new HashMap<>();

    static {
        CurrentTime currentTime = CurrentTime.builder().date(new Date()).build();
        dates.put(1l,currentTime);
    }
    public List<CurrentTime> getTime(){
        return new ArrayList<>(dates.values());
    }
}
