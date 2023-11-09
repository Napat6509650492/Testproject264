package th.ac.tu.cs.services.model.Login;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthResponse {

    @JsonProperty("status")
    private boolean status;

    @JsonProperty("message")
    private String message;

    @JsonProperty("type")
    private String type;

    @JsonProperty("username")
    private String username;

    @JsonProperty("tu_status")
    private String tuStatus;

    @JsonProperty("statusid")
    private String statusId;

    @JsonProperty("displayname_th")
    private String displayNameTh;

    @JsonProperty("displayname_en")
    private String displayNameEn;

    @JsonProperty("email")
    private String email;

    @JsonProperty("department")
    private String department;

    @JsonProperty("faculty")
    private String faculty;

    public AuthResponse() {
    }

    public AuthResponse(boolean status, String message, String type, String username, String tuStatus, String statusId, String displayNameTh, String displayNameEn, String email, String department, String faculty) {
        this.status = status;
        this.message = message;
        this.type = type;
        this.username = username;
        this.tuStatus = tuStatus;
        this.statusId = statusId;
        this.displayNameTh = displayNameTh;
        this.displayNameEn = displayNameEn;
        this.email = email;
        this.department = department;
        this.faculty = faculty;
    }
}
