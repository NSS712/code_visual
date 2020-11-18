package PROJECTS;

import java.util.ArrayList;

public class Function {
    String name;
    String body;    //函数体的定义
    ArrayList<Function> call_function =new ArrayList<>();
    public Function(String iname,String ibody, ArrayList<Function> icall_function){
        this.name=iname;
        this.body=ibody;
        this.call_function=icall_function;
    }
    public Function(String iname, String ibody){
        this.name=iname;
        this.body=ibody;
    }
}
