package ru.goods.review.market.api.url.generator;

import ru.goods.review.market.api.provider.APISettings;
import ru.goods.review.market.api.provider.Resource;
import sun.java2d.pipe.AlphaPaintPipe;
import sun.security.util.Resources_es;

import java.util.HashMap;
import java.util.Map;

/**
 * Artemij Chugreev
 * Date: 17.06.12
 * Time: 1:16
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public class ModelRequestBuilder extends RequestBuilder {

    public ModelRequestBuilder() {
        super();
    }

    public String urlForModelById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.MODEL.getName(), String.valueOf(id)},
                parameters);
    }

    public String urlForDetailsOnModelById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.MODEL.getName(), String.valueOf(id), Resource.DETAILS.getName()},
                parameters);
    }

    public String urlForOffersOnModelById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.MODEL.getName(), String.valueOf(id), Resource.OFFERS.getName()},
                parameters);
    }

    public String urlForOutletsOnModelById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.MODEL.getName(), String.valueOf(id), Resource.OUTLETS.getName()},
                parameters);
    }

}
