package dto;

import java.util.List;

public class RequestDTO {
    List<ContactDTO> contact;
    List<String> request;

    public List<ContactDTO> getContact() {
        return contact;
    }

    public void setContact(List<ContactDTO> contact) {
        this.contact = contact;
    }

    public List<String> getRequest() {
        return request;
    }

    public void setRequest(List<String> request) {
        this.request = request;
    }
}
