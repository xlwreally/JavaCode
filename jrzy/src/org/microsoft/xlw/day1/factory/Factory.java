package org.microsoft.xlw.day1.factory;

import org.microsoft.xlw.day1.dao.proxy.PersonProxy;
import org.microsoft.xlw.day1.vo.Person;

import java.time.Instant;

public class Factory {
    public static PersonProxy Instant()
    {
        return new PersonProxy();
    }
}
