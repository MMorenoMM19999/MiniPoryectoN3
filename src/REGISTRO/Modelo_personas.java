
package REGISTRO;

//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 *@author Valderrama Jorde Enrique
 * jorge.valderrama@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "Modelo_personas " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/
public class Modelo_personas {
    
    //delcaramos las variables que vamos a usar 
    private String nombre;
     private String apellidos;
      private String identificacion;
      private String doctor;
       private String especialidad;
        private String consultorio;
          private String fecha;
          
//inicializamos las variables declaradas anteriormente en el constuctor 
    public Modelo_personas(String nombre, String apellidos, String doctor, String especialidad, String consultorio,String identificacion, String fecha) {
        this.nombre = nombre;
         this.apellidos = apellidos;
          this.doctor = doctor;
           this.especialidad = especialidad;
            this.consultorio = consultorio;
           this.identificacion = identificacion;
              this.fecha = fecha;
              
    }
//e invocamos todos los metodos set y get denuestras varibles antes declaradas e inicializadas 
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

 

    public Modelo_personas() {
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
  
           
           
    
}
