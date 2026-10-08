package certificate_generator.dto;

import java.util.List;

public class CertificateRequest {

    private String event;
    private List<String> recipients;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }
}
