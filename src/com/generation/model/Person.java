package com.generation.model;

import java.util.Date;

abstract public class Person // abstract class so private details cant be seen besides
    //necessary infos
{
    private final String id;
    private final String name;
    private final String email;
    private final Date birthDate;

    protected Person( String id, String name, String email, Date birthDate )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    //getter and setter
    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    @Override
    public String toString()
    {
        return id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", birthDate=" + birthDate;
    }
}
