public class Estudiante
{
    private String nombre;
    private int clave;
    public int clave1;
    
    public Estudiante(int claveIni,String nombreIni)
    {
        nombre=nombreIni;
        clave=claveIni;
        clave1=claveIni;
    }
    
    public String dimeDetalles()
    {
        return(" Clave: "+clave+ " Nombre: "+nombre);
    }
}