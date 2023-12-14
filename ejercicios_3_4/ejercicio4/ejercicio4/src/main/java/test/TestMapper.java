package test;

import dto.ContactDTO;
import dto.RequestDTO;
import dto.ResponseDTO;
import mapper.Mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMapper {
    public static void main(String[] args) throws ParseException {
        // Crear datos de entrada
        RequestDTO requestDTO = new RequestDTO();
        List<ContactDTO> contactDTOList = new ArrayList<>();
        ContactDTO contactDTO = new ContactDTO();
        ContactDTO contactDTO1 = new ContactDTO();
        contactDTO.setEmail("juanito@co");
        contactDTO1.setEmail("maria@es");
        contactDTO.setCel(Long.parseLong("3003003333"));
        contactDTO1.setCel(Long.parseLong("3003004444"));
        contactDTOList.add(contactDTO);
        contactDTOList.add(contactDTO1);
        List<String> listaPrueba = Arrays.asList("Juan,300333,02-03-2023", "Maria,300444,02-03-a2023");
        requestDTO.setContact(contactDTOList);
        requestDTO.setRequest(listaPrueba);

        // Realizar el mapeo
        List<ResponseDTO> listaSalidas = Mapper.mapListaEntradaToSalida(requestDTO);

        // Imprimir resultados
        for (ResponseDTO salida : listaSalidas) {
            System.out.println(salida);
            System.out.println("--------");
        }
    }
}
