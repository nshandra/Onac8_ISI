//package sut_code;

public class Embotelladora {

  /**
  * @param pequenas botellas pequeñas
  * @param grandes botellas grandes
  * @param total litros totales
  * @return numero de botellas pequeñas necesarias
  * @throws IllegalArgumentException if params <= 0
  */
  public static int calculaBotellasPequenas(int pequenas, int grandes, int total) {
    //minimizar pequeñas (primero se rellenan grandes)

    if (pequenas < 0 || grandes < 0 || total <= 0 || (pequenas == 0 && grandes == 0)){
      throw new IllegalArgumentException("Embotelladora.calculaBotellasPequenas");
    }

    if (pequenas == 0){ //tiene que haber grandes si o si
      if (total % grandes == 0){
        return 0; //necesitamos 0 pequeñas
      else{
        throw algo; //no rellenamos todos los litros solo con las grandes
      }
    }

    if (grandes == 0){ //tiene que haber pequeñas si o si
      if (total % pequenas == 0){
        return total/pequenas;
      }else{
        throw algo; //no rellenamos todos los litros solo con las pequeñas
      }
    }

    //caso grandes > pequeñas | pequeñas > grandes
    if (total % grandes == 0){
      return 0;
    }else{
      double resto = total % grandes;
      if (resto % pequenas == 0){
        return resto/pequenas;
      }else{
        throw algo; //no rellenamos todos los litros con grandes+peq
      }
    }
  }
}
