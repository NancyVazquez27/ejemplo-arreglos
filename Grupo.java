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
    
    
   
/**
  * Busca un estudiante por medio de su clave
  * @param claveEstudiante parametro que representa la clave del estudiante a buscar.
  * @return Regresa la posicion del estudiante en el arreglo o -1 si no existe.
  */
    
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0; i<estudiantes.length;i++)
        {
            if(estudiantes[i].dimeClave() == claveEstudiante)
            {   
                return i;
            }
                
        }
        return -1;
    }
    //Terminar este metodo de tarea
    /**
     * Busca un espacio disponible para el estudiante en el arreglo.
     * @return Regresa la primer posicion nula dentro del arreglo.
     */
    private int buscaEspacioDisponible()
    {
        for( int i=0; i < estudiantes.length;i++)
        {
            if(estudiantes[i] == null
            {
                    return i;
             }
        }  
        return -1;
    }
    
    /**
     * Inscribe un alumno nuevo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso de que
     *          no se pudiera inscribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe = this.buscarEstudiante(unEstudiante.dimeClave());
        if (existe != -1)
        {
            return false; // el estudiante ya esta incrito
            
        int posDisponible = this.buscaEspacioDisponible();
            if(posDisponible ==-1)
            {
                return false; // el arreglo esta lleno
            }
            estudiantes[posDisponible]= unEstudiante; // inscribe al Estudiante
            return true;
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