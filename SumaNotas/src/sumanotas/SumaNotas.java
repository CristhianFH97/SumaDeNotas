/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumanotas;
import java.util.Scanner;
/**
 * @author Christian
 */
public class SumaNotas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        float notas[] = new float[5];
        int indice = 0;
        float promedio = 0;
        Scanner leer = new Scanner(System.in);
        while (indice < notas.length) {
            System.out.print("Ingrese la nota del estudiante " + (indice + 1) + ": ");
            notas[indice] = leer.nextInt();
            if (indice == (notas.length - 1)) {
                indice = 0;
                while (indice < notas.length) {
                    promedio += notas[indice];
                    indice++;
                }
                promedio = (promedio / notas.length);
                indice = 0;
                while (indice < notas.length) {
                    if (notas[indice] >= 85) {
                        contador += 1;
                    }
                    indice++;
                }
            }
            indice++;
        }
        System.out.println("------------------------------------\n- Promedio: " + promedio + ".\n- Estudiantes sobre el promedio: " + contador + ".");
    }
}