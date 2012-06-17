package ru.goods.review.market.api.provider;

/**
 * Artemij Chugreev
 * Date: 16.06.12
 * Time: 21:16
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public enum Resource {

    CATEGORY("category"),
    CHILDREN("children"),
    MODELS("models"),
    MODEL("model"),
    DETAILS("details"),
    OFFERS("offers"),
    OUTLETS("outlets"),
    OFFER("offer"),
    SHOP("shop"),
    OPINION("opinion"),
    GEOREGION("georegion"),
    SUGGEST("suggest"),
    VENDOR("vendor"),
    SEARCH("search"),
    FILTER("filter"),
    FILTERS("filters");

    private final String resourceName;

    Resource(String resourceName){
        this.resourceName = resourceName;
    }

    public String getName(){
        return resourceName;
    }
}
