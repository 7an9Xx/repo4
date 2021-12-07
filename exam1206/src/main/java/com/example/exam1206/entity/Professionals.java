package com.example.exam1206.entity;

public class Professionals {
    private int id;
    private String major_name;
    private String organization_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    @Override
    public String toString() {
        return "Professionals{" +
                "id=" + id +
                ", major_name='" + major_name + '\'' +
                ", organization_name='" + organization_name + '\'' +
                '}';
    }
}
