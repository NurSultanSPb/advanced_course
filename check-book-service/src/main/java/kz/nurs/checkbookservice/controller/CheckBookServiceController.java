package kz.nurs.checkbookservice.controller;

import kz.nurs.checkbookservice.model.RemotePropertyField;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckBookServiceController {
    private RemotePropertyField field;

    public CheckBookServiceController(RemotePropertyField field) {
        this.field = field;
    }

    @GetMapping(value = "/getRemoteField")
    public String getRemotePropertyField() {
        return "Data: " + field.getField();
    }
}

