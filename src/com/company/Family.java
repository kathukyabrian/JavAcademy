package com.company;

public enum Family {
    BRIAN(20),
    JUDY(25),
    MIKE(30),
    PETER(32);

    private final int age;

    Family(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}
