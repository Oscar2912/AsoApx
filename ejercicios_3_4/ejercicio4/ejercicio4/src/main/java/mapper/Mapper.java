package mapper;

import dto.ContactDTO;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    /**
     * Mapea una lista de entrada a una lista de salida.
     *
     * @param requestDTO La solicitud de entrada que contiene los datos a mapear.
     * @return Una lista de objetos ResponseDTO mapeados desde la entrada.
     * @throws ParseException Si ocurre un error al analizar los datos.
     */
    public static List<ResponseDTO> mapListaEntradaToSalida(RequestDTO requestDTO) throws ParseException {
        // TODO: Implementar lógica de mapeo aquí
        List<ResponseDTO> listaSalida = new ArrayList<>();
        // Ejemplo de cómo podrías comenzar a implementar el mapeo
        int i = 0;
        for (ContactDTO contactDTO : requestDTO.getContact()) {
            ResponseDTO responseDTO = new ResponseDTO();
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            List<String> prueba = requestDTO.getRequest();
            String[] datos = prueba.get(i).toString().split(",");
            try {
                responseDTO.setNombre(datos[0]);
                responseDTO.setNumero(Integer.parseInt(datos[1]));
                responseDTO.setFecha(dateFormat.parse(datos[2]));
                responseDTO.setEmail(contactDTO.getEmail());
                responseDTO.setCel(contactDTO.getCel());
            }catch (ParseException e){
                System.out.println("Ha ocurrido un error: " + e);
            }

            listaSalida.add(responseDTO);
            i += 1;
        }
        return listaSalida;
    }
}
