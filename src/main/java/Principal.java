

public class Principal{
        public static void main(String[]args){
            //Creacion de un nuevo empleado
            empleado empleado1 = new empleado();
            //Modificacion de ejemplo de datos del empleado
            empleado1.setNombre("Juan");
            empleado1.setCorreo("juan@gmail.com");
            empleado1.setEmpresa("MinTIC");
            empleado1.setRol("Gerente");

            //Captura de datos del empleado

            System.out.println("Nombre: " + empleado1.getNombre());
            System.out.println("Correo: " + empleado1.getCorreo());
            System.out.println("Empresa: " + empleado1.getEmpresa());
            System.out.println("Rol: " + empleado1.getRol());
        }
    }
