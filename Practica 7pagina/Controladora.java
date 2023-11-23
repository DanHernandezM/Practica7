/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
import java.io.*;

/**
 *
 * @author nenod
 */
public class Controladora {
public static void main (String args[]){
try{
WebMaker generador = new WebMaker();
PrintWriter escritor = new PrintWriter("index.html");
Scanner lector = new Scanner(new FileReader("form.txt"));
escritor.println(generador.imprimirEncabezado());
escritor.println(generador.imprimirTexto("Una Gwen chikita trabajando"));
escritor.println(generador.insertarImagen("trabajando.jpg"));
escritor.println(generador.imprimirTexto("*Una Gwen chikita salvaje aparecio*"));
escritor.println(generador.insertarImagen("chikita.jpg"));
while(lector.hasNext()) {
escritor.println(lector.nextLine());
}
escritor.println(generador.imprimirCierre());
lector.close();
escritor.close();
}
catch (FileNotFoundException e){
}
}
}
