package org.stu.arch;

import org.junit.Test;
import org.sitemesh.builder.SiteMeshFilterBuilder;

public class DefaultSiteMeshFilterIT{
    @Test
    public void testCustomConfiguration() {
        SiteMeshFilterBuilder siteMeshFilterBuilder = new SiteMeshFilterBuilder();
        new DefaultSiteMeshFilter().applyCustomConfiguration(siteMeshFilterBuilder);
    }
}
