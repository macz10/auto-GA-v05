package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Adidas;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public final class LoadPage {
    public static Adidas loadPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Adidas();
    }

}
