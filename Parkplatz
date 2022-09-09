public class Parkplatz{
  private int anzahl;
  private Auto[] platze;
  
  public Parkplatz(){
    platze = new Auto[5];
    anzahl = 0;
  }
  
  public void einparken(Auto neu){
  if (neu != null){
    if (neu.getParkplatz == null){
      if (anzahl < platze.length){
        platze[anzahl] = neu;
        neu.setParkplatz(this);
        anzahl++;
        }else{
          System.out.println("Fehler: kein Platz");
        }
      }else{
        System.out.println("Fehler: das Auto ist schon auf einem Parkplatz geparkt");
        }
    }else{
      System.out.println("Fehler: neu darf nicht null sein");
    }
  }
  
  public String toString(){
    String erg " ";
    for (int i=0; i<anzahl; i++){
      erg += platze[i] + "\n";
    }
    return erg;
  }
  
  public void ausparken(int pos){
    if (pos>=0 && pos<this.anzahl){
      platze[pos].setParkplatz(null);
      for(int i=pos+1; i<anzahl; i++){
        platze[i-1] = platze[i];
      }
      this.anzahl--;
    }
  }
  
  public void ausparken(Auto wer){
    boolean gefunden=false;
    if(wer==null){
      System.out.println("null");
      return;
    }
    for(int i=0; i<anzahl; i++){
      if (platze[i] == wer){
        this.ausparken(i);
        gefunden = true;
        break;
      }
    }
    if (gefunden == false){
      System.out.println("nichr gefunden");
      return;
    }
  }
  
  public void sortiereNachPreis(){
    boolean gefunden = true;
    for (int i=j; gefunden; j++){
      gefunden = false;
      for (int i=0; i<platze.length-1-j; i++){
        if platze[i].getPreis()>platze[i+1].getPreis()){
          tausche(i, i+1);
          gefunden = true;
        }
      }
    }
  }
  private void tausche(int i; int j){
    Auto tmp;
    tmp = platze[i];
    platze[i] = platze[j];
    platze[j] = tmp;
  }
}
