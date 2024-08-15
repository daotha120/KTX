package com.example.KTX;

public class SinhVien {
    private String name;
    private Double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
