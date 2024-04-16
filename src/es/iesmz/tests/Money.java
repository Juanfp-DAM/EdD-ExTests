package es.iesmz.tests;

public class Money {

    private static final float eurUsd = 1.18798f;
    private static final float usdEur = 0.841815f;
    private static final float eurGbp=0.857839f;
    private static final float gbpEur=1.165826f;

    public static float change(TipoMoneda origen, TipoMoneda destino, float money){
        float monedaConvertida=0f;
        float monedaIntercambio;
        if(money>=0) {
            if (origen.equals(TipoMoneda.EUR)) {
                if (destino.equals(TipoMoneda.USD)) {
                    monedaConvertida = (float) (money * eurUsd);
                } else if (destino.equals(TipoMoneda.GBP)) {
                    monedaConvertida = (float) (money * eurGbp);
                }
            } else if (origen.equals(TipoMoneda.GBP)) {
                if (destino.equals(TipoMoneda.EUR)) {
                    monedaConvertida = (float) (money * gbpEur);
                    //TODO hacer cambio GBP DOLAR
                }else if(destino.equals(TipoMoneda.USD)){
                monedaIntercambio=(float)(money*gbpEur);
                monedaConvertida=(float)(monedaIntercambio*eurUsd);
            }
            } else if (origen.equals(TipoMoneda.USD)) {
                if (destino.equals(TipoMoneda.EUR)) {
                    monedaConvertida = (float) (money * usdEur);
                }else if(destino.equals(TipoMoneda.GBP)){
                    monedaIntercambio=(float)(money*usdEur);
                    monedaConvertida=(float)(monedaIntercambio*eurGbp);
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
