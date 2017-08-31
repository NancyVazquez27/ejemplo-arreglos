/**
 * La clase estudiante fue creada con la finalidad de se creara un objeto
 * el cual seria ingresado a un grupo
 * En esta clase de declara la variable nombre, asi como clave. que seran los datos ingresados
 * 
 * @param clave en la cual ingresara la clave del alumno,
 * @param nombre en la cual se ingresara el nombre del estudiante creado
 * 
 * @author Nancy Vazquez
 * @version 08.30.17
 */

public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(int claveIni,String nombreIni)
    {
        nombre=nombreIni;
        clave=claveIni;
    }
    /**
     * El metodo dimeDetalles() retorna el numero de clave el alumno ,
     * asi como tambien el nombre del mismo.
     *  No tiene parametros
     *  @return clave y nombre del alumno
     */
    
    public String dimeDetalles()
    {
        return(" Clave: "+clave+ " Nombre: "+nombre);
    }
    /**
     *  El metodo de Acceso dimeClave() solo es informa de la clave del alumno.
     *  No necesita parametros
     *  @return La clave del alumno
     */
    public int dimeClave()
    {
        return clave;
    }
    
    /**
     * El metodo de Acceso dimeNombre() solo informa del nombre del alumno
     * No necesita parametros
     * @return El nombre del alumno
     */
    public String dimeNombre()
    {
        return nombre;
    }
}