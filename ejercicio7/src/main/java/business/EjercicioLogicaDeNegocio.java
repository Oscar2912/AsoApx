package business;

import dto.CursoDTO;
import dto.EstudianteDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjercicioLogicaDeNegocio {
    public static void main(String[] args) {
        // Crear un curso con algunos estudiantes
        CursoDTO cursoInicial = crearCursoInicial();

        // TODO: Llamar a un método que aumente la edad de todos los estudiantes en el curso en 1
        aumentarEdadEstudiantes(cursoInicial);

        // TODO: Llamar a un método que filtre los estudiantes mayores de X años en el curso
        CursoDTO cursoFiltrado = filtrarEstudiantesPorEdad(cursoInicial, 18);

        // Llamar al método que organiza los nombres por orden alfabético
        ordenarNombresAlfabeticamente(cursoFiltrado.getEstudiantes());

        // Mostrar resultados
        System.out.println("Curso inicial: " + cursoInicial);
        System.out.println("Curso filtrado: " + cursoFiltrado);
    }

    private static CursoDTO crearCursoInicial() {
        CursoDTO curso = new CursoDTO();
        curso.setNombre("Programación Avanzada");

        List<EstudianteDTO> estudiantes = new ArrayList<>();
        estudiantes.add(new EstudianteDTO("Juan", 19));
        estudiantes.add(new EstudianteDTO("Zamir", 30));
        estudiantes.add(new EstudianteDTO("Maria", 21));
        estudiantes.add(new EstudianteDTO("Pedro", 18));
        estudiantes.add(new EstudianteDTO("Aleja", 15));

        curso.setEstudiantes(estudiantes);

        return curso;
    }

    // TODO: Implementar el método para aumentar la edad de todos los estudiantes en el curso en 1
    private static void aumentarEdadEstudiantes(CursoDTO curso) {
        // TODO: Lógica de negocio para aumentar la edad de los estudiantes en 1
        List<EstudianteDTO> listaEstudiantes = curso.getEstudiantes();
        for (EstudianteDTO listaEstudiante : listaEstudiantes) {
            listaEstudiante.setEdad(listaEstudiante.getEdad() + 1);
        }
    }

    // TODO: Implementar el método para filtrar los estudiantes mayores de cierta edad en el curso
    private static CursoDTO filtrarEstudiantesPorEdad(CursoDTO curso, int edadMinima) {
        // TODO: Lógica de negocio para filtrar estudiantes por edad
        CursoDTO cursoFiltrado = new CursoDTO();
        List<EstudianteDTO> estudiantes = curso.getEstudiantes();
        List<EstudianteDTO> estudiantesFiltrados = new ArrayList<>();
        //estudiantes.stream().filter(EstudianteDTO::getEdad > edadMinima) ? estudiantesFiltrados.add() : null;
        for (EstudianteDTO filtroEdad : estudiantes){
            if(filtroEdad.getEdad()>edadMinima)
                estudiantesFiltrados.add(filtroEdad);
        }
        cursoFiltrado.setNombre(curso.getNombre() + " filtrado.");
        cursoFiltrado.setEstudiantes(estudiantesFiltrados);
        return cursoFiltrado; // Reemplazar con la lógica adecuada
    }

    // TODO: Implementar el método para organizar los nombres por orden alfabético
    public static void ordenarNombresAlfabeticamente(List<EstudianteDTO> estudiantes) {
        List<EstudianteDTO> estudiantesOrdenados = estudiantes;
        Comparator<EstudianteDTO> comparador = Comparator.comparing(EstudianteDTO::getNombre);
        estudiantesOrdenados.sort(comparador);
        estudiantesOrdenados.forEach(System.out::println);
    }
}
