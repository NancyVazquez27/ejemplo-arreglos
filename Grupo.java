public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    private int numInscritos;
    private int totalEs;
  
    
    public Grupo(int totalEstudiantes,String nomMateria)
    {
        estudiantes=new Estudiante[totalEstudiantes];
        this.nomMateria=nomMateria;
        numInscritos=0;
        totalEs=totalEstudiantes;
        
    }
    
    //Terminar este metodo de tarea
    
    public void inscribir(Estudiante unEstudiante)
    {
        
        if(numInscritos<totalEs)
        {
            estudiantes[numInscritos]=unEstudiante;
            numInscritos++;
        }
    }
    
   // public void darBaja(int claveBaja)
    
   public void baja(int claveBaja)
   {
       int i=0;
       
       if(claveBaja!=estudiantes[i].clave1)
       {
           i++;
           
        }
        else
           {
           estudiantes[i]=null;
           numInscritos=numInscritos-1;
            }
        }
        //dar de baja un estudiante
    // buscar el estudiante con la clave que te da & poner en null ese espacio  
}