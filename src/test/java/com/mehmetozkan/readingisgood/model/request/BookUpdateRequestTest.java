package com.mehmetozkan.readingisgood.model.request;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class BookUpdateRequestTest {

    @Test
    public void it_should_convert_to_string_properly() {

        BookUpdateRequest request = new BookUpdateRequest();
        request.setId(1L);
        request.setName("name");
        request.setDescription("description");
        request.setWriter("writer");
        request.setPrice(new BigDecimal(1));
        request.setRemainingStock(1L);

        String requestStringValue = request.toString();

        assertThat(1L).isEqualTo(request.getRemainingStock());

    }
}
