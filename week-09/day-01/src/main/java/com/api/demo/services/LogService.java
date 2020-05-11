package com.api.demo.services;

import com.api.demo.models.logs.Log;
import com.api.demo.models.logs.LogCount;

import java.util.List;

public interface LogService {
    void addLog(Log log);
    List<Log> returnAllLogs();
    LogCount doLogCount();
}
