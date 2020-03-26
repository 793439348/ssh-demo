package com.code.service;

import com.code.dao.DeptDao;
import com.code.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public String test() {
        return "index";
    }

    @Override
    public void add(Dept dept) {
        deptDao.add(dept);
    }
}
