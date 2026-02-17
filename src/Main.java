void main(String[] args){
    /*
    System.out.println("Hola Mundo");
    System.out.println("Brayan Steven Esquivel Rojas C++");
    System.out.println("Solucion Arreglar Ruta");

    //Variables

    int numero1 = 5;
    int numero2 = 15;

    int suma;

    int n1=45, n2=36, resta;

    suma =numero1+numero2;

    System.out.println("La suma es: "+suma);

    //Variable decimal

    double dato=145;
    System.out.println("La raiz de "+dato+" es: "+Math.sqrt(dato));

    //Vraibles cadena

    String nombre = "Brayan Esquivel";
    System.out.println("Bienvenido: "+nombre);

    //Variables caracter

    char letra = 'A'; //Equivalente en codigo ASCII
    System.out.println("La letra es: "+letra);

    //Variables logico

    boolean estado = false;
    System.out.println("El valor actual es: "+estado);

    //Entrada de datos

     */

    Scanner teclado = new Scanner(System.in); //clase objeto instancia = creacion en memoria

    /*
    int n1,n2;
    System.out.println("Ingrese el primer valor");
    n1=teclado.nextInt();

    System.out.println("Ingrese el segundo valor");
    n2=teclado.nextInt();

    System.out.println("Ls suma es: "+(n1+n2));
    */

    //Condicionales
    /*
    //If
    int n;

    System.out.println("Ingrese un numero");
    n=teclado.nextInt();
    if (n>0){
        System.out.println("Numero Positivo");
    }else if (n==0) {
        System.out.println("El numero es 0");
    }else {
        System.out.println("Numero negativo");
    }
     */
    /*
    //Switch case

    int n;
    System.out.println("""
            1. Lunes
            2. Martes
            3. Miercoles
            4. Jueves
            5. Viernes
            6. Sabado
            7. Domingo
            """);
    System.out.println("Ingrese el numero del dia");
    n=teclado.nextInt();
    switch (n){
        case 1:
            System.out.println("El dia es: Lunes");
            break;
        case 2:
            System.out.println("El dia es: Martes");
            break;
        case 3:
            System.out.println("El dia es: Miercoles");
            break;
        case 4:
            System.out.println("El dia es: Jueves");
            break;
        case 5:
            System.out.println("El dia es: Viernes");
            break;
        case 6:
            System.out.println("El dia es: Sabado");
            break;
        case 7:
            System.out.println("El dia es: Domingo");
            break;
        default:
            System.out.println("El dia no esta");
    }
     */

    //Tarea: Nueva forma de switch case

    //Ciclos

    //For
    /*
    int suma=0;
    for (int i=1;i<=100;i++){
        suma=+i;
    }
    System.out.println(suma);
     */

    //While
    int n1=-1,n2=(int)(Math.random()*(10-0+1)+0);
    System.out.println("Adivina el numero entre 0 a 10");
    while (n1!=n2){
        System.out.println("Digita un numero: ");
        n1=teclado.nextInt();
    }
}