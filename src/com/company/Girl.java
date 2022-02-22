package com.company;


class Girl {
    private Flower flower;
    private short age;


    public Girl(short age){
        this.age = age;
    }


    public Flower getFlower() {
        return flower;
    }

    public void receiveFlower(Flower flower) {
        this.flower = flower;
    }

    public short age() {
        return age;
    }

//    public void setAge(short age) {
//        this.age = age;
//    }
}
