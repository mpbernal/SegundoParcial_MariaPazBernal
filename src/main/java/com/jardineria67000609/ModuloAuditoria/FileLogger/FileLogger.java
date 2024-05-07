package com.jardineria67000609.ModuloAuditoria.FileLogger;

import com.jardineria67000609.ModuloAuditoria.ErrorEvent.ErrorEvent;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    private FileWriter fileWriter;

    public FileLogger(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void logToFile(ErrorEvent errorEvent) {
        try {
            fileWriter.write(errorEvent.getTimestamp() + ": " + errorEvent.getErrorMessage() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
