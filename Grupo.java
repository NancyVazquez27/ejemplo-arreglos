public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes,String nomMateria)
    {
        estudiantes=new Estudiante[totalEstudiantes];
        this.nomMateria=nomMateria;
    }
    
    //Terminar este metodo de tarea
    
    public void inscribir(Estudiante unEstudiante)
    {
        if(estudiantes[0]==null)
        {
            estudiantes[0]= unEstudiante;
        }
        
    }
    
    //dar de baja un estudiante
    // buscar el estudiante con la clave que te da & poner en null ese espacio
}