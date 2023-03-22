package support_mobile;

import static support_mobile.World.*;

public class MapApiHelper {

    public void mapSummary(int pageCount, int limitValue, String order, String orderBy, String soilMoistureUnits) {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        String params = restAssuredHelper.limitPram(limitValue) + restAssuredHelper.pagePram(pageCount) + restAssuredHelper.userUnits() + restAssuredHelper.orderPram(order)
                + restAssuredHelper.ratioPrams() + restAssuredHelper.operationalPrams() + restAssuredHelper.orgPram() + restAssuredHelper.orderByPram(orderBy)
                + restAssuredHelper.soilMoistureUnitsPram(soilMoistureUnits) + restAssuredHelper.selectPram();
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/sites/summary" + params);
        System.out.println("Response is --> " + response.asString());
    }

    public void mapGrowingSeasonsOrgSpecific(int pageCount, int limitValue, String active) {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        String params = restAssuredHelper.limitPram(limitValue) + restAssuredHelper.pagePram(pageCount) + restAssuredHelper.orgPram() + restAssuredHelper.activeParam(active)
                + restAssuredHelper.gddUnitsParam() + restAssuredHelper.fieldsParam();
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/growing_seasons" + params);
        System.out.println("Response is --> " + response.asString());
    }

    public void mapGrowingSeasonsSiteSpecific(String active) {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        String params = restAssuredHelper.siteID() + restAssuredHelper.activeParam(active) + restAssuredHelper.ratioPrams() + restAssuredHelper.gddUnitsParam()
                + restAssuredHelper.fieldsParam() + restAssuredHelper.userUnits();
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/growing_seasons" + params);
        System.out.println("Response is --> " + response.asString());
    }
}
