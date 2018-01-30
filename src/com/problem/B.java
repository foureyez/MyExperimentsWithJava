package com.problem;

public class B extends A {
    private int bMember;

    public int getbMember() {
        return bMember;
    }

    public void setbMember(int bMember) {
        this.bMember = bMember;
    }

    @Override
    public String toString() {
        return "B [bMember=" + bMember + "]";
    }

}
