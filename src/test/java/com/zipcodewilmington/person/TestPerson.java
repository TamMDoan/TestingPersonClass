package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        assertEquals(expectedName, actualName);
        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        assertEquals(expectedAge, actualAge);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight(){
        Person person = new Person();
        int expected = 180;
        person.setHeight(expected);

        assertEquals(expected, person.getHeight());

    }

    @Test
    public void testSetWeight(){
        Person person = new Person();
        int expected = 180;
        person.setWeight(expected);

        assertEquals(expected, person.getWeight());
    }

    @Test
    public void testSetNickname(){
        Person person = new Person();
        String expected = "Maru";
        person.setName(expected);

        assertEquals(expected, person.getName());
    }

    @Test
    public void testSetHowManySiblings(){
        Person person = new Person();
        int expected = 4;
        person.setHowManySiblings(expected);

        assertEquals(expected, person.getHowManySiblings());
    }

    @Test
    public void testOldestChild(){
        Person person = new Person();
        boolean expected = true;
        person.setOldestChild(expected);

        assertEquals(expected, person.getOldestChild());
    }
}
