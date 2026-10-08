package certificate_generator.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CertificateService {

    public List<String> generateCertificates(
            String event,
            List<String> recipients) throws IOException {

        // Validate event
        if (event == null || event.isBlank()) {
            throw new IllegalArgumentException("Event name is required");
        }

        // Validate recipients
        if (recipients == null || recipients.isEmpty()) {
            throw new IllegalArgumentException(
                    "At least one recipient is required"
            );
        }

        // Create output folder
        File folder = new File("generated-certificates");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        List<String> generatedFiles = new ArrayList<>();

        // Generate certificate for each recipient
        for (String recipient : recipients) {

            if (recipient == null || recipient.isBlank()) {
                continue;
            }

            String safeName = recipient
                    .replaceAll("[^a-zA-Z0-9]", "_");

            String fileName = safeName + "_certificate.txt";

            File file = new File(folder, fileName);

            try (FileWriter writer = new FileWriter(file)) {

                writer.write("====================================\n");
                writer.write("     CERTIFICATE OF PARTICIPATION\n");
                writer.write("====================================\n\n");

                writer.write(
                        "This certificate is proudly presented to\n\n"
                );

                writer.write(
                        "             " + recipient + "\n\n"
                );

                writer.write(
                        "for participating in\n\n"
                );

                writer.write(
                        "             " + event + "\n\n"
                );

                writer.write("====================================\n");
            }

            generatedFiles.add(file.getPath());
        }

        return generatedFiles;
    }
}
