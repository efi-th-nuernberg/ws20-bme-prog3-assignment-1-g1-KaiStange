class Main {
  public static void main(String[] args) {
	int zahl = 0;
      	for (int i = 0; i <= 200; i++){
          
          zahl = zahl + 1;
          int vorgänger = zahl - 1;
          int ergebniss = zahl + vorgänger;

          if (zahl % 5 == 0){
             System.out.println("Zahl ist durch 5 Teilbar");
          }

          if (zahl % 10 == 9 ){
            System.out.println("Zahl ist durch 9 Teilbar");
         }

          if ((zahl + vorgänger) % 3 == 0){
            System.out.println("Vorgänger " + vorgänger + " addiert mit Zahl " + zahl +" ergibt " + ergebniss + 
            " ist durch 3 Teilbar");
          }        
        }     
  } 
}