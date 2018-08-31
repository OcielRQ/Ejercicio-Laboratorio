import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<String> alumnos;
    
    public Laboratorio()
    {
        alumnos = new ArrayList<String>();
    }
    
    public void ingresaAlumno(String alumno, String clave)
    {
        String alu;
        alu = alumno + " " + clave;
        alumnos.add(alu);
    }
    
    public void darBaja(String alumno, String clave)
    {
       String alu;
       alu = alumno + " " + clave;
       alumnos.add(alu); 
       for(int i = 0; i < alumnos.size(); i++)
       {
           String aux = alumnos.get(i);
           if(aux == alu){
               alumnos.remove(i);
           }
       }
    }
}