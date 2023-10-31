package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    private int height;

    private int weight;

    private String nickname;

    private int howManySiblings;

    private boolean oldestChild;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name;
    }

    public void setAge(int age) { this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public int getHeight(){return this.height;}

    public int getWeight(){return this.weight;}

    public String getNickname(){return this.nickname;}

    public int getHowManySiblings(){return this.howManySiblings;}

    public boolean getOldestChild(){return this.oldestChild;}

    public void setHeight(int height){this.height = height;}

    public void setWeight(int weight){this.weight = weight;}

    public void setNickname(String nickname){this.nickname = nickname;}

    public void setHowManySiblings(int howManySiblings){this.howManySiblings = howManySiblings;}

    public void setOldestChild(boolean oldestChild){this.oldestChild = oldestChild;}

}
