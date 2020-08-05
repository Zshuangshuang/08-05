package com.Zss.src;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-05
 * Time:21:47
 **/
class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+"Animal:正在吃");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("Animal(String)");
    }

}
class Cat extends Animal{
    public Cat(String name){
        super(name);
        System.out.println("Cat:name");
  /*public void eat(){
      System.out.println(this.name+"Cat:正在吃");*/
  }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
        System.out.println("name:Bird               ");
    }
    public void fly(){
        System.out.println(this.name+"Bird:正在飞");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("喵喵");
        cat.eat();
        Bird bird = new Bird("八哥");
        bird.fly();
    }
}
