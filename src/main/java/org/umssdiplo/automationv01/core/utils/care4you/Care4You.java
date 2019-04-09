package org.umssdiplo.automationv01.core.utils.care4you;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.care4you.home.Home;
import org.umssdiplo.automationv01.core.managepage.care4you.Incident.Incident;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.utils.WebUrls;

public final class Care4You {
    private Home home;
    private Incident incident;

    private Care4You() {
        home = new Home();
        incident = new Incident();
    }

    public static Care4You init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.CARE4YOU));
        return new Care4You();
    }

    public Home getHome() {
        return home;
    }

    public Incident getIncident() {
        return incident;
    }
}
