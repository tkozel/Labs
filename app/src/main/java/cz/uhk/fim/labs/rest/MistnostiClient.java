package cz.uhk.fim.labs.rest;

import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import cz.uhk.fim.labs.model.MistnostInfo;
import cz.uhk.fim.labs.model.MistnostiInfo;

/**
 * Created by tom on 01.03.18.
 */

@Rest(converters = MappingJackson2HttpMessageConverter.class)
public interface MistnostiClient {
    @Get("https://stag-demo.uhk.cz/ws/services/rest/mistnost/getMistnostiInfo?zkrBudovy=J&outputFormat=json")
    public MistnostiInfo[] getMistnosti();
}
