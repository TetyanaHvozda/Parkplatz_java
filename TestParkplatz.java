public class TestParkplatz{
 public void testEinparken(){
   Parkplatz platz, platz2;
  
  Auto a0, a1, a2, a3, a4, a5, a6;
  
  a0 = new Auto("qwer", true, (short)2009, 'K', 20000);
  a1 = new Auto("qwtf", false, (short)2009, 'N', 18000);
  a2 = new Auto("qsdf", true, (short)2010, 'K', 20000);
  a3 = new Auto("sdfg", true, (short)2009, 'K', 9000);
  a4 = new Auto("ghjk", false, (short)2007, 'N', 12000);
  a5 = new Auto("iuyt", false, (short)2009, 'K', 10000);
  a6 = new Auto("okjh", true, (short)2012, 'N', 20000);
  
  platz = new Parkplatz();
  platz2 = new Parkplatz();
  
  platz.einparken(a0);
  platz.einparken(a0); //Fehler
  platz.einparken(a1);
  platz.einparken(a2);
  platz.einparken(a3);
  platz2.einparken(a3); //Fehler
  platz.einparken(null); //Fehler
  platz.printParkplatz;
 }
}
