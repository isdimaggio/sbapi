package it.schoolboard.sbapi.controllers.generic;

import it.schoolboard.sbapi.services.def.generic.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/files")
@RequiredArgsConstructor
public class FileStorageController {

    private final FileStorageService fileStorageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)  {
        return ResponseEntity.ok(fileStorageService.storePdf(file));
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable String id) throws IOException {
        GridFsResource pdfFile = fileStorageService.getPdf(id);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(pdfFile.getContentType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + pdfFile.getFilename() + "\"")
                .body(pdfFile.getInputStream().readAllBytes());
    }

}
