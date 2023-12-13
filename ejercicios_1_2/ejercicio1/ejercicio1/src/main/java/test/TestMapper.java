package test;

import dto.InputDTO;
import dto.OutputDTO;

import static mapper.Mapper.mapInputToOutput;

public class TestMapper {
    public static void main(String[] args) {
        // Crear un objeto de entrada DTO
        InputDTO inputTwoDTO = new InputDTO("Luis Diaz", 25, "Software Engineer");

        // TODO: Llamar al método de mapeo y mostrar el resultado en el Main
        OutputDTO outputDTO = mapInputToOutput(inputTwoDTO);

        // Mostrar el resultado
        System.out.println("DTO de entrada: " + inputTwoDTO);
        System.out.println("DTO de salida mapeado: " + outputDTO);
    }
}
