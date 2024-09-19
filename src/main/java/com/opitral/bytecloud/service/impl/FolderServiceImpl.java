package com.opitral.bytecloud.service.impl;

import com.opitral.bytecloud.domain.entity.FolderEntity;
import com.opitral.bytecloud.service.FileService;
import com.opitral.bytecloud.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FolderServiceImpl implements FolderService {

    private final FileService fileService;

    @Autowired
    public FolderServiceImpl(FileService fileService) {
        this.fileService = fileService;
    }

    @Override
    public FolderEntity createFolder(FolderEntity folder) {
        return null;
    }

    @Override
    public Optional<FolderEntity> getFolderById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<FolderEntity> getAllFolders() {
        return List.of();
    }

    @Override
    public List<FolderEntity> getFoldersByParentId(Long parentId) {
        return List.of();
    }

    @Override
    public FolderEntity updateFolder(Long id, String newName) {
        return null;
    }

    @Override
    public void deleteFolder(Long id) {

    }
}
