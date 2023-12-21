package bolsaEmpleo;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.LogBackendType;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.logger.LoggerFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/***
 * Bolsa de Empleo
 * Enunciado
 * Una bolsa de empleo, que ofrece el servicio de selección de personal a una empresa del sector financiero, requiere un programa que le permita administrar las hojas de
 * vida de los aspirantes a diferentes cargos en los que la empresa cliente tiene vacantes. De un aspirante queremos almacenar la cédula (llave primaria), el nombre completo,
 * la edad, la experiencia en años, la profesión y el teléfono.
 *
 * Para la bolsa de empleo es importante poder clasificar los mejores aspirantes de acuerdo a unos criterios previamente definidos (años de experiencia, edad y profesión).
 *
 * La aplicación debe permitir:
 *
 * 1. Agregar nuevas hojas de vida de aspirantes.
 * 2. Mostrar las cédulas de los aspirantes.
 * 3. Mostrar la información detallada de un aspirante, a partir de la cédula.
 * 4. Buscar por nombre del aspirante.
 * 5. Permitir ordenar la lista de aspirantes por los diferentes criterios: años de experiencia, edad y profesión.
 *
 * @author Zamir Pineda
 * @version v0
 * @since 06/12/2023
 */

public class ClasificacionDeAspirantes {

    static Dao<Aspirante, Integer> tablaAspirantes;

    public static void main(String[] args) throws Exception {
        LoggerFactory.setLogBackendFactory(LogBackendType.NULL);
        Scanner teclado = new Scanner(System.in);
        String url = "jdbc:h2:file:./bolsa_empleo";
        // Conectarnos con la base de datos
        ConnectionSource con = new JdbcConnectionSource(url);
        // Configurar la tabla a traves de un DAO (Data Access Object)
        tablaAspirantes = DaoManager.createDao(con, Aspirante.class);

        int opcion;

        do {
            System.out.println("====== MENU =======");
            System.out.println("1. Agregar aspirante");
            System.out.println("2. Mostrar cédulas de aspirantes");
            System.out.println("3. Mostrar informacion detallada de un aspirante");
            System.out.println("4. Buscar por nombre del aspirante");
            System.out.println("5. Ordenar la lista de aspirantes");
            System.out.println("0. Salir");

            System.out.print("Digite su opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> agregarAspirante();
                case 2 -> mostrarCedulasAspirantes();
                case 3 -> mostrarInformacionAspirante();
                case 4 -> buscarPorNombre();
                case 5 -> ordenarLista();
                default -> System.out.println("Saliendo del sistema.");
            }
        } while (opcion != 0);
    }

    /***
     *
     */

    private static void agregarAspirante() throws SQLException {
        // 1. Agregar nuevas hojas de vida de aspirantes.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la cedula del aspirante: ");
        int cedula = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Digite el nombre completo del aspirante: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Digite la edad del aspirante: ");
        int edad = scanner.nextInt();

        System.out.print("Digite la experiencia en años del aspirante: ");
        int experiencia = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Digite la profesion del aspirante: ");
        String profesion = scanner.nextLine();

        System.out.print("Digite el teléfono del aspirante: ");
        String telefono = scanner.nextLine();

        Aspirante aspirante = new Aspirante(cedula, nombreCompleto, edad, experiencia, profesion, telefono);

        tablaAspirantes.createOrUpdate(aspirante);

        System.out.println("Aspirante agregado exitosamente!");

        // Pausa la ejecucion durante 2.5 segundos
        pausarEjecucion(2500);
    }

    private static void mostrarCedulasAspirantes() throws SQLException {
        // 2. Mostrar las cédulas de los aspirantes.
        List<Aspirante> aspirantes = tablaAspirantes.queryForAll();

        System.out.println("Cédulas de los aspirantes:");

        // TODO: Agregar un bucle para recorrer la lista de aspirantes y mostrar sus cédulas.
        aspirantes.forEach(System.out::println);

        // Pausa la ejecucion durante 4.5 segundos
        pausarEjecucion(4500);
    }

    private static void mostrarInformacionAspirante() throws SQLException {
        // 3. Mostrar la información detallada de un aspirante, a partir de la cédula.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la cédula del aspirante: ");
        int cedula = scanner.nextInt();

        // TODO: Obtener y mostrar la información detallada del aspirante con la cédula ingresada.
        Aspirante aspirante = new Aspirante();
        aspirante.setCedula(cedula);
        aspirante.setNombreCompleto(tablaAspirantes.queryForId(cedula).getNombreCompleto());
        aspirante.setEdad(tablaAspirantes.queryForId(cedula).getEdad());
        aspirante.setExp(tablaAspirantes.queryForId(cedula).getExp());
        aspirante.setProfesion(tablaAspirantes.queryForId(cedula).getProfesion());
        aspirante.setTelefono(tablaAspirantes.queryForId(cedula).getTelefono());
        System.out.println(aspirante);

        // Pausa la ejecucion durante 5 segundos
        pausarEjecucion(5000);
    }

    private static void buscarPorNombre() throws SQLException {
        // 4. Buscar por nombre del aspirante.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el nombre del aspirante: ");
        String nombre = scanner.nextLine();

        System.out.print("Desea buscar por el primer nombre(S), o cualquier coincidencia(N)? ");
        String busq = scanner.nextLine();

        List<Aspirante> aspirantes = new ArrayList<>();

        // TODO: Implementar la lógica para buscar aspirantes por nombre y mostrar los resultados.
        // Extra: (Puedes usar Comparator para ordenar la lista)
        Comparator<Aspirante> orderarNombres = (aa, ab) -> aa.getNombreCompleto().compareTo(ab.getNombreCompleto());
        List<Aspirante> lista = tablaAspirantes.queryForAll();
        if(busq.equalsIgnoreCase("S")){
            for(int i = 0; i < lista.size(); i++){
                if(lista.get(i).getNombreCompleto().equals(nombre))
                    aspirantes.add(lista.get(i));
            }
            aspirantes.sort(orderarNombres);
            aspirantes.forEach(System.out::println);
        }else if (busq.equalsIgnoreCase("N")){
            for(int i = 0; i < lista.size(); i++){
                if(lista.get(i).getNombreCompleto().contains(nombre))
                    aspirantes.add(lista.get(i));
            }
            aspirantes.sort(orderarNombres);
            aspirantes.forEach(System.out::println);
        }else{
            System.out.println("ERROR: La opción indicada no es correcta.");
        }

        // Pausa la ejecucion durante 3.5 segundos
        pausarEjecucion(3500);
    }

    private static void ordenarLista() throws SQLException {
        // 5. Permitir ordenar la lista de aspirantes por los diferentes criterios: años de experiencia, edad y profesión.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el criterio de ordenación:");
        System.out.println("1. Años de experiencia");
        System.out.println("2. Edad");
        System.out.println("3. Profesión");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();

        scanner.nextLine();

        List<Aspirante> aspirantes = tablaAspirantes.queryForAll();

        Comparator<Aspirante> comparador = null;

        // TODO: Configurar el comparador según la opción seleccionada.
        switch (opcion){
            case 1 -> comparador = (a1, a2) -> Integer.compare(a1.getExp(), a2.getExp());
            case 2 -> comparador = Comparator.comparingInt(a -> a.getEdad());
            case 3 -> comparador = Comparator.comparing(Aspirante::getProfesion);
            default -> {
                System.out.println("Opción no válida");
                return;
            }
        }
        aspirantes.sort(comparador);
        aspirantes.forEach(System.out::println);
        // Pausa la ejecucion durante 5 segundos
        pausarEjecucion(5000);
    }

    private static void pausarEjecucion(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
