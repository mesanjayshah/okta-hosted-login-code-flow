package com.beyondid.data;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OktaUsers {

    @JsonProperty
    public String id;
    public String status;
    public String created;
    public String activated;
    public String statusChanged;
    public String lastLogin;
    public String passwordChanged;
    public List<String> groupIds;
    Options options;
    public String username;
    public String password;
    public String stateToken;

    Type type;
    Profile profile;
    Credentials credentials;
    Question question;

    public OktaUsers() {
    }


    public OktaUsers(String id, String status, String created, String activated, String statusChanged, String lastLogin, String passwordChanged, Type type, Profile profile, Credentials credentials, Question question, List<String> groupIds, Options options, String stateToken) {
        this.id = id;
        this.status = status;
        this.created = created;
        this.activated = activated;
        this.statusChanged = statusChanged;
        this.lastLogin = lastLogin;
        this.passwordChanged = passwordChanged;
        this.type = type;
        this.profile = profile;
        this.credentials = credentials;
        this.question = question;
        this.groupIds = groupIds;
        this.options = options;
        this.stateToken = stateToken;


    }

    public OktaUsers(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "OktaUsers{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", created='" + created + '\'' +
                ", activated='" + activated + '\'' +
                ", statusChanged='" + statusChanged + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                ", passwordChanged='" + passwordChanged + '\'' +
                ", type=" + type +
                ", profile=" + profile +
                ", credentials=" + credentials +
                ", question=" + question +
                ", groupIds=" + groupIds +
                ", options=" + options +
                ", username=" + username +
                ", password=" + password +
                ", stateToken=" + stateToken +
                '}';
    }


}
