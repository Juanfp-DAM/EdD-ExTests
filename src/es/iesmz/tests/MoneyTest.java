package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @org.junit.jupiter.api.Test
    void tipoCambio1(){
        //ARRANGE
        TipoMoneda origen = TipoMoneda.EUR;
        TipoMoneda destino= TipoMoneda.USD;
        float money=23.88f;
        //ACT
        float resultado=Money.change(origen,destino,money);
        //ASSERT
        assertEquals(28.37f,2,resultado);
    }


    @Test
    void tipoCambio2(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.GBP;
        TipoMoneda destino=TipoMoneda.EUR;
        float money=1000.0f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(1165.83f,2,resultado);
    }


    @Test
    void tipoCambio3(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.EUR;
        TipoMoneda destino=TipoMoneda.GBP;
        float money=234.56f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(201.21f,2,resultado);
    }

    @Test
    void tipoCambio4(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.USD;
        TipoMoneda destino=TipoMoneda.EUR;
        float money=44.56f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(37.51f,2,resultado);
    }

    @Test
    void tipoCambio5(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.GBP;
        TipoMoneda destino=TipoMoneda.USD;
        float money=100.0f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(138.49f,2,resultado);
    }

    @Test
    void tipoCambio6(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.USD;
        TipoMoneda destino=TipoMoneda.GBP;
        float money=1000.0f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(722.14f,2,resultado);
    }


    @Test
    void tipoCambio7(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.PTS;
        TipoMoneda destino=TipoMoneda.EUR;
        float money=100.0f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(-1f,resultado);
    }


    @Test
    void tipoCambio8(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.EUR;
        TipoMoneda destino=TipoMoneda.PTS;
        float money=123.3f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(-1f,resultado);
    }

    @Test
    void tipoCambio9(){
        //ARRANGE
        TipoMoneda origen=TipoMoneda.USD;
        TipoMoneda destino=TipoMoneda.EUR;
        float money=-167.34f;
        //ACT
        float resultado=Money.change(origen, destino,money);
        //ASSERT
        assertEquals(-1f,resultado);
    }

}