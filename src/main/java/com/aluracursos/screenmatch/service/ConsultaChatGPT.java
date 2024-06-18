package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService("YOUR-API-KEY");

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-16k")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(256)
                .temperature(1.0)
                .build();

        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}

