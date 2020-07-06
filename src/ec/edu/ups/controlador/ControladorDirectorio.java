package ec.edu.ups.controlador;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorDirectorio {
private String ruta;
private File archivo;
private  File[] archivos;
String auxnombre;


    public ControladorDirectorio(String ruta) {
        
        this.ruta = ruta;
        auxnombre=ruta;
    }
public List<String> listarArchivos(){
    
    List<String> Directorios=new ArrayList<String>();
    archivo = new File(ruta);
    
    archivos = archivo.listFiles();
    
    for (File archivo1 : archivos) {
        if(archivo1.isDirectory()==false&&archivo1.isHidden()==false){
            
           Directorios.add(archivo1.getName());
        }
    }
  
    return Directorios;
}   

public List<String> listarDirectorios(){
    List<String> Directorios=new ArrayList<String>();
    archivo = new File(ruta);
    
    archivos = archivo.listFiles();
    
    for (File archivo1 : archivos) {
        if(archivo1.isDirectory()&&archivo1.isHidden()==false){
            
           Directorios.add(archivo1.getName());
        }
    }
  
    return Directorios;
}
public List<String> listarArchivosOcultos(){
    List<String> ArchivosL=new ArrayList<String>();
    archivo = new File(ruta);
    
    archivos = archivo.listFiles();
    
    for (File archivo1 : archivos) {
        if(archivo1.isDirectory()==false&&archivo1.isHidden()==true){
            
           ArchivosL.add(archivo1.getName());
        }
    }
  
    return ArchivosL;
    
    
    
}
public List<String> listarDirectoriosOcultos(){
    
    
    List<String> Directorios=new ArrayList<String>();
    archivo = new File(ruta);
    
    archivos = archivo.listFiles();
    
    for (File archivo1 : archivos) {
        if(archivo1.isDirectory()&&archivo1.isHidden()==true){
            
           Directorios.add(archivo1.getName());
        }
    }
  
    return Directorios;
    
    
}
public void crearDirectorio(String nombre) throws IOException{
    
    
   
    if(nombre.contains(".")==true){
        
        File nuevo=new File(ruta+nombre);
        System.out.println(nuevo);
            nuevo.createNewFile();
        
        
    }else{
        
        archivo=new File(ruta+nombre);
        System.out.println(archivo);
        if(archivo.exists()==false){
            
        
        archivo.mkdir();
    
    }
    }
    
    
    
}
    public void eliminarDirectorio(String nombre) {
        
        archivo = new File(auxnombre + nombre);
        if (archivo.isDirectory()) {
            if (archivo.listFiles().length > 0) {
                File[] aux = archivo.listFiles();                
                for (File file : aux) {
                    auxnombre = auxnombre + nombre + "/";
                    
                    eliminarDirectorio(file.getName());
                    
                }
                
            } else {
                if (archivo.exists() == true) {
                    archivo.delete();
                }                
            }            
        } else {
            if (archivo.exists() == true) {
                archivo.delete();
            }
        }
        System.out.println(auxnombre);
        System.out.println(ruta);
        
       
       
        
    }






public void renombrarDirectorio(String actual, String nuevo){
    archivo=new File(ruta+actual);
    if(archivo.exists()==true){
        archivo.renameTo(archivo=new File(ruta+nuevo));
    }
    
}
public String mostarInformacion(String nombre){
    
    archivo = new File(ruta);
    archivos = archivo.listFiles();
    for (File archivo1 : archivos) {
        if(archivo1.getName().equalsIgnoreCase(nombre)){
            archivo=archivo1;
            
            break;
        }
    }
    
    
    String resp;
    if(archivo.canExecute()==true){
       resp=" Se puede ejecutar = si ";
    }else{
       resp=" Se puede ejecutar = no "; 
    }
    if(archivo.canRead()==true){
       resp=resp+" Se puede leer = si ";
    }else{
       resp=resp+" Se puede leer = no "; 
    }
    if(archivo.canWrite()==true){
       resp=resp+" Se puede escribir = si ";
    }else{
       resp=resp+" Se puede escribir = no "; 
    }
    
    return resp;
}
    
    
    

}
