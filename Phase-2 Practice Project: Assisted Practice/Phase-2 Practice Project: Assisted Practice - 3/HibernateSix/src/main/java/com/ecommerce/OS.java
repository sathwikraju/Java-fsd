package com.ecommerce;

public class OS {
    private long OSID;
    private String name;

    public OS() {
        // Default constructor
    }

    public long getOSID() {
        return this.OSID;
    }

    public void setOSID(long OSID) {
        this.OSID = OSID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
