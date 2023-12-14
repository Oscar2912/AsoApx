package test;

import dto.OutputInfoDTO;
import dto.PersonInfoDTO;
import dto.ProjectDTO;

import java.util.List;

import static mapper.MapperThree.mapInputToOutputThree;

public class TestMapperThree {
    public static void main(String[] args) {
        // Crear un objeto de entrada DTO con información de persona y proyectos
        PersonInfoDTO personInfoDTO = new PersonInfoDTO("Jaime Duque", 25, "Software Engineer", List.of(
                new ProjectDTO("ProjectA", "DescriptionA"),
                new ProjectDTO("ProjectB", "DescriptionB")
        ));

        OutputInfoDTO outputInfoDTO = mapInputToOutputThree(personInfoDTO);

        // Mostrar el resultado
        System.out.println("DTO de entrada: " + personInfoDTO);
        System.out.println("DTO de salida mapeado: " + outputInfoDTO);
    }
}
