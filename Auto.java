public class Auto{
 private String kennzeichen;
 private boolean automatik;
 private short baujahr;
 private char type;
 private double preis;
 private Parkplatz parkplatz;
  
  public Auto(){
   setKennzeichen("Werner");
   setAutomatik(true);
   setBaujahr((short)2017);
   setType("K");
   setPreis(15000);
  }
  
  public Auto(String kennzeichen, short baujahr, boolean automatik, char type, double preis){
   setKennzeichen(kennzeichen);
   setAutomatik(automatik);
   setBaujahr(baujahr);
   setType(type);
   setPreis(preis);
  }
  
  public String getKennzeichen(){
   return kennzeichen; 
  }
  public short getBaujahr(){
   return baujahr; 
  }
  public boolean getAutomatik(){
   return automatik; 
  }
  public double getPreis(){
   return preis; 
  }
  public Parkplatz getParkplatz(){
   return parkplatz; 
  }
  
  public void setKennzeichen(String kennzeichen){
   this.kennzeichen = kennzeichen; 
  }
  public void setBaujahr(short baujahr){
   this.baujahr = baujahr; 
  }
  public void setAutomatik(boolean automatik){
   this.automatik = automatik; 
  }
  public void setPreis(double preis){
   this.preis = preis; 
  }
  public void setParkplatz(Parkplatz parkplatz){
   this.parkplatz = parkplatz; 
  }
  
  public void ausparken(){
    if (parkplatz != null){
     parkplatz.ausparken(this); 
    }else{
     System.out.println("Fehler"); 
    }
  }
}  
