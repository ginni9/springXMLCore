package org.springXMLCore.beans;

import java.util.Date;

public class Department {
    private String deptName;
    private Date createdOn;

    public Department(String deptName,Date createdOn) {
        this.deptName = deptName;
        this.createdOn=createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}

