package com.api.demo.services;

import com.api.demo.models.Log;
import com.api.demo.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
