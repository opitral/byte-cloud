package com.opitral.bytecloud.service.impl;

import com.opitral.bytecloud.domain.entity.FileEntity;
import com.opitral.bytecloud.service.AccessManagementService;
import com.opitral.bytecloud.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FileServiceImpl implements FileService {

    private final AccessManagementService accessManagementService;

    @Autowired
    public FileServiceImpl(AccessManagementService accessManagementService) {
        this.accessManagementService = accessManagementService;
    }

    @Override
    public FileEntity saveFile(FileEntity file) {
        return null;
    }

    @Override
    public Optional<FileEntity> getFileById(Long fileId) {
        return Optional.empty();
    }

    @Override
    public List<FileEntity> getAllFiles() {
        return List.of();
    }

    @Override
    public List<FileEntity> getFilesByFolderId(Long folderId) {
        return List.of();
    }

    @Override
    public List<FileEntity> getFilesByUserId(Long userId) {
        return List.of();
    }

    @Override
    public FileEntity updateFile(FileEntity file) {
        return null;
    }

    @Override
    public void deleteFile(Long fileId) {

    }

    @Override
    public FileEntity moveFileToFolder(Long fileId, Long newFolderId) {
        return null;
    }
}
