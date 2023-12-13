package mapper;

import dto.InputDTO;
import dto.OutputDTO;

public class Mapper {
    // TODO: Implementar el método de mapeo aquí
    public static OutputDTO mapInputToOutput(InputDTO inputDTO) {
        // TODO: Mapear las propiedades de InputDTO a OutputDTO
        // Ejemplo ficticio:
        return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation());
    }
}
