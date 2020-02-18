package com.fetch.pyramid.pyramidApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WordTest {

    Word testWord = new Word("as*");

    @Test
    void checkPyramidWord() {
        assertEquals(true, testWord.checkPyramidWord("banana"));
        assertEquals(false, testWord.checkPyramidWord("df"));
        assertEquals(false, testWord.checkPyramidWord(" df"));
        assertEquals(false, testWord.checkPyramidWord("bandana"));
        assertEquals(true, testWord.checkPyramidWord("bannna"));
    }

    @Test
    void isStringAlphabet() {

        assertEquals(false, testWord.isStringAlphabet("as*"));
        assertEquals(false, testWord.isStringAlphabet("*"));
        assertEquals(true, testWord.isStringAlphabet("as"));
        assertEquals(true, testWord.isStringAlphabet("asasasa"));
        assertEquals(false, testWord.isStringAlphabet(" "));
    }
}