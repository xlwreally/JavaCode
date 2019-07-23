package org.microsoft.xlw.factory;


import org.microsoft.xlw.dao.proxy.PersonProxy;

public class Factory {
    public static PersonProxy Instant()
    {
        return new PersonProxy();
    }
}
