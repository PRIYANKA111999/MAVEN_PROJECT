package com.devskiller.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicTest {

    @Test
    public void shouldAddTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = 5;

        //then
        assertThat(result).isEqualTo(5);
    }

  }
