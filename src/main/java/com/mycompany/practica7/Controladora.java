/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica7;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nenod
 */
public class Controladora {
public static void main (String args[]){
/*try{
WebMaker generador = new WebMaker();
PrintWriter escritor = new PrintWriter("index.html");
Scanner lector = new Scanner(new FileReader("form.txt"));
escritor.println(generador.imprimirEncabezado());
escritor.println(generador.imprimirTexto("Una Gwen chikita trabajando"));
escritor.println(generador.insertarImagen("trabajando.jpg"));
while(lector.hasNext()) {
escritor.println(lector.nextLine());
}
escritor.println(generador.imprimirCierre());
lector.close();
escritor.close();
}
catch (FileNotFoundException e){
}*/
/*try{
DataOutputStream escritor = new DataOutputStream (new FileOutputStream("hola.bin"));

escritor.writeChar('a');
escritor.writeShort(10);
escritor.writeInt(33465);
escritor.writeChar('z');
escritor.close();
DataInputStream lector = new DataInputStream (new FileInputStream("hola.bin"));
System.out.println(lector.readInt());
System.out.println(lector.readChar());
System.out.println(lector.readChar());
System.out.println(lector.readShort());
escritor.close();
}
catch (FileNotFoundException e){} 
catch (IOException ex) {}*/


try{
ObjectInputStream
lector = new ObjectInputStream(new FileInputStream("web.obj"));
PrintWriter escritor = new PrintWriter("main.html");
WebMaker pagina = (WebMaker)(lector.readObject());
escritor.print(pagina.printPage());
lector.close();
escritor.close();

}
catch(FileNotFoundException e){}
catch (IOException e) {}
catch(ClassNotFoundException e){}
}
}