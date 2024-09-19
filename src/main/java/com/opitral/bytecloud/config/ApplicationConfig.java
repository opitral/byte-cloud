package com.opitral.bytecloud.config;

import com.opitral.bytecloud.service.AccessManagementService;
import com.opitral.bytecloud.service.FileService;
import com.opitral.bytecloud.service.impl.FileServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    private final AccessManagementService accessManagementService;

    public ApplicationConfig(AccessManagementService accessManagementService) {
        this.accessManagementService = accessManagementService;
    }

    @Bean
    public FileService fileService() {
        return new FileServiceImpl(accessManagementService);
    }
}