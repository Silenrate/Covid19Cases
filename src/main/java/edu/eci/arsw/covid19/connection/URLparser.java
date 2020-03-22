package edu.eci.arsw.covid19.connection;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Interfaz que codifica como URL una cadena de texto
 */
public interface URLparser {
    /**
     * Codifica como URL una cadena de texto
     * @param cadena cadena de texto a codificar
     * @return cadena de texto codificada
     */
    default String getStringInUrl(String cadena){
        String encodedQuery;
        try {
            encodedQuery = URLEncoder.encode(cadena, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
        return encodedQuery.replace("+","%20");
    }
}
