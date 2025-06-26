package com.senac.logbackweb1.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);
    private static final Logger auditLogger = LoggerFactory.getLogger("com.senac.logbackweb1.audit");

    @GetMapping
    public String gerarLogs() {
        logger.info("INFO: Acesso normal ao endpoint.");
        logger.warn("WARN: Alerta não crítico.");
        logger.error("ERROR: Erro de simulação.");

        auditLogger.info("AUDIT: Ação crítica registrada com sucesso.");

        return "Logs gerados! Verifique console e arquivos.";
    }
}
