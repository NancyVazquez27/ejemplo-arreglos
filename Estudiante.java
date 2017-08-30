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
}