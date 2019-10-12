package com.example.myexample1;

import com.example.myexample1.annotation.DemoAnnotation;
import com.example.myexample1.domain.DemoBo;
import org.junit.Test;

public class MyExample1ApplicationTests {

    @Test
    public void contextLoads() {
        DemoBo demoBo = new DemoBo();
        try {
            DemoAnnotation annotation = demoBo.getClass()
                    .getDeclaredField("name")
                    .getAnnotation(DemoAnnotation.class);
            System.out.println(annotation.username());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
