package com.gupao.edu.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    public static Map<String,IEmployee> employeeMap = new HashMap<>();

    public Leader(){
        employeeMap.put("加密",new EmployeeA());
        employeeMap.put("解密",new EmployeeB());
    }
    public void doing(String command){
        employeeMap.get(command).doing();
    }
}
