package certificate_generator.controller;

import certificate_generator.dto.CertificateRequest;
import certificate_generator.service.CertificateService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping("/generate")
    public Map<String, Object> generate(
            @RequestBody CertificateRequest request) throws IOException {

        List<String> files = certificateService.generateCertificates(
                request.getEvent(),
                request.getRecipients()
        );

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Certificates generated successfully");
        response.put("count", files.size());
        response.put("files", files);

        return response;
    }
}