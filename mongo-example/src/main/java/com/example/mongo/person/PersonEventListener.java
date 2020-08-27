package com.example.mongo.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonEventListener extends AbstractMongoEventListener<Person> {

    @Override
    public void onBeforeSave(BeforeSaveEvent<Person> event) {
//        super.onBeforeSave(event);
        log.info("on before save: " + event.getDocument());
    }
}
