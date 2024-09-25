import java.util.Scanner;

public class MenuRecursivo {
    public static void main(String[] args) {
        // Creamos un escáner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;  // Aquí almacenaremos la opción seleccionada

        do {
            // Imprimimos el menú con las opciones disponibles
            System.out.println("----- Menu de opciones: -----");
            System.out.println("1. Sumatoria");
            System.out.println("2. Factorial");
            System.out.println("3. Serie de Fibonacci");
            System.out.println("4. Solucion de ecuacion de segundo grado");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt(); // Leemos la opción seleccionada por el usuario

            // Dependiendo de la opción, llamamos a la función correspondiente
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un numero para la sumatoria: ");
                    int numSum = scanner.nextInt();
                    System.out.println("La sumatoria es: " + sumatoria(numSum));
                    break;
                case 2:
                    System.out.print("Ingresa un numero para el factorial: ");
                    int numFact = scanner.nextInt();
                    System.out.println("El factorial es: " + factorial(numFact));
                    break;
                case 3:
                    System.out.print("Ingresa un numero para la serie Fibonacci: ");
                    int numFib = scanner.nextInt();
                    System.out.println("El termino Fibonacci es: " + fibonacci(numFib));
                    break;
                case 4:
                    System.out.print("Ingresa coeficiente a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingresa coeficiente b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Ingresa coeficiente c: ");
                    double c = scanner.nextDouble();
                    resolverEcuacion(a, b, c);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5); // Repetimos el menú hasta que se elija la opción de salir
        scanner.close();  // Cerramos el escáner
    }

    // Funcion recursiva para la sumatoria de un número
    public static int sumatoria(int n) {
        if (n == 1) {
            return 1; // Caso base: si es 1, regresamos 1
        }
        return n + sumatoria(n - 1); // Caso recursivo: n + sumatoria de n-1
    }

    // Funcion recursiva para el factorial
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // Caso base
        }
        return n * factorial(n - 1); // Caso recursivo: n * factorial de n-1
    }

    // Funcion recursiva para la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n; // Casos base: si es 0 o 1, regresamos el mismo número
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Caso recursivo
    }

    // Funcion para resolver ecuacion de segundo grado usando la fórmula general
    public static void resolverEcuacion(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solucion es unica: x = " + x);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }
}