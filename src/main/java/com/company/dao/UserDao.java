package com.company.dao;

import com.company.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDao {
    private static HashMap<Long, User> users = new HashMap<>();
    static {
        User user = User.builder().name("Name").password("007").build();
        user.setKey("+"+user.getPassword()+"000"+user.getName()+"+");
        users.put(1l,user);
    }

    public List<User> getUser(){
        return new ArrayList<>(users.values());
    }
}

//· Принимает user_name / password если всё OK возвращает сгенерированный ключ в виде текста, иначе ошибка.
// (Алгоритм генерации можете взять или придумать самостоятельно)