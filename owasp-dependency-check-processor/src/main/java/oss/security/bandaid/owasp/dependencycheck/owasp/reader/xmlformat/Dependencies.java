package oss.security.bandaid.owasp.dependencycheck.owasp.reader.xmlformat;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * Created by 0x442E472E on 25.05.2017.
 */
public class Dependencies {
    @JacksonXmlElementWrapper(useWrapping=false)
    public List<Dependency> dependency;
}
