package com.lql.Basic;

import com.lql.leetcode.AddString;

/**
 * Created by LQL on 2017/3/11.
 */
public class CloneTest {

    class Man implements Cloneable{
        public String name;
        public String age;
        public Address address;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Man man = null;
            man =(Man) super.clone();
            return man;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    class Address{
        public String address;
        public Address(){

        }
        public Address(String address){
            this.address = address;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "address='" + address + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        CloneTest cloneTest = new CloneTest();
        Man man = cloneTest.new Man();
        man.name = "jack";
        man.age = "12";
        man.address = cloneTest.new Address("beijing");
        try {
            Man man1 =(Man) man.clone();
            man.name = "jone";
            man.age = "20";
            man.address.address = "上海";
            System.out.println("man1--->" + man1);
            System.out.println("man--->" + man);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
