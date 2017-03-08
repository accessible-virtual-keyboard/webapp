package no.ntnu.stud.avikeyb.webapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import no.ntnu.stud.avikeyb.backend.layouts.util.LayoutState;

import java.io.StringWriter;


public class LayoutStateConverter {

    public static String stateToJSON(LayoutState state) {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter w = new StringWriter();
        try {
            mapper.writeValue(w, state.getState());
        } catch (Exception e) {
            e.printStackTrace();

            throw new RuntimeException("Failed to convert the values to json");
        }
        return w.getBuffer().toString();
    }

}
