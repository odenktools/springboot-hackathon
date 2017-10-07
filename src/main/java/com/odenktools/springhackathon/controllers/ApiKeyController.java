package com.odenktools.springhackathon.controllers;

import com.odenktools.springhackathon.models.ApiKeyUsersEntity;
import com.odenktools.springhackathon.repositories.ApiKeyUsersRepository;
import com.odenktools.springhackathon.validators.ValidationErrorBuilder;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.ext.dynamicreg.server.request.JSONHttpServletRequestWrapper;
import org.apache.oltu.oauth2.ext.dynamicreg.server.request.OAuthServerRegistrationRequest;
import org.apache.oltu.oauth2.ext.dynamicreg.server.response.OAuthServerRegistrationResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    ResponseEntity<?> create(@Valid @ModelAttribute ApiKeyUsersEntity todoEntry, Errors errors) {
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

    /*@RequestMapping(value = "/edanpisan",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> createHotel(@Valid @ModelAttribute ApiKeyUsersEntity apiKeyUsersEntity, Errors errors,
                            HttpServletRequest request, HttpServletResponse response) throws OAuthSystemException {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(ValidationErrorBuilder.fromBindingErrors(errors));
        }

        OAuthServerRegistrationRequest oauthRequest = null;
        try {
            oauthRequest = new OAuthServerRegistrationRequest(new JSONHttpServletRequestWrapper(request));
            oauthRequest.getType();
            oauthRequest.discover();
            oauthRequest.getClientName();
            oauthRequest.getClientUrl();
            oauthRequest.getClientDescription();

        } catch (OAuthProblemException e) {
            OAuthResponse oAuthResponse = OAuthServerRegistrationResponse
                    .errorResponse(HttpServletResponse.SC_BAD_REQUEST)
                    .error(e)
                    .buildJSONMessage();
            return ResponseEntity.badRequest().body(oAuthResponse.getBody());
        }

        apiKeyUsersEntity.setIsActive(1);
        apiKeyUsersEntity.setCreatedAt(Calendar.getInstance());
        apiKeyUsersEntity.setUpdatedAt(Calendar.getInstance());
        ApiKeyUsersEntity createdHotel = this.apiKeyUsersRepository.save(apiKeyUsersEntity);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("messages", "Successfull saved");
        return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.CREATED);
    }*/

    @RequestMapping(value = "/edanpisan",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> createHotel(@Valid @RequestBody ApiKeyUsersEntity apiKeyUsersEntity, Errors errors,
                            HttpServletRequest request, HttpServletResponse response) throws OAuthSystemException {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(ValidationErrorBuilder.fromBindingErrors(errors));
        }

        OAuthServerRegistrationRequest oauthRequest = null;
        try {
            oauthRequest = new OAuthServerRegistrationRequest(new JSONHttpServletRequestWrapper(request));
            oauthRequest.getType();
            oauthRequest.discover();
            oauthRequest.getClientName();
            oauthRequest.getClientUrl();
            oauthRequest.getClientDescription();

        } catch (OAuthProblemException e) {
            OAuthResponse oAuthResponse = OAuthServerRegistrationResponse
                    .errorResponse(HttpServletResponse.SC_BAD_REQUEST)
                    .error(e)
                    .buildJSONMessage();
            return ResponseEntity.badRequest().body(oAuthResponse.getBody());
        }

        apiKeyUsersEntity.setIsActive(1);
        apiKeyUsersEntity.setCreatedAt(Calendar.getInstance());
        apiKeyUsersEntity.setUpdatedAt(Calendar.getInstance());
        ApiKeyUsersEntity createdHotel = this.apiKeyUsersRepository.save(apiKeyUsersEntity);

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