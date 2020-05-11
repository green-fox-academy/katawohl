package com.api.demo.models.logs;

import com.api.demo.models.logs.Log;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogCount {
    private List<Log> entries;
    @JsonProperty("entry_count")
    private int enrtyCount;

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getEnrtyCount() {
        return enrtyCount;
    }

    public void setEnrtyCount(int enrtyCount) {
        this.enrtyCount = enrtyCount;
    }
}
