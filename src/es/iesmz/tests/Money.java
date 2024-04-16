package es.iesmz.tests;

public class Money {



    public static float change(TipoMoneda origen, TipoMoneda destino, float money){
        float monedaConvertida=0f;
        float monedaIntercambio;
        if(money>=0) {
            if (origen.equals(TipoMoneda.EUR)) {
                if (destino.equals(TipoMoneda.USD)) {
                    monedaConvertida = (float) (money * (1.18798));
                } else if (destino.equals(TipoMoneda.GBP)) {
                    monedaConvertida = (float) (money * 0.857839);
                }
            } else if (origen.equals(TipoMoneda.GBP)) {
                if (destino.equals(TipoMoneda.EUR)) {
                    monedaConvertida = (float) (money * 1.165826);
                    //TODO hacer cambio GBP DOLAR
                }else if(destino.equals(TipoMoneda.USD)){
                monedaIntercambio=(float)(money*1.165826);
                monedaConvertida=(float)(monedaIntercambio*1.18798);
            }
            } else if (origen.equals(TipoMoneda.USD)) {
                if (destino.equals(TipoMoneda.EUR)) {
                    monedaConvertida = (float) (money * 0.841815);
                }else if(destino.equals(TipoMoneda.GBP)){
                    monedaIntercambio=(float)(money*0.841815);
                    monedaConvertida=(float)(monedaIntercambio*0.857839);
                }
                //TODO hacer cambio USD a GBP

            } else {
                monedaConvertida = -1;
            }
        }else{
            monedaConvertida=-1;
        }

        return monedaConvertida;
    }
}
