package com.tao.springcloud.pojo;

import java.io.Serializable;

public class Dept implements Serializable {

    private long deptno;
    private String dname;
    private String dbsource;

    public Dept(String dname) {
        this.dname = dname;
    }

    public Dept(){}

    public long getDeptno() {
        return deptno;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbsource() {
        return dbsource;
    }

    public void setDbsource(String dbsource) {
        this.dbsource = dbsource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", dbsource='" + dbsource + '\'' +
                '}';
    }
}
