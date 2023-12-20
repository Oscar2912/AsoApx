package lib;

import dto.PersonaInputDTO;
import dto.PersonaOutputDTO;
import dto.TipoContacto;

public class PersonaBusinessLogic {
    public static void main(String[] args) {
        // Crear un objeto de entrada DTO con datos de una persona
        PersonaInputDTO inputDTOCel = new PersonaInputDTO("Zamir", "+57 300333", TipoContacto.CELULAR);
        PersonaInputDTO inputDTOEmail = new PersonaInputDTO("Jose", "zam@co", TipoContacto.EMAIL);

        // TODO: Llamar al método de negocio y mostrar el resultado en el Main
        PersonaOutputDTO outputDTOCel = procesarDatosPersona(inputDTOCel);
        PersonaOutputDTO outputDTOEmail = procesarDatosPersona(inputDTOEmail);

        // Mostrar el resultado
        System.out.println("DTO de entrada: " + inputDTOCel);
        System.out.println("DTO de salida procesado: " + outputDTOCel);
        System.out.println("DTO de entrada: " + inputDTOEmail);
        System.out.println("DTO de salida procesado: " + outputDTOEmail);
    }

    // TODO: Implementar el método de negocio aquí

    private static PersonaOutputDTO procesarDatosPersona(PersonaInputDTO inputDTO) {
        // TODO: Aplicar la lógica de negocio según los requisitos
        // Por ejemplo, para el número de contacto, extraer solo los dígitos
        // y para el tipo de contacto, validar y procesar según sea necesario.

        PersonaOutputDTO personaOutputDTO = null;
        if(inputDTO.getTipoContacto() == TipoContacto.CELULAR)
            personaOutputDTO = new PersonaOutputDTO(inputDTO.getNombre(), extraerNumeroCelular(inputDTO.getContacto()));
        if (inputDTO.getTipoContacto() == TipoContacto.EMAIL && validarCorreoElectronico(inputDTO.getContacto()) == true)
            personaOutputDTO = new PersonaOutputDTO(inputDTO.getNombre(), inputDTO.getContacto());
        return personaOutputDTO;
    }

    private static String extraerNumeroCelular(String contacto) {
        // Eliminar el prefijo y retornar solo los dígitos del número celular
        return contacto.replaceAll("[+][0-9]+\\s", "");
    }

    private static boolean validarCorreoElectronico(String correo) {
        // Verificar si el correo contiene el carácter "@"
        if (correo.contains("@"))
            return true;
        return false;
    }
}
