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
        //assertEquals(28.37f,resultado);
        assertEquals(28.37f,resultado);
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
        assertEquals(1165.83f,resultado);
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
        assertEquals(201.21f,resultado);
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
        assertEquals(37.51f,resultado);
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
        assertEquals(138.49f,resultado);
    }


}