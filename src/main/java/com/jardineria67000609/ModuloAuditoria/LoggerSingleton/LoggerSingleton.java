package com.jardineria67000609.ModuloAuditoria.LoggerSingleton;

import com.jardineria67000609.ModuloAuditoria.ErrorEvent.ErrorEvent;
import com.jardineria67000609.ModuloAuditoria.FileLogger.FileLogger;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerSingleton {
    private static LoggerSingleton instance;
    private FileWriter fileWriter;

    private LoggerSingleton() {
        try {
            // Abre el archivo de registro en modo de agregar (append) al final del archivo
            fileWriter = new FileWriter("error_log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void logError(ErrorEvent errorEvent) {
        FileLogger fileLogger = getFileLogger();
        fileLogger.logToFile(errorEvent);
    }

    private FileLogger getFileLogger() {
        return new FileLogger(fileWriter);
    }
}

