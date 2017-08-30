/** 
 * La clase Grupo fue creada con la finalidad de que en base a ella se creara un arreglo
 * el cual estara ocupado por distintos estudiantes los cuales desean pertenecer al grupo.
 * En esta clase se declaran las variables de Nombre de la materia, y se declara el arreglo el
 * cual guardara la informacion de los estudiantes a inscribirse.
 * 
 * El constructor inicializa las variables de instancia, este constructor recibira como parametros
 * el cupo maximo de alumnos a inscribirse en el grupo, asi como tambien el nombre
 * de la materia a la cual pernece el grupo.
 * 
 * Se utiliza this. para relacionar la varible nomMateria con la que fue declarada y pertenece ala clase
 * , esta es diferente de la que se utiliza como parametro.
 * 
 * @param totalEstudiantes en esta varible se guardara el tamano del grupo.
 * @param nomMateria en esta varible se guarda el nombre de la materia del Grupo.
 */

public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;

    public Grupo(int totalEstudiantes,String nomMateria)
    {
        estudiantes=new Estudiante[totalEstudiantes]; //El objeto estudiantes es de tamano totalEstudiantes.
        this.nomMateria=nomMateria;      
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
            if(estudiantes[i] != null)
            {
                 if(estudiantes[i].dimeClave() == claveEstudiante)
                 {   
                     return i;
                 }
            }   
        }
        return -1;
    }

    /**
     * Busca un espacio disponible para el estudiante en el arreglo.
     * @return Regresa la primera posicion nula dentro del arreglo.
     * al regresar el valor de -1 indica que no hay ninguna posicion vacia.
     */
    private int buscaEspacioDisponible()
    {
        for( int i=0; i < estudiantes.length;i++)
        {
            if(estudiantes[i] == null)
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
        }
        int posDisponible = this.buscaEspacioDisponible();
            if(posDisponible ==-1)
            {
                return false; // el arreglo esta lleno
            }
            estudiantes[posDisponible]= unEstudiante; // inscribe al Estudiante
            return true;
    }

   /**
    * Da de baja a un alumno, de acuerdo ala clave que ingrese el usuario.
    * @param La clave del alumno que se desea dar de baja.
    * en la posicion en la que se encuentre el alumno se registrara como null.
    * @ return true si el alumno fue eliminado y caso contrario false si por alguna razon no se pudo
    * eliminar
    */ 
   public boolean baja(int claveBaja)
   {
      
          if(this.buscarEstudiante(claveBaja)!= -1)
          {
              estudiantes[this.buscarEstudiante(claveBaja)]= null;
              return true;
          }
          else
            return false;
    }
}
  