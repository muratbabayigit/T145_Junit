package day01;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class P01_Notasyon {

    @Test
    public void testC(){
        System.out.println("C testi Çalıştı");
    }

    @Test
    public void testA(){
        System.out.println("A testi Çalıştı");
    }

    @Test @Disabled
    public void testB(){
        System.out.println("B testi Çalıştı");
    }



}
