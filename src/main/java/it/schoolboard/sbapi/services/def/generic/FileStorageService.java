package it.schoolboard.sbapi.services.def.generic;

import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    String storePdf(MultipartFile file);
    GridFsResource getPdf(String fileId);

}
