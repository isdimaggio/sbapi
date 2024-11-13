package it.schoolboard.sbapi.services.impl.generic;

import com.mongodb.client.gridfs.model.GridFSFile;
import it.schoolboard.sbapi.services.def.generic.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Service
@RequiredArgsConstructor
public class FileStorageServiceMongo implements FileStorageService {

    private final GridFsTemplate gridFsTemplate;
    @Override
    public String storePdf(MultipartFile file) {
        if (file.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if (!file.getContentType().equals("application/pdf")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        ObjectId fileId;
        try {
            fileId = gridFsTemplate.store(
                    file.getInputStream(),
                    file.getOriginalFilename(),
                    file.getContentType()
            );
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return fileId.toString();
    }

    @Override
    public GridFsResource getPdf(String fileId) {
        GridFSFile gridFSFile = gridFsTemplate.findOne(new Query().addCriteria(where("_id").is(fileId)));

        if (gridFSFile == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return gridFsTemplate.getResource(gridFSFile);
    }
}
