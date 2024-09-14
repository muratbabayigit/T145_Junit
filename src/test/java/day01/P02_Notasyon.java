package day01;

import org.junit.jupiter.api.*;

public class P02_Notasyon {

    @BeforeAll
    public static void  setUp(){
        System.out.println("Test İşlemi başlatılıyor");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("Tüm Test işlemi bitirildi");
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Sıradaki test Çalıştırılacak");
    }
    @AfterEach
    public void afterEachTest(){
        System.out.println("Var ise bir sonraki test çalıştırılacak");
    }

    @Test
    public void cem(){
        System.out.println("Cem Bakır\nQA Engineer");
    }

    @Test
    public void murat(){
        System.out.println("Murat Dönmezdemir\nQA Engineer");
    }

    @Test
    public void pinar(){
       System.out.println("Pınar Çay\nQA Engineer");
    }
}
