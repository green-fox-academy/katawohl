package com.api.demo.services;

import com.api.demo.models.Log;
import com.api.demo.models.LogCount;
import com.api.demo.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    private LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void addLog(Log log) {
        this.logRepository.save(log);
    }

    @Override
    public List<Log> returnAllLogs() {
        List<Log> logs = new ArrayList<>();
        logRepository.findAll().forEach(logs::add);
        return logs;
    }

    @Override
    public LogCount doLogCount() {
        LogCount logCount = new LogCount();
        logCount.setEntries(this.returnAllLogs());
        logCount.setEnrtyCount(this.returnAllLogs().size());
        return logCount;
    }


}
