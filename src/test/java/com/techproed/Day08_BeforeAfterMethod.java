package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setUp(){
        System.out.println("Setup Calisti");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Teardown calisti");
    }

    @Before
    public void methoddanOnce() {
        System.out.println("methoddanOnce calisti");
    }

    @After
    public void methoddanSonra() {
        System.out.println("methoddanSonra calisti");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 calisti");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 calisti");
    }


}
