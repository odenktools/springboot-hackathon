package com.odenktools.springhackathon.controllers;

import com.odenktools.springhackathon.models.ApiKeyUsersEntity;
import com.odenktools.springhackathon.repositories.ApiKeyUsersRepository;
import com.odenktools.springhackathon.validators.ValidationErrorBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Calendar;

@RestController
@RequestMapping(path = "/apikey")
public class ApiKeyController {

    private ApiKeyUsersRepository apiKeyUsersRepository;

    @Autowired
    ApiKeyController(ApiKeyUsersRepository service) {
        this.apiKeyUsersRepository = service;
    }

    /*curl --request POST --url http://localhost:8080/apikey/add \
            --header 'content-type: application/json' \
            --d '{"secretKey":"sss", "keyCode": "aaaaaaaa"}'*/
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    ResponseEntity<?> create(@RequestBody @Valid ApiKeyUsersEntity todoEntry, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(ValidationErrorBuilder.fromBindingErrors(errors));
        }
        todoEntry.setIsActive(1);
        todoEntry.setCreatedAt(Calendar.getInstance());
        todoEntry.setUpdatedAt(Calendar.getInstance());
        apiKeyUsersRepository.save(todoEntry);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("messages", "Successfull saved");
        return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/addbody",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    ResponseEntity<?> search(
            @Valid @RequestBody ApiKeyUsersEntity apiKeyUsersEntity, Errors errors) {

        System.out.println("body in bytes: " + apiKeyUsersEntity.getKeyCode());

        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(ValidationErrorBuilder.fromBindingErrors(errors));
        }

        ApiKeyUsersEntity n = new ApiKeyUsersEntity();
        n.setKeyCode(apiKeyUsersEntity.getKeyCode());
        n.setSecretKey(apiKeyUsersEntity.getSecretKey());
        n.setIsActive(1);
        n.setCreatedAt(Calendar.getInstance());
        n.setUpdatedAt(Calendar.getInstance());

        apiKeyUsersRepository.save(n);

        return ResponseEntity.ok(n);
    }


    @GetMapping(path = "/add") // Map ONLY GET Requests
    public
    @ResponseBody
    String addNewUser(@RequestParam String keyCode
            , @RequestParam String secretKey) {

        ApiKeyUsersEntity n = new ApiKeyUsersEntity();
        n.setIsActive(1);
        n.setKeyCode(keyCode);
        n.setSecretKey(secretKey);
        n.setCreatedAt(Calendar.getInstance());
        n.setUpdatedAt(Calendar.getInstance());

        apiKeyUsersRepository.save(n);

        return "Saved";
    }

    //curl -X GET http://localhost:8080/apikey/all
    @GetMapping(path = "/all")
    public
    @ResponseBody
    Iterable<ApiKeyUsersEntity> getAllApi() {
        return apiKeyUsersRepository.findAll();
    }
}