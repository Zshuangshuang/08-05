package com.Zss.src;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-05
 * Time:22:04
 **/
class Base{
    public int a;
}
class Derive extends Base{
    public int b;
}
public class TestDemo2 {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.a = 99;

    }
}
