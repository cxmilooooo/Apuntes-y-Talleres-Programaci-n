package clase1;
import java.util.Scanner;

/**
 *
 * @author jcpr1
 */
public class Principal {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    contraseña();
    }

   

    public static void areaCirculo() {
        double radio, pi, area;

        System.out.println("Programa para calcular el área del círculo");
        System.out.println("Ingrese el radio del círculo");
        radio = input.nextDouble();
        pi = 3.1415926;
        area = pi * radio * radio;
        System.out.println("El área del círculo es: " + area + " cm²");
    }

    public static void areaTriangulo() {
        double base, altura, area;
        System.out.println("Programa para calcular el área de un triángulo");
        System.out.println("Ingrese la base del triángulo");
        base = input.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        altura = input.nextDouble();
        area = base * altura / 2;
        System.out.println("El área del triángulo es " + area);
    }

    public static void areaRectangulo() {
        double base, altura, area;
        System.out.println("Programa para calcular el área de un rectángulo");
        System.out.println("Ingrese la base del rectángulo");
        base = input.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        altura = input.nextDouble();
        area = base * altura;
        System.out.println("El área del rectángulo es " + area);
    }

    public static void numeroMayor() {
        int num1, num2;
        System.out.println("Programa para encontrar el mayor de 2 números");
        System.out.println("Ingrese su primer número");
        num1 = input.nextInt();
        System.out.println("Ingrese su segundo número");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número es el mayor");
        } else if (num2 > num1) {
            System.out.println("El segundo número es el mayor");
        } else {
            System.out.println("Los números son iguales");
        }
    }
    public static void declararRenta() {
        int edad, ingresos, patrimonio;
        System.out.println("Programa para saber si debe declarar renta");
        System.out.println("¿Cuál es su edad?");
        edad = input.nextInt();
        System.out.println("¿Cuánto es su ingreso mensual?");
        ingresos = input.nextInt();
        System.out.println("¿Cuánto cuesta su patrimonio?");
        patrimonio = input.nextInt();

        if (edad >= 18) {
            if (ingresos > 3500000 || patrimonio > 180000000) {
                System.out.println("Debe declarar");
            } else {
                System.out.println("No debe declarar");
            }
        } else {
            System.out.println("No debe declarar");
        }
    }

    public static void operaciones() {
        double a = 12;
        double b = 5;
        double c = 9;
        double d = 7;
        double operacion1 = a + b * c;
        double operacion2 = (a + b) * c;
        double operacion3 = ((a + c - b) * b) / (c + d);
        double operacion4 = Math.pow(c + d, b);
        boolean operacion5 = a >= c;
        boolean operacion6 = a - b < d;
        boolean operacion7 = d > c - b;
        boolean operacion8 = d - b <= a - c;
       
        
        System.out.println("a + b * c = " + operacion1);
        System.out.println("(a + b) * c = " + operacion2);
        System.out.println("((a + c - b) * b) / (c + d) = " + operacion3);
        System.out.println("(c + d) ^ b = " + operacion4);
        System.out.println("a >= c = " + operacion5);
        System.out.println("a - b < d = " + operacion6);
        System.out.println("d > c - b = " + operacion7);
        System.out.println("d - b <= a - c = " + operacion8);
    }
     public static void Saludar() {
        String nombre;
        String ciudad;
        String hobby;
        int edad;
        double estatura;

        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("¿En qué ciudad vive?");
        ciudad = input.nextLine();
        System.out.println("Ingrese su estatura (en metros)");
        estatura = input.nextDouble();
        input.nextLine();
        System.out.println("¿Cuál es su hobby?");
        hobby = input.nextLine();
        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años de edad, vivo en " + ciudad + ", mido " + estatura + "m, y mi hobby es " + hobby + ".");
    }
     public static void numeroPar() {
         
         
         int numero ;
        
         System.out.println("Programa para conocer si un numero entero es par o impar");
         System.out.println("Ingrese un numero ");
         numero =input.nextInt();

        if  (numero % 2 ==0) {
            System.out.println("es par");
        }else {
                System.out.println("no es par");
                }}
    public static void NumeroMayor() {
    double num1, num2, num3;
        System.out.println("Programa para encontrar el mayor de 3 números");
        System.out.println("Ingrese su primer número");
        num1 = input.nextDouble();
        System.out.println("Ingrese su segundo número");
        num2 = input.nextDouble();
        System.out.println("Ingrese su tercer número");
        num3 = input.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El primer número es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El segundo número es el mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El tercer número es el mayor");
        } else {
            System.out.println("Los números son iguales");
        }
    }
public static void promedio(){

    double matematicas , fisica , quimica , historia , lengua , promedio ;
    System.out.println("Calculadora de Promedio");
    System.out.println("Nota de Matematicas");
    matematicas = input.nextDouble();
    System.out.println("Nota de fisica");
    fisica = input.nextDouble();
    System.out.println("Nota de quimica");
    quimica = input.nextDouble();
    System.out.println("Nota de historia");
    historia = input.nextDouble();
    System.out.println("Nota de lengua");
    lengua = input.nextDouble();

    promedio = (matematicas + fisica + quimica + historia  )/5 ;
    System.out.println("Su promedio total es"+ promedio);
}
public static void temperatura1(){

    double celsius , fahrenheit ;
    System.out.println("Programa conversion °celsius a °fahrenheit");
    System.out.println("Ingrese la temperatura");
    celsius=input.nextDouble();
    fahrenheit = (celsius*9/5+32);
    System.out.println("La temperatura es °"+fahrenheit);
}

public static void temperatura2() {

    double celsius1 , fahrenheit1 ;
    System.out.println("Programa conversion °fahrenheit a °celsius");
    System.out.println("Ingrese la temperatura");
    fahrenheit1=input.nextDouble();
    celsius1 = (fahrenheit1-32*5/9);
    System.out.println("La temperatura es °"+celsius1);
}
public static void totalRestaurante() {
    double total , subtotal ,propina;
    System.out.println("Facturación");
    System.out.println("Por favor ingrese el subtotal");
    subtotal=input.nextDouble();
    System.out.println("Que porcentaje de propina desea dar");
    propina =input.nextDouble();
    total = subtotal + (subtotal * propina / 100);
    System.out.println("El cobro total de su factura es "+total );

}
public static void Descuento(){
    System.out.println("Calcular descuento");
    System.out.println("Ingrese el precio de su producto");
    double precio=input.nextDouble();
    System.out.println("Ingrese el porcentaje de descuento");
    double descuento=input.nextDouble();
    double precioFinal=precio*(1-descuento/100);
    System.out.println("El precio final es "+precioFinal);

}
public static void edadFuturo(){
int año1 ,año2;

System.out.println("Ingrese su año de nacimiento");
año1=input.nextInt();
System.out.println("Ingrese un año en el futuro");
año2=input.nextInt();
int edad =año2-año1;
if (año2 < año1){
    System.out.println("No es posible realizar el calculo intente nuevamente con otro año");
}else{
    System.out.println("Su edad en el año " + año2 + " sera " + edad);}
}
public static void interesCompuesto(){
    System.out.println("Digite el monto inicial");
    double montoInicial =input.nextDouble();
    System.out.println("Digite la tasa de intéres");
    double tasa= input.nextDouble();
    System.out.println("Digite el número de años");
    double años =input.nextDouble();
    double montoFinal = montoInicial * Math.pow(1 + tasa / 100, años);
    System.out.println("el monto final es "+montoFinal);
}
 
public static void numeroAscendente() {
      

        System.out.println("Ingrese el 1er número:");
        double n1 = input.nextDouble();
        
        System.out.println("Ingrese el 2do número:");
        double n2 = input.nextDouble();
        
        System.out.println("Ingrese el 3er número:");
        double n3 = input.nextDouble();

         if(n1 <= n2 && n1 <= n3) {
            if(n2 <= n3) {
                System.out.println("Los números en orden ascendente son: " + n1 + ", " + n2 + ", " + n3);
            }else {
                System.out.println("Los números en orden ascendente son: " + n1 + ", " + n3 + ", " + n2);
            }
        }else if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                System.out.println("Los números en orden ascendente son: " + n2 + ", " + n1 + ", " + n3);
            }else {
                System.out.println("Los números en orden ascendente son: " + n2 + ", " + n3 + ", " + n1);
            }
        }else {
            if(n1 <= n2) {
                System.out.println("Los números en orden ascendente son: " + n3 + ", " + n1 + ", " + n2);
            }else {
                System.out.println("Los números en orden ascendente son: " + n3 + ", " + n2 + ", " + n1);
            }
        }
    }

public static void contraseña() {
System.out.println("Ingrese su contraseña");
String contraseña=input.nextLine();
    System.out.println("Por su seguridad ingrese nuevamente su contraseña");
 String verificacion=input.nextLine();
        if (contraseña.equals(verificacion)) {       // se usa equals cuando hay que comprara strings no se puede usar == o !=
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta. Intente de nuevo.");
 }

}

public static void IMC() {
    System.out.println("Calculadora de IMC");
    System.out.println("Ingrese su peso(.kg)");
    double peso=input.nextDouble();
    System.out.println("ingrese su estatura en (.metros)");
    double altura =input.nextDouble();
    double IMC = peso*(altura *altura);
    if (IMC < 18.5) {
            System.out.println("Bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Normal");
        } else if (IMC >=25 && IMC  <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC  >= 29.9);
        {
            System.out.println("obesidad");
        }
    }
}
    





        




    
    
 
     
     

