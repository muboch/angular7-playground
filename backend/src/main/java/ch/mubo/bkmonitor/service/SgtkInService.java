package ch.mubo.bkmonitor.service;

import ch.mubo.bkmonitor.entities.LogMessage;
import ch.mubo.bkmonitor.repository.LogMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

@Controller
public class SgtkInService {

    @Autowired
    private LogMessageRepository logMessageRepository;

    public Collection<LogMessage> getSgtkInLog() {
        return logMessageRepository.findAll().stream()
                .collect(Collectors.toList());
    }
}
