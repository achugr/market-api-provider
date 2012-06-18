package ru.goodsreview.api.provider;

/**
 * Artemij Chugreev
 * Date: 16.06.12
 * Time: 21:16
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public enum Resource {

    CHILDREN("children"),
    MODELS("models"),
    DETAILS("details"),
    OFFERS("offers"),
    OUTLETS("outlets"),
    OPINION("opinion"),
    SUGGEST("suggest"),
    FILTERS("filters");

    private final String resourceName;

    Resource(String resourceName){
        this.resourceName = resourceName;
    }

    public String getName(){
        return resourceName;
    }
}
