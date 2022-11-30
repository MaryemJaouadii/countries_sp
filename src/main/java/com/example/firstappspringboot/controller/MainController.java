package com.example.firstappspringboot.controller;

import com.example.firstappspringboot.domain.CustomEntity;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@CrossOrigin(origins = "*", allowedHeaders = "*")





@RestController
@RequestMapping
class CustomController {




    @GetMapping("/spain")
    public ResponseEntity<Map<String, Object>> getSpainData() throws IOException {
        ClassPathResource staticDataResource = new ClassPathResource("spain.json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(), StandardCharsets.UTF_8);
        return new ResponseEntity<>(
                new JSONObject(staticDataString).toMap(),
                HttpStatus.OK
        );
    }

        @GetMapping("/hungary")
    public ResponseEntity<Map<String, Object>> getHungaryData() throws IOException {
        ClassPathResource staticDataResource = new ClassPathResource("hungary.json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(), StandardCharsets.UTF_8);


        return new ResponseEntity<>(
                new JSONObject(staticDataString).toMap(),
                HttpStatus.OK
        );
    }
    @GetMapping("/poland")
    public ResponseEntity<Map<String, Object>> getPolandData() throws IOException {
        ClassPathResource staticDataResource = new ClassPathResource("poland.json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(), StandardCharsets.UTF_8);


        return new ResponseEntity<>(
                new JSONObject(staticDataString).toMap(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{country}/{id}")
    public ResponseEntity<?> getDataWithId(@PathVariable String id, @PathVariable String country) throws IOException {

        ClassPathResource staticDataResource = new ClassPathResource(country+".json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(),StandardCharsets.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();
        List<CustomEntity> list = new ArrayList<>();

        for (JsonNode node: objectMapper.readTree(staticDataString).get("data")
        ) {
            String lookedId1=node.get("id").toString().substring(1);
            String lookedId=lookedId1.substring(0, lookedId1.length() - 1);

            if (lookedId.equals(id)) {

                CustomEntity custom = objectMapper.convertValue(node, CustomEntity.class);
                list.add(custom);
            }
        }
        return ResponseEntity.ok(list);
    }







}


