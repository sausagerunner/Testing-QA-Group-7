/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.jxpath.ri.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TokenMgrErrorTest {

    // case 6
    @Test
    void testGetCharacter_ReturnsAssignedChar() throws NoSuchFieldException, IllegalAccessException {
        TokenMgrError token_mgr_error = new TokenMgrError();
        java.lang.reflect.Field field = TokenMgrError.class.getDeclaredField("character");
        field.setAccessible(true);

        field.set(token_mgr_error, 'X');
        assertEquals('X', token_mgr_error.getCharacter());
    }

    // case 7
    @Test
    void testGetPosition_ReturnsAssignedPos() throws NoSuchFieldException, IllegalAccessException {
        TokenMgrError token_mgr_error = new TokenMgrError();
        java.lang.reflect.Field field = TokenMgrError.class.getDeclaredField("position");
        field.setAccessible(true);

        field.set(token_mgr_error, 10);
        assertEquals(10, token_mgr_error.getPosition());
    }

    // case 8
    @Test
    void testGetMessage_ReturnsSuperMessage() throws NoSuchFieldException, IllegalAccessException {
        TokenMgrError token_mgr_error = new TokenMgrError("Lexical error", TokenMgrError.INVALID_LEXICAL_STATE);
        assertEquals("Lexical error", token_mgr_error.getMessage());
    }

    // case 9


    // case 10


    // case 11


    // case 12
    @Test
    void testAddEscapes_ConvertsControlChars() {
        String input = "\b\t\n\f\r\"\'\\";
        String expected = "\\b\\t\\n\\f\\r\\\"\\'\\\\";

        String result = TokenMgrError.addEscapes(input);

        assertEquals(expected, result);
    }


}
