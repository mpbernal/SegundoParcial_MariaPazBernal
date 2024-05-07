package com.jardineria67000609.ModuloAuditoria.EventManager;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private Map<String, Integer> actionCounts;

    public EventManager() {
        actionCounts = new HashMap<>();
    }

    public void monitorAction(String userId, String action) {
        actionCounts.put(userId + "_" + action, actionCounts.getOrDefault(userId + "_" + action, 0) + 1);
    }

    public boolean shouldLogEvent(String userId, String action) {
        return actionCounts.getOrDefault(userId + "_" + action, 0) > 2;
    }
}
