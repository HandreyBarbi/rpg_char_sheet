import java.util.Scanner;

public class rpg_char_sheet {
    public static void main(String[] args) throws Exception {
        //variaveis: species, classe, lvl, bp, (ATRIBUTOS --->) des, des_mod,
	    // con, con_mod, intel, intel_mod, sab, sab_mod, car, car_mod
	   String bp;
	   String forca_mod, des_mod, con_mod, intel_mod, sab_mod, car_mod;
	   
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println(" ----------<o>----------");
	    System.out.println(" -- Qual sua espécie? -- ");
		System.out.print(" Digite: ");
		String species = scanner.nextLine();
		System.out.println("");
	    
		System.out.println(" -- Qual sua classe? -- ");
		System.out.print(" Digite: ");
		String classe = scanner.nextLine();
		System.out.println("");
		
		System.out.println(" -- Qual seu nível? -- ");
		System.out.print(" Digite: ");
		int lvl = scanner.nextInt();
		System.out.println("");
		System.out.println(" ----------<o>----------");
	    
	    //testes de modificador de Bonus de Proficiencia
	    if (lvl==1 || lvl==2 || lvl==3 || lvl==4) {
	        bp = "+2";
	    }
	     else if (lvl==5 || lvl==6 || lvl==7 || lvl==8){
	            bp = "+3";
	      }
	         else if (lvl==9 || lvl==10 || lvl==11 || lvl==12){
	             bp = "+4";
	          }
	             else if (lvl==13 || lvl==14 || lvl==15 || lvl==16){
	                bp = "+5";   
	              }
	                 else {
	                     bp = ("+5"); 
	                  }
	    System.out.println(" -- ATRIBUTOS --");
	    System.out.println("");
	    System.out.println(" *ATENÇÃO! O Atributo deve estar entre 8 e 20!");
	    System.out.println(" Digite sua: ");
	    System.out.print(" FORÇA -> ");
	        int forca = scanner.nextInt();
	    
	    System.out.print(" DESTREZA -> ");
	        int des = scanner.nextInt();
	    
	    System.out.print(" CONSTITUIÇÃO -> ");
	        int con = scanner.nextInt();
	    
	    System.out.print(" INTELIGÊNCIA -> ");
	        int intel = scanner.nextInt();
	    
	    System.out.print(" SABEDORIA -> ");
	        int sab = scanner.nextInt();
	    
	    System.out.print(" CARISMA -> ");
	        int car = scanner.nextInt();
	    System.out.println("");
	    //testes de modificador de Atributos
	    //FORÇA
	    if (forca == 8 || forca==9) {
	        forca_mod = "-1";
	     } else if (forca == 10 || forca==11) {
	        forca_mod = "+0";
	         } else if (forca == 12 || forca==13) {
	            forca_mod = "+1";
	             } else if (forca == 14 || forca==15) {
	              forca_mod = "+2";
	                 } else if (forca == 16 || forca==17) {
	                 forca_mod = "+3";
	                     } else if (forca == 18 || forca==19) {
	                      forca_mod = "+4";
	                          } else {
	                            forca_mod = "+5";
	    } //des
	     if (des == 8 || des==9) {
	        des_mod = "-1";
	     } else if (des == 10 || des==11) {
	        des_mod = "+0";
	         } else if (des == 12 || des==13) {
	            des_mod = "+1";
	             } else if (des == 14 || des==15) {
	              des_mod = "+2";
	                 } else if (des == 16 || des==17) {
	                 des_mod = "+3";
	                     } else if (des == 18 || des==19) {
	                       des_mod = "+4";
	                          } else {
	                             des_mod = "+5";
	   } //con
	   
	   if (con == 8 || con==9) {
	        con_mod = "-1";
	     } else if (con == 10 || con==11) {
	        con_mod = "+0";
	         } else if (con == 12 || con==13) {
	            con_mod = "+1";
	             } else if (con == 14 || con==15) {
	              con_mod = "+2";
	                 } else if (con == 16 || con==17) {
	                 con_mod = "+3";
	                     } else if (con == 18 || con==19) {
	                       con_mod = "+4";
	                          } else {
	                             con_mod = "+5";
	   } //intel
	    if (intel == 8 || intel==9) {
	        intel_mod = "-1";
	        
	     } else if (intel == 10 || intel==11) {
	        intel_mod = "+0";
	        
	         } else if (intel == 12 || intel==13) {
	            intel_mod = "+1";
	            
	             } else if (intel == 14 || intel==15) {
	              intel_mod = "+2";
	              
	                 } else if (intel == 16 || intel==17) {
	                 intel_mod = "+3";
	                 
	                     } else if (intel == 18 || intel==19) {
	                       intel_mod = "+4";
	                       
	                          } else {
	                             intel_mod = "+5";
	   } //sab
	   if (sab == 8 || sab==9) {
	        sab_mod = "-1";
	        
	     } else if (sab == 10 || sab==11) {
	        sab_mod = "+0";
	        
	         } else if (sab == 12 || sab==13) {
	            sab_mod = "+1";
	            
	             } else if (sab == 14 || sab==15) {
	              sab_mod = "+2";
	              
	                 } else if (sab == 16 || sab==17) {
	                 sab_mod = "+3";
	                 
	                     } else if (sab == 18 || sab==19) {
	                       sab_mod = "+4";
	                       
	                          } else {
	                             sab_mod = "+5";
	   } //car
	   if (car == 8 || car==9) {
	        car_mod = "-1";
	        
	     } else if (car == 10 || car==11) {
	        car_mod = "+0";
	        
	         } else if (car == 12 || car==13) {
	            car_mod = "+1";
	            
	             } else if (car == 14 || car==15) {
	              car_mod = "+2";
	              
	                 } else if (car == 16 || car==17) {
	                 car_mod = "+3";
	                 
	                     } else if (car == 18 || car==19) {
	                       car_mod = "+4";
	                       
	                          } else {
	                             car_mod = "+5";
	     }
		//output de ficha
		System.out.println(" ----------<o>----------");
		System.out.println(" >> Ficha Completa <<");
		System.out.println(" Espécie: "+species);
		System.out.println(" Classe: " +classe);
		System.out.println(" Nível: "+lvl);
		System.out.println(" Bônus de Proficiência: "+bp);
		System.out.println("");
		System.out.println(" > Atributos <");
		System.out.println(" FOR |" +forca+ "| mod. "+forca_mod);
		System.out.println(" DES |" +des+ "| mod. "+des_mod);
		System.out.println(" CON |" +con+ "| mod. "+con_mod);
		System.out.println(" INT |" +intel+ "| mod. "+intel_mod);
		System.out.println(" SAB |" +sab+ "| mod. "+sab_mod);
		System.out.println(" CAR |" +car+ "| mod. "+car_mod);
	} //in progress!
}
