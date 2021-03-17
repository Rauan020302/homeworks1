package com.company.dao;

import com.company.model.Sum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumDao {
    private static HashMap<Long, Sum> sums = new HashMap<>();
    static {

        Sum sum = Sum.builder().first(20).second(20).build();
        sum.setTotal(sum.getFirst()+sum.getSecond());

        sums.put(1l,sum);
    }
    public List<Sum> getSum(){
        return new ArrayList<>(sums.values());
    }
}

