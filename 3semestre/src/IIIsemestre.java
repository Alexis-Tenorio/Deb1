package IIIs;
 import java.util.Scanner;
public class IIIsemestre {

	static 	Scanner  dato=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		//obtener el promedio de calificaciones de un grupo de n alumnos
		menu_principal();
	}
	static void menu_principal() throws InterruptedException{
		int x=0;
		while(x<=4){
		System.out.println("****Bienvenidos AL sistema Multiple Al3***");
		System.out.println("***Por favor elija una opcion***");
		System.out.println("*****************************");
		System.out.println("1. Promedio");
		System.out.println("2.Calificaciones");
		System.out.println("3.Descuento");
		System.out.println("4.Salir"); 		System.out.println("*****************************");
		System.out.println("Escoja una opcion");
		System.out.println("*****************************");
		String op=dato.next();
		System.out.println("Espere un momento.....");		

		Thread.sleep(1000);//*****************************************timepo d espera
		
		if (op.equals("1")){
			Promedio();
		}else if(op.equals("2")){
			Calificaciones();
		}else if(op.equals("3")){
			Descuento(); } else if (op.equals("4")){ System.out.println("Gracias--->>> TENGA UN BUEN DIA"); System.exit(0) ;} else System.out.println("INTENTE NUEVAMENTE-->COMANDO INCORRECTO****** ");
	}
	}
	 static void  Promedio() throws InterruptedException  {  
		int acum=0; System.out.println(" ***Bienvenido al Sistema*** ");
		System.out.println("Cuantas calificaciones Ingresara ");
	int al = dato.nextInt();
		for (int i=0;i<al;i++){
			System.out.println("-->Ingrese su calificacion<-- ");
			
			int ta = dato.nextInt();
			acum=acum+ta ;	
		}
		int promedio=(acum/al);
		System.out.println("***Su calificacion es-->"+promedio);
	
		System.out.println("***Desea seguir en el sistema***");
		System.out.println("*********************************");
		System.out.println("1. Menu principal");
		System.out.println("2.Promedio");
		System.out.println("3.Salir");
		int op=dato.nextInt();
		if(op==(1)){ menu_principal();
		} else if (op==(2)){ 	Promedio(); }else if(op==(3)){ System.out.println("Gracias por Utilzar el Sistema"); System.exit(0); } else
		{ System.out.println("Ha ingresado Un Comando Incorrecto"); }
	}
	 static void  Calificaciones() throws InterruptedException {
		
		int cont1=0,cont2=0;
		System.out.println(" ***Bienvenido al Sistema*** ");
		System.out.println("-->Por favor ingrese 50 calificaciones<--");
		int i,notas ;
		for ( i=0;i<50;i++){
			cont1++;
			System.out.println("-->Ingrese calificacion<--"+cont1);
			 notas =dato.nextInt();
		if(notas<=69){
				cont2++;
		}
		}
		int repro=cont2*100/50;
		System.out.println("*** Su porcentaje de REPROBADOS es--> "+repro+"%");
		System.out.println("***Desea seguir en el sistema***");
		System.out.println("*********************************");
		System.out.println("1. Menu principal");
		System.out.println("2.Desea Ingresar mas Calificaciones");
		System.out.println("3.Salir");
		int op=dato.nextInt();
		if(op==(1)){ menu_principal();
			
		}  else if (op==(3)){ Calificaciones(); }else if(op==(3)){ System.out.println("Gracias por Utilzar el Sistema"); System.exit(0); } else
		{ System.out.println("Ha ingresado Un Comando Incorrecto"); }
		}
		
	 static void Descuento() throws InterruptedException {
	int acum=0,acum1=0,acum2=0,acum3=0;
	System.out.println(" ***Bienvenido al Sistema*** ");
	System.out.println("**********************************");
	System.out.println("-->Ingrese su monto de su compra<--");
	int mc = dato.nextInt();
	System.out.println("**********************************");
	System.out.println("-->Escoga una Bolita de Color<--");
	System.out.println("1.ROJO");
	System.out.println("2.AMARILLO");
	System.out.println("3.BLANCA");
	int bol = dato.nextInt();
	if (bol==1){
		int total=(mc*50)/100;
		System.out.println("Su Total a pagar con el 50% de descuento es -->"+ total);
		
		 acum1=acum1+total;
	}
	if( bol==2){
		int total2=(mc*25)/100;
		System.out.println("Su Total a pagar con el 25% de descuento es -->"+ total2);
		System.out.println("Desea seguir ingresando  ");
		 acum2=acum2+total2;}
	if(bol==3){
		System.out.println("Su Total a pagar sin descuento es -->"+ mc);
		System.out.println("Desea seguir ingresando  ");
		 acum3=acum3+mc;
		 }
	acum=acum1+acum2+acum3;
	System.out.println("Monto total  en el dia:"+ acum);
	System.out.println("*********************************");
	System.out.println("Espere un momento.....");
	Thread.sleep(3000);
	System.out.println("***Desea seguir en el sistema***");
	System.out.println("*********************************");
	System.out.println("1. Menu principal");
	System.out.println("2.Al menu de Descuento");
	System.out.println("3.Salir");
	int op=dato.nextInt();
	if(op==(1)){
		menu_principal();
	} else if (op==(2)){Descuento(); }	else if(op==(3)){ System.out.println("Gracias por Utilzar el Sistema"); System.exit(0); } else
	{ System.out.println("Ha ingresado Un Comando Incorrecto"); }
	}

}
