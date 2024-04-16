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
                    monedaConvertida = (money * eurUsd);
                } else if (destino.equals(TipoMoneda.GBP)) {
                    monedaConvertida = (money * eurGbp);
                }else{
                    monedaConvertida=-1;
                }
            } else if (origen.equals(TipoMoneda.GBP)) {
                if (destino.equals(TipoMoneda.EUR)) {
                    monedaConvertida =  (money * gbpEur);
                    //TODO hacer cambio GBP DOLAR
                }else if(destino.equals(TipoMoneda.USD)){
                monedaIntercambio=(money*gbpEur);
                monedaConvertida=(monedaIntercambio*eurUsd);
                }else{
                    monedaConvertida=-1;
                }
            } else if (origen.equals(TipoMoneda.USD)) {
                if (destino.equals(TipoMoneda.EUR)) {
                    monedaConvertida =  (money * usdEur);
                }else if(destino.equals(TipoMoneda.GBP)){
                    monedaIntercambio=(money*usdEur);
                    monedaConvertida=(monedaIntercambio*eurGbp);
                }else{
                    monedaConvertida=-1;
                }
            } else {
                monedaConvertida = -1;
            }
        }else{
            monedaConvertida=-1;
        }

        return monedaConvertida;
    }
}
