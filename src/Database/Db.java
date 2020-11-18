package Database;

import PROJECTS.Function;
import PROJECTS.Project;

import java.util.ArrayList;

public class Db {

    //把项目存入数据库
    static int store(Project p1){
        return 0;
    }

    //把项目从数据库读入对象
    static Project p1(String str){
        Project pro=new Project();
        return pro;
    }

    //显示项目名称列表
    static public ArrayList arr_name(){
        ArrayList<String> a1 =new ArrayList<String>();
        return a1;
    }

    //返回项目对象ArrayList
    static public ArrayList arr_pro(){
        ArrayList<Project> a1 =new ArrayList<Project>();
        return a1;
    }
}
