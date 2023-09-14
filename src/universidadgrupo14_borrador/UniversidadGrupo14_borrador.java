
package universidadgrupo14_borrador;

import java.sql.Connection;
import universidadgrupo14_borrador.accesoADatos.AlumnoData;
import universidadgrupo14_borrador.accesoADatos.MateriaData;


import java.time.LocalDate;
import universidadgrupo14_borrador.accesoADatos.Conexion;
import universidadgrupo14_borrador.entidades.Alumno;
import universidadgrupo14_borrador.entidades.Materia;

public class UniversidadGrupo14_borrador {

    public static void main(String[] args) {
        
        Connection conect = Conexion.getConexion();
        
       //AlumnoData
       //ALUMNO GUARDADO EN MEMORIA RAM
       //Alumno juan = new Alumno (3, 33333, "Robledo", "Roberto",LocalDate.of(1980, 4 , 13), true);

       //CREAR OBJETO(AlumnoData) para manipular datos de la tabla
       //AlumnoData alu = new AlumnoData();
       
       //GUARDAR DATOS en Base de Datos
       //alu.guardarAlumno(juan);

       /*
       MODIFICAR DATOS (Para modificar datos de un objeto existente comentamos  
       + alu.guardarAlumno. Para buscar un elemento específico lo podemos hacer
       agregando el id, seleccionando así el objeto a modificar)
       */
       //alu.modificarAlumno(juan);
       
       //BORRADO LÓGICO de datos modificando su estado a false
       //alu.eliminarAlumno(1);
       
       //BUSCAR DATOS POR ID
       /*
       Alumno alumnoEncontrado = alu.buscarAlumno(2);
       if(alumnoEncontrado!=null){
       System.out.println("Apellido: " + alumnoEncontrado.getApellido());
       System.out.println("Nombre: " + alumnoEncontrado.getNombre());
       System.out.println("DNI: " + alumnoEncontrado.getDni());
       }
        //(Podría usar el método toString)
       */
       
       //BUSCAR DATOS POR DNI
       
       /*
       Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(22222);
       if(alumnoEncontrado!=null){
       System.out.println("Apellido: " + alumnoEncontrado.getApellido());
       System.out.println("Nombre: " + alumnoEncontrado.getNombre());
       System.out.println("DNI: " + alumnoEncontrado.getDni()); 
       }
       */
       
       /*       
       //LISTAR ALUMNOS
       AlumnoData alu=new AlumnoData();
       for(Alumno alumno:alu.listarAlumnos()){
        //mostrar los datos que queramos de cada elemento
           System.out.println(alumno.getDni());
           System.out.println(alumno.getNombre());
           System.out.println(" ----- ");
        */    
       
        //MateriaData
        Materia mat1 = new Materia ("Lengua", 2, true);
        Materia mat2 = new Materia ("Ciencias Políticas", 1, true);
        MateriaData mat = new MateriaData();
        
        mat.guardarMateria(mat1);
        mat.guardarMateria(mat2);
       // materia.modificarMateria(matem);
       // materia.eliminarMateria(1);
       // materia.buscarMateria(3);
        
       /*
        //Uso de toString para listar objetos
       for(Materia materia: mat.listarMaterias()){
            System.out.println(materia.toString());
        }
       */

    }
}


    
